package com.groot.mappers;

import com.groot.pojo.User;

public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);
}