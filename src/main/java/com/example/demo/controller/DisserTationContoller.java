package com.example.demo.controller;

import com.example.demo.dao.DissertationDao;
import com.example.demo.model.Dissertation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wang
 * @data on 2018/5/4
 */
@RestController
@RequestMapping("/diss")
public class DisserTationContoller {

    @Autowired
    private DissertationDao dDao;

    @RequestMapping("/list")
    public Map<String,Object> listDiss(){
        Map<String, Object> map = new HashMap<>();
        try {
            List<Dissertation>  listDisser = dDao.listDisser();
            if(listDisser.size()>0&& listDisser !=null){
                map.put("date", listDisser);
                map.put("message","获取成功");
                return map;
            }else {
                map.put("message", "没有数据");
                map.put("state", 0);
                return map;
            }

        }catch (Exception e){

            e.printStackTrace();
            map.put("message", "Error");
            map.put("state", 0);
            return map;
        }
    }

}
