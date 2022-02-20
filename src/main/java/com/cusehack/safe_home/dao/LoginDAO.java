package com.cusehack.safe_home.dao;

import com.cusehack.safe_home.dao.beans.User;

public interface LoginDAO {

    User retrieveUser(String userName);
}
