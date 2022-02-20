package com.cusehack.safe_home.dao;

public interface RegisterDAO {
    long createUser(String userName, String password, long uid);
    long retrieveMaxUid();
}
