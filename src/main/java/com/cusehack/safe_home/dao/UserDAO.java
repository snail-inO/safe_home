package com.cusehack.safe_home.dao;

import com.cusehack.safe_home.dao.beans.User;

public interface UserDAO {
    User retrieveUser(String userName);
    long createUser(String userName, String password, long uid, long honestyId);
    long retrieveMaxUid();
}
