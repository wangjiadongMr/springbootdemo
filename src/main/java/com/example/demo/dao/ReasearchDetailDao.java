package com.example.demo.dao;

import com.example.demo.model.ResearchDetail;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ReasearchDetailDao {

    @Select("select * from researchdetail where teacherid=#{teacherid}")
    List< ResearchDetail> listResearchInfo(int teacherid);

}
