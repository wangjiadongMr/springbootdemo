package com.example.demo.dao;

import com.example.demo.model.CrossProject;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author wang
 * @data on 2018/5/4
 */

@Repository
public interface CrossProjectDao {

    @Select("select * from crossproject limit 10")
    List<CrossProject> listCroProject();

}
