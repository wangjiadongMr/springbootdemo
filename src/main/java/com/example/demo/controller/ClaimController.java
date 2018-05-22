package com.example.demo.controller;

import com.example.demo.dao.ClaimDao;
import com.example.demo.model.Claim;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/claim")
public class ClaimController {

    @Autowired
    private ClaimDao claimDao;


    @RequestMapping("/claiminfo")
    public List<Claim> listInfo(@RequestBody Map<String,Object> param) {
        String name = param.get("name").toString();
        try {
            if (name != null && name.length() != 0) {
                List<Claim> list = claimDao.listClaim(name);
                if (list.size() != 0) {
                    return list;
                }
            }
        } catch (Exception e) {

            throw new RuntimeException(e.getMessage());
        }
        return null;
    }

    /**
     * 新增
     * @return
     */
    @RequestMapping("/add")
    public Map<String, Object> addClaim() {

        //String title, String perName,
        //                                        String recordName, String personName, String type
      String  title = "sss";
      String   perName = "dddd";
      String   recordName = "dddsss";
      String   personName = "我也不知道什么名字好";
      String   type = "飒飒";
        Map<String, Object> map = new HashMap<>();
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-ss HH:mm:ss");
        String strTime = sdf.format(date);
        try {
            claimDao.addClaim(title, perName, recordName, strTime, personName, strTime, type);
            map.put("state", 1);
            map.put("message", "添加成功");
            return map;
        } catch (Exception e) {
            e.printStackTrace();
            map.put("message", "添加失败");
            map.put("state", 0);
            return map;
        }
    }

}
