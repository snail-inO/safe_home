package com.cusehack.safe_home.dao.sqlbuilder;

import org.apache.ibatis.jdbc.SQL;

public class UserSQLBuilder {
    private static final String USER_TB = "user_tb";

    public String insertUser() {
        return new SQL() {
            {
                INSERT_INTO(USER_TB);
                VALUES("uid, user_name, password, phone, email, is_authenticated, honesty_id, role_id",
                        "#{uid}, #{userName}, #{password}, #{phone}, #{email}, #{isAuthenticated}, #{honestyId}, " +
                                "#{roleId}");
            }
        }.toString();
    }

    public String updateUser() {
        return new SQL() {
            {
                UPDATE(USER_TB);
                SET("uid = #{uid}, user_name = #{userName}, password = #{password}, phone = #{phone}, email = #{email}," +
                        "is_authenticated = #{isAuthenticated}, honesty_id = #{honestyId}, role_id = #{roleId}");
                WHERE("user_name = #{userName}");
            }
        }.toString();
    }

    public String selectUserByName(final String userName) {
        return new SQL() {
            {
                SELECT("*");
                FROM(USER_TB);
                WHERE("user_name = #{userName}");
            }
        }.toString();
    }

    public String selectMaxUid() {
        return new SQL() {
            {
                SELECT("MAX(uid)");
                FROM(USER_TB);
            }
        }.toString();
    }

    public String deleteUserByName(final String userName) {
        return new SQL() {
            {
                DELETE_FROM(USER_TB);
                WHERE("user_name = #{userName}");
            }
        }.toString();
    }
}
