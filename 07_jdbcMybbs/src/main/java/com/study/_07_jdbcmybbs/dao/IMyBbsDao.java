package com.study._07_jdbcmybbs.dao;

import com.study._07_jdbcmybbs.dto.MyBbsDto;

import java.util.List;

public interface IMyBbsDao {
    public List<MyBbsDto> listDao();

    public MyBbsDto viewDao(int id);

    public int writeDao(String writer, String title, String content);

    public int deleteDao(int id);
}
