package com.study.spring.jdbc;

import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface IDao {
    ArrayList<UserDTO> getOrder();
}
