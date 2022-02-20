package com.cusehack.safe_home.service;

import com.cusehack.safe_home.dao.UserDAOImpl;
import com.cusehack.safe_home.dao.beans.User;
import com.cusehack.safe_home.dao.mapper.UserMapper;

public class LoginServiceImpl implements LoginService{
    private final UserDAOImpl userDAO;
    private UserMapper userMapper;

    public LoginServiceImpl(UserMapper userMapper) {
        userDAO = new UserDAOImpl(userMapper);
    }
    @Override
    public long userLogin(String userName, String password) {
        User user = userDAO.retrieveUser(userName);
        if (user != null && password.equals(user.getPassword()))
            return user.getUid();
        else
            return -1;
    }
}
