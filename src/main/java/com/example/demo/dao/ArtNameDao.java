package com.example.demo.dao;

import com.example.demo.model.ArtName;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ArtNameDao {

    @Select("select * from artname limit 10")
    List<ArtName> listArtName();

    @Select("select *  from artname where id =#{id} ")
    ArtName queryArtById(int id);

    @Select("select a.aname,a.worker,a.publictime,a.inspstate ,t.artclassname from artname as a join artclass as t on a.artclassid = t.artid where a.id=#{id}")
    ArtName queryInfo(int id);

    @Update("update artname set aname=#{aname},publictime=#{publicTime},worker=#{worker},inspstate=#{inspstate},artclaid=#{artclasid} where id=#{id}")
    void updateArtName(String aname,String publicTime,String worker,int inspstate,int artclasid,int id);

    @Delete("delete artname where id=#{id}")
    void deleteArt(int id);


    /**
     * 暂时没有完成。
     * @param aName
     * @param worker
     * @param publicTime
     * @param artClassid
     */
    @Insert("insert into artname (aname,worker,publictime,inspstate,artclassid)values(" +
            ")")
    void addArt(String aName,String worker,String publicTime,int artClassid);
}
