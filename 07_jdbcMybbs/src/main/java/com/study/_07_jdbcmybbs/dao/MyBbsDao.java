package com.study._07_jdbcmybbs.dao;

import com.study._07_jdbcmybbs.dto.MyBbsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MyBbsDao implements IMyBbsDao{

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<MyBbsDto> listDao() {
        String query = "select * from mybbs1 order by id desc";
        List<MyBbsDto> dtos = jdbcTemplate.query(query, new BeanPropertyRowMapper<>(MyBbsDto.class));
        return dtos;
    }

    @Override
    public MyBbsDto viewDao(int id) {
        String query = "select * from mybbs1 where id ="+id;
        MyBbsDto dto = jdbcTemplate.queryForObject(query, new BeanPropertyRowMapper<>(MyBbsDto.class));
        return dto;
    }

    @Override
    public int writeDao(String writer, String title, String content) {
        return 0;
    }

    @Override
    public int deleteDao(int id) {
        return 0;
    }
}
