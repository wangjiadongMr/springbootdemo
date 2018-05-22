package com.example.demo.controller;

import com.example.demo.dao.ReasearchDetailDao;
import com.example.demo.model.ResearchDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/detail")
public class ReasearchDetailController {

    @Autowired
    private ReasearchDetailDao redDao;

    @RequestMapping("/list")
    public List<ResearchDetail> listRea(@RequestBody Map<String,Object> param){
        int teacherid = Integer.parseInt(param.get("teacherid").toString());
        try {
            List<ResearchDetail> list = redDao.listResearchInfo(teacherid);
            if(list.size()>0){
                return list;
            }else {
                return null;
            }
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("出错了");
        }
    }
}
