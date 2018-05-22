package com.example.demo.controller;

import com.example.demo.dao.CrossProjectDao;
import com.example.demo.dao.ProjectLongitudinalDao;
import com.example.demo.model.CrossProject;
import com.example.demo.model.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wang
 * @data on 2018/5/4
 */
@RestController
@RequestMapping("/pro")
public class ProjectController {

    @Autowired
    private CrossProjectDao crossProjectDao;
    @Autowired
    private ProjectLongitudinalDao plDao;


    @RequestMapping("/cross")
    public List<CrossProject> listCroInfo() {

        try {
            List<CrossProject> list = crossProjectDao.listCroProject();
            if (list != null && list.size() > 0) {
                return list;
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("出错");
        }
        return null;
    }


    @RequestMapping("/proLon")
    public List<Project> listLonginfo() {

        Map<String, Object> map = new HashMap<>();

        try {
            List<Project> list = plDao.listProject();
            if (list != null && list.size() > 0) {

                return list;
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("出错");
        }
        return null;
    }
}
