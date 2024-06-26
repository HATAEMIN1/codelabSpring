package com.study.spring.dao;

import com.study.spring.dto.MyBbsDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface IMyBbsDao {
    public List<MyBbsDto> listDao();

    public MyBbsDto viewDao(String id);

    public int writeDao(String writer, String title, String content);

    public int deleteDao(@Param("_id") String id);
}
