package com.example.demo.controller;

import com.example.demo.dao.AdminDao;
import com.example.demo.dao.TeacherDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wang
 * @data on 2018/5/3
 */

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private AdminDao adminDao;

    @Autowired
    private TeacherDao teacherDao;

    @RequestMapping("/log")
    public Map<String,Object> login(String tel,String pwd){

        Map<String, Object> map = new HashMap<>();

        if(tel.length() !=11){
            String dbpwd = adminDao.queryPwd(tel);
            if(dbpwd.equals(pwd)){
                map.put("state", 1);
                map.put("message", "登录成功");
                return map;

            }else {
                map.put("state", 0);
                map.put("message","登录失败");
                return map;
            }

        }else {

            String dbPwd = teacherDao.queryPwdByPhone(tel);
            if(dbPwd.equals(pwd)){
                map.put("state", 1);
                map.put("messge", "登录成功");
                return map;
            }else {
                map.put("state", 0);
                map.put("messge", " 登录失败");
                return map;
            }
        }
    }
}
