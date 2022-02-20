package com.cusehack.safe_home.dao;

import com.cusehack.safe_home.dao.beans.User;
import com.cusehack.safe_home.dao.mapper.UserMapper;

public class UserDAOImpl implements UserDAO {
    private final UserMapper userMapper;

    public UserDAOImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public User retrieveUser(String userName) {
        return userMapper.selectUserByName(userName);
    }

    @Override
    public long createUser(String userName, String password, long uid, long honestyId) {
        User user = new User(uid, userName, password, honestyId);
        userMapper.insertUser(user);

        return uid;
    }

    public long retrieveMaxUid() {
        return userMapper.selectMaxUid();
    }

}
