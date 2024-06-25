package com.study._06_jdbc.jdbc;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MyDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<MyDTO> list(){
        String query = "select * from mybbs1 order by id desc";
        List<MyDTO> list = jdbcTemplate.query(query, new BeanPropertyRowMapper<>(MyDTO.class));
        return list;
    }

}
