package com.example.demo.dao;

import com.example.demo.model.Project;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author li
 * @data on 2018/5/2
 */

@Repository
public interface ProjectLongitudinalDao {

    @Select("select * from project limit 10")
    List<Project> listProject();

}
