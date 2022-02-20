package com.cusehack.safe_home.dao;

import com.cusehack.safe_home.dao.beans.User;
import com.cusehack.safe_home.dao.mapper.UserMapper;

public class LoginDAOImpl implements LoginDAO{
    private final UserMapper userMapper;

    public LoginDAOImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public User retrieveUser(String userName) {
        return userMapper.selectUserByName(userName);
    }

}
