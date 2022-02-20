package com.cusehack.safe_home.service;

import com.cusehack.safe_home.dao.RegisterDAOImpl;
import com.cusehack.safe_home.dao.mapper.UserMapper;

public class RegisterServiceImpl implements RegisterService{
    private final RegisterDAOImpl registerDAO;

    public RegisterServiceImpl(UserMapper userMapper) {
        registerDAO = new RegisterDAOImpl(userMapper);
    }

    @Override
    public long userRegister(String userName, String password) {
        return registerDAO.createUser(userName, password, generateUid());
    }

    private long generateUid() {
        return registerDAO.retrieveMaxUid() + 1;
    }
}
