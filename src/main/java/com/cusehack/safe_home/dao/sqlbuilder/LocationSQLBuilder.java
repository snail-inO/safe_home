package com.cusehack.safe_home.dao.sqlbuilder;

import org.apache.ibatis.jdbc.SQL;

public class LocationSQLBuilder {
    private static final String LOCATION_TB = "location_tb";

    public String insertLocation() {
        return new SQL() {
            {
                INSERT_INTO(LOCATION_TB);
                VALUES("uid, user_name, password, phone, email, is_authenticated, honesty_id, role_id",
                        "#{uid}, #{userName}, #{password}, #{phone}, #{email}, #{isAuthenticated}, #{honestyId}, " +
                                "#{roleId}");
            }
        }.toString();
    }

    public String updateLocation() {
        return new SQL() {
            {
                UPDATE(LOCATION_TB);
                SET("uid = #{uid}, user_name = #{userName}, password = #{password}, phone = #{phone}, email = #{email}," +
                        "is_authenticated = #{isAuthenticated}, honesty_id = #{honestyId}, role_id = #{roleId}");
                WHERE("user_name = #{userName}");
            }
        }.toString();
    }

    public String selectLocationByName(final String userName) {
        return new SQL() {
            {
                SELECT("*");
                FROM(LOCATION_TB);
                WHERE("user_name = #{userName}");
            }
        }.toString();
    }

    public String selectMaxUid() {
        return new SQL() {
            {
                SELECT("MAX(uid)");
                FROM(LOCATION_TB);
            }
        }.toString();
    }

    public String deleteLocationByName(final String userName) {
        return new SQL() {
            {
                DELETE_FROM(LOCATION_TB);
                WHERE("user_name = #{userName}");
            }
        }.toString();
    }
}
