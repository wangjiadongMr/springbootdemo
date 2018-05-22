package com.example.demo.dao;

import com.example.demo.model.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author wang
 * @data on 2018/5/2
 */

@Repository
public interface TeacherDao {

    @Select("select * from teacher where id= #{id}")
    Teacher queryTeacherById(int id);

    @Select("SELECT t.id,t.name,t.age,t.educational,t.mail,t.phone,t.sex,w.wname,w.wid from teacher as t JOIN workplace  as w on t.workId = w.wid\n" +
            "WHERE t.id=#{id}")
    Teacher queryTeacherInfo(int id);

    @Select("select pwd from teacher where id =#{id}")
    String queryPwdById(int id);

    @Select("update teacher set pwd=#{newPwd} where id=#{id}")
    void modifyPwd(@Param("newPwd")String newPwd, @Param("id")int id);

    @Select("select * from teacher where name=#{name}")
    Teacher queryTeacherByName(String name);

    @Select("select pwd from teacher where phone=#{phone}")
    String queryPwdByPhone(String phone);
}
