package com.example.demo.dao;

import com.example.demo.model.Claim;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClaimDao {

    @Select("select * from claim where personname=#{name}")
    List<Claim> listClaim(String name);

    @Select("select * form claim limit 10")
    List<Claim> listClaimInfo();

    /**
     * 添加论文认领
     * @param title
     * @param perName
     * @param recordName
     * @param publishTime
     * @param personName
     * @param claimTime
     * @param type
     */
    @Insert("insert into claim (title,pername,recordname,publishtime,personname,claimtime," +
            ",type) values (#{title},#{perName},#{recordName},#{publishTime}," +
            "#{personName},#{claimTime},#{type})")


    void addClaim(@Param("title")String title,@Param("pername")String perName,@Param("recordname")String recordName,
                  @Param("publishtime") String publishTime,@Param("personname") String personName,
                  @Param("claimtime") String claimTime,@Param("type") String type);

    @Update("update claim set title=#{title},pername=#{perName},recordname=#{recordName}," +
            "personname=#{personName},claimtime=#{claimTime},state=#{state},type=#{type}")
    void updateClaim(String title, String perName, String recordName, String personName, String claimTime, int state, String type);

    @Delete("dalete claim where id=#{id}")
    void deleteClaim(int id);
}
