package com.example.demo.controller;

import com.example.demo.dao.ArtNameDao;
import com.example.demo.dao.TeacherDao;
import com.example.demo.model.ArtName;
import com.example.demo.model.Teacher;
import com.example.demo.util.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/art")
public class ArtNameController {

    @Autowired
    private ArtNameDao artNameDao;
    @Autowired
    private TeacherDao teacherDao;


    /**
     * 著作成果
     * @return
     */
    @RequestMapping("/artinfo")
    public List<Map<String, Object>> listArtInfo() {

        List list = new ArrayList();
        Map<String, Object> map;
        try {
            List<ArtName> artList = artNameDao.listArtName();
            for (ArtName artName : artList) {
                map = new HashMap<>();
                Teacher teacher = teacherDao.queryTeacherByName(artName.getWorker());
                Teacher t = teacherDao.queryTeacherInfo(teacher.getId());
                artName.setWorkerSpace(t.getwName());
                ArtName a = artNameDao.queryInfo(artName.getId());
                artName.setArtClassName(a.getArtClassName());
                map.put("data", artName);
                list.add(map);
            }
            return list;
        } catch (Exception e) {
            throw new RuntimeException("出错");
        }
    }

    /**
     * 编辑著作
     * @param aname
     * @param publicTime
     * @param worker
     * @param insp
     * @param artCla
     * @param id
     * @return
     */
    @RequestMapping("/edit")
    public Map<String, Object> editAtrName(String aname, String publicTime, String worker,
                                           String insp, String artCla, int id) {

        Map<String, Object> map = new HashMap<>();
        try {
            int inspState = 0;
            int artid = 0;
            if (insp.equals("未通过")) {
                inspState = 0;
            }
            if (insp.equals("待审核")) {
                inspState = 2;
            }
            if (insp.equals("通过")) {
                inspState = 1;
            }

            if (artCla.equals("科研")) {
                artid = 1;
            }
            if (artCla.equals("学术")) {
                artid = 2;
            }

            artNameDao.updateArtName(aname, publicTime, worker, inspState, artid, id);
            map.put("state", 1);
            map.put("message", "更新成功");
            return map;
        } catch (Exception e) {
            map.put("message", e.getMessage());
            map.put("state", 0);
            return map;
        }
    }

    /**
     * 删除著作
     * @param
     * @return
     */
    @RequestMapping("/dele")
    public List<Object> delete(@RequestBody Map<String,Object> param) {

        int id = Integer.parseInt(param.get("id").toString());
        Map<String, Object> map = new HashMap<>();
        List<Object> list = new ArrayList<>();
        try {
            if (id < 0) {
                map.put("state", 0);
                map.put("message", "没有这样的编号");
                list.add(map);
                return list;
            }
            artNameDao.deleteArt(id);
            map.put("state", 1);
            map.put("message", "删除成功");
           List listArt =  listArtInfo();
           listArt.add(map);
           return listArt;
        } catch (Exception e) {
            throw new RuntimeException("出错");
        }
    }

    /**
     * 新增
     * @param aName
     * @param worker
     * @param artClassid
     * @return
     */
    @RequestMapping("/add")
    public Map<String,Object> addArt(String aName,String worker,int artClassid){
        Map<String, Object> map = new HashMap<>();
        try {
            artNameDao.addArt(aName,worker,Utils.getCurrent(),artClassid);
            map.put("state",0);
            map.put("message", "添加成功");
            return map;
        }catch (Exception e){
            e.printStackTrace();
            map.put("state", 0);
            map.put("message", "添加失败");
            return map;
        }
    }

}
