package com.cusehack.safe_home.dao.mapper;

import com.cusehack.safe_home.dao.beans.User;
import com.cusehack.safe_home.dao.sqlbuilder.UserSQLBuilder;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {
    @InsertProvider(value = UserSQLBuilder.class, method = "insertUser")
    void insertUser(User user);
    @UpdateProvider(value = UserSQLBuilder.class, method = "updateUser")
    void updateUser(User user);
    @SelectProvider(value = UserSQLBuilder.class, method = "selectUserByName")
    User selectUserByName(final String userName);
    @SelectProvider(value = UserSQLBuilder.class, method = "selectMaxUid")
    long selectMaxUid();
    @DeleteProvider(value = UserSQLBuilder.class, method = "deleteUserByName")
    void deleteUserByName(final String userName);
}
