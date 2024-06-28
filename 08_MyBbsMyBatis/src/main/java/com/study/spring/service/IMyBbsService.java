package com.study.spring.service;

import com.study.spring.dto.MyBbsDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface IMyBbsService {
    public List<MyBbsDto> list();

    public MyBbsDto view(String id);

    public int write(String writer, String title, String content);

    public int delete(@Param("_id") String id);

}
