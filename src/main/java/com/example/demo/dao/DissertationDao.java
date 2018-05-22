package com.example.demo.dao;

import com.example.demo.model.Dissertation;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author wang
 * @data on 2018/5/4
 */
@Repository

public interface DissertationDao {

    @Select("select d.insid,d.title,d.firstwriter,d.publishtime,d.bat,d.percla,d.state,d.allwriter,c.cluname " +
            "from dissertation as d join cluster as c on d.clusterid = c.id limit 10")
    List<Dissertation> listDisser();
    @Delete("delete dissertation where id =#{id}")
    void deleteDiss(int id);

    @Update("update dissertation set insid=1,title=#{title},firstwriter=#{fwriter},publishtime=#{publishTime}," +
            "bat=#{bat},percla=#{percla},state=0,allwriter=#{allwriter},clusterid=1 where id=#{id}")
    void editDiss(String title,String fwriter,String publishTime,String bat,String percla,String allwriter,int id);

    /**
     *  添加论文
     * @param insid
     * @param title
     * @param firstwriter
     * @param publishTime
     * @param percla
     * @param allwriter
     * @param clusterid
     */
    @Insert("insert into dissertation (insid,title,firstwriter,publishtime,percla,allwriter,clusterid)values(" +
            "#{insid},#{title},#{fidrstWriter},#{publishTime}" +
            "#{percla},#{allwriter},#{clusterid})")
    void addDisser(@Param("insid") int insid, @Param("title") String title,
                   @Param("firstwriter") String firstwriter, @Param("publishTime") String publishTime,
                   @Param("percla") String percla, @Param("allwriter") String allwriter,
                   @Param("clusterid") int clusterid);
}
