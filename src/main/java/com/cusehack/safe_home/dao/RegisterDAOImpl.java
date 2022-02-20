package com.cusehack.safe_home.dao;

import com.cusehack.safe_home.dao.beans.User;
import com.cusehack.safe_home.dao.mapper.UserMapper;

public class RegisterDAOImpl implements RegisterDAO {
    private final UserMapper userMapper;

    public RegisterDAOImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public long createUser(String userName, String password, long uid) {
        User user = new User(uid, userName, password);
        userMapper.insertUser(user);

        return uid;
    }

    public long retrieveMaxUid() {
        return userMapper.selectMaxUid();
    }
}
