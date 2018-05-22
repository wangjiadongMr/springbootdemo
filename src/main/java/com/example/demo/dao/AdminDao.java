package com.example.demo.dao;

import com.example.demo.model.Admin;
import com.example.demo.model.Teacher;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author wang
 * @data on 2018/5/2
 */

@Repository
public interface AdminDao {

    @Select("select * from admin")
    Admin  getAdmin();
    @Select("select pwd from admin where name=#{name}")
    String queryPwd(String name);
    @Update("update teacher set pwd=#{pwd} where id=#{id}")
    void modifyPwd(int id,String pwd);
    @Delete("delete from teacher where id=#{id}")
    void deleteTeacher(@Param("id") int id);

    @Insert("insert into admin(pwd,name) values(#{pwd},#{name})")
    void add( @Param("pwd")String pwd,@Param("name")String name);
    @Select("select id,phone,pwd,name from teacher ")
    List<Teacher>  listTeacher();
}
