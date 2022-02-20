package com.cusehack.safe_home.service;

import com.cusehack.safe_home.dao.LoginDAOImpl;
import com.cusehack.safe_home.dao.beans.User;
import com.cusehack.safe_home.dao.mapper.UserMapper;

public class LoginServiceImpl implements LoginService{
    private final LoginDAOImpl loginDAO;
    private UserMapper userMapper;

    public LoginServiceImpl(UserMapper userMapper) {
        loginDAO = new LoginDAOImpl(userMapper);
    }
    @Override
    public long userLogin(String userName, String password) {
        User user = loginDAO.retrieveUser(userName);
        if (user != null && password.equals(user.getPassword()))
            return user.getUid();
        else
            return -1;
    }
}
