package com.example.demo.controller;

import com.example.demo.dao.TeacherDao;
import com.example.demo.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private TeacherDao teacherDao;

    @RequestMapping(value = "/info",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> queryTeacherInfo(@RequestBody Map<String,Object> param) {
        int id  = Integer.parseInt(param.get("id").toString());
        Map<String, Object> map = new HashMap<>();
        try {
            if (id < 0) {
                map.put("message", "没有这样的编号");
                return map;
            }
            Teacher teacher = teacherDao.queryTeacherInfo(id);
            if (teacher == null) {
                map.put("message", "没有此老师的信息");
                map.put("state", 0);
                return map;
            }
            map.put("state", 1);
            map.put("data", teacher);
            return map;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }


    @RequestMapping("/modifyPwd")
    public Map<String ,Object> modifyPwd(@RequestBody Map<String,Object> param){

        System.out.println(param);

        int id = Integer.parseInt(param.get("id").toString());
        String newPwd = param.get("newPwd").toString();
        String oldPwd = param.get("oldPwd").toString();
        Map<String, Object> map = new HashMap<>();
        try{
            if(id<0){
                map.put("messgae", "没有这样的编号");
                return map;
            }
            Teacher teacher = teacherDao.queryTeacherById(id);
            if(teacher ==null){
                map.put("message", "没有此老师的信息");
                map.put("state", 0);
            }
            String dbPwd = teacherDao.queryPwdById(id);
            if(!oldPwd.equals(dbPwd)){
                map.put("state", 0);
                map.put("message","原来密码输入不对，请重新输入");
                return map;
            }
            teacherDao.modifyPwd(newPwd,id);
            map.put("state", 1);
            map.put("data","你已经成功更改密码");
            return map;
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }

}
