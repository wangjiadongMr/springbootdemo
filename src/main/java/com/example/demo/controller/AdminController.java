package com.example.demo.controller;

import com.example.demo.dao.AdminDao;
import com.example.demo.dao.TeacherDao;
import com.example.demo.model.Admin;
import com.example.demo.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wang
 * @data on 2018/5/2
 */

@RestController
@RequestMapping("/")
public class AdminController {
    @Autowired
    private AdminDao adminDao;
    @Autowired
    private TeacherDao teacherDao;

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public Admin getData(@RequestBody Map<String, Object> map) {

        Admin admin = adminDao.getAdmin();
        return admin;
    }

    @RequestMapping("/modify")
    public Map<String, Object> modifyTeacherPwd(int id, String pwd, String name) {
        Map<String, Object> map = new HashMap<>();
        try {
            if (pwd != null || pwd.length() == 0) {
                map.put("state", 0);
                map.put("message", "不可以这样设置密码");
                return map;
            }
            if (!name.equals("admin")) {
                map.put("state", 3);
                map.put("message", "没有该权限");
                return map;
            }

            Teacher teacher = teacherDao.queryTeacherById(id);

            if (teacher == null) {
                map.put("state", 0);
                map.put("message", "没有此老师账号");
                return map;
            }

            adminDao.modifyPwd(id, pwd);
            map.put("state", 1);
            map.put("message", "修改密码成功");
            return map;
        } catch (Exception e) {
            map.put("state", 0);
            map.put("message", "ERROR!");
            return map;
        }
    }

    @RequestMapping("/delete")
    public Map<String, Object> deleteTeacher(@RequestBody Map<String,Object> param) {

        String name = param.get("name").toString();
        int id = Integer.parseInt(param.get("id").toString());
        Map<String, Object> map = new HashMap<>();

        try {
            Teacher teacher = teacherDao.queryTeacherById(id);
            if (teacher == null) {
                map.put("state", 0);
                map.put("message", "没有此账号");
                return map;
            }
            adminDao.deleteTeacher(id);
            map.put("state", 1);
            map.put("message", "删除成功");
            return map;
        } catch (Exception e) {
            e.printStackTrace();
            map.put("state", 0);
            map.put("message", "Error");
            return map;
        }
    }

    @RequestMapping("/add")
    public Map<String, Object> add() {
        Map<String, Object> map = new HashMap<>();
        String pwd = "11111";
        String name = "ssss";
        try {
            adminDao.add(pwd,name);
            map.put("message", "success");
            map.put("state", 1);
            return map;
        }catch (Exception e){
            e.printStackTrace();
            map.put("state", 0);
            map.put("message", "添加失败");
            return map;
        }

    }

    @RequestMapping("/list")
    public List<Teacher> listUserInfo(){

        try {

        List<Teacher> listinfo = adminDao.listTeacher();
        return listinfo;
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("出错了");
        }

    }

}
