package com.cusehack.safe_home.service;

import com.cusehack.safe_home.constant.HonestyLevelLevelEnum;
import com.cusehack.safe_home.dao.HonestyDAOImpl;
import com.cusehack.safe_home.dao.UserDAOImpl;
import com.cusehack.safe_home.dao.beans.Honesty;
import com.cusehack.safe_home.dao.mapper.HonestyMapper;
import com.cusehack.safe_home.dao.mapper.UserMapper;

public class RegisterServiceImpl implements RegisterService{
    private final UserDAOImpl userDAO;
    private final HonestyDAOImpl honestyDAO;

    public RegisterServiceImpl(UserMapper userMapper, HonestyMapper honestyMapper) {
        userDAO = new UserDAOImpl(userMapper);
        honestyDAO = new HonestyDAOImpl(honestyMapper);
    }

    @Override
    public long userRegister(String userName, String password) {
        return userDAO.createUser(userName, password, generateUid(), generateHonesty());
    }

    private long generateHonesty() {
        long id = generateHonestyId();
        Honesty honesty = new Honesty(id, HonestyLevelLevelEnum.HONEST_LEVEL2.getLevel(), 0, 0,
                HonestyLevelLevelEnum.HONEST_LEVEL2.getScore());
        honestyDAO.createHonesty(honesty);

        return id;
    }

    private long generateUid() {
        return userDAO.retrieveMaxUid() + 1;
    }

    private long generateHonestyId() {
        return honestyDAO.retrieveMaxHonestyId() + 1;
    }
}
