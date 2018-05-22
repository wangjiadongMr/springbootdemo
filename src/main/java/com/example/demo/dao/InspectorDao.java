package com.example.demo.dao;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

/**
 * @author wang
 * @data on 2018/5/4
 */

@Repository
public interface InspectorDao {

    @Update("update project set pstate=#{state} where id=#{projectId}")
    void updateProject(int projectId,int state);

    @Select("select * from inspector where id=#{id}")
    String queryInsectorById(int id);

    @Update("update researchdetail set inspstate=#{state} where id=#{id}")
    void insecReasearchDail(int id,int state);

    @Update("update crossproject set state=#{state} where id = #{id}")
    void inspecCroPro(int id,int state);
}
