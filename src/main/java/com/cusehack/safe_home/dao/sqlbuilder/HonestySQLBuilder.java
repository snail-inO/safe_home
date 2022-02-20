package com.cusehack.safe_home.dao.sqlbuilder;

import org.apache.ibatis.jdbc.SQL;

public class HonestySQLBuilder {
    private static final String HONESTY_TB = "honesty_tb";

    public String insertHonesty() {
        return new SQL() {
            {
                INSERT_INTO(HONESTY_TB);
                VALUES("honesty_id, honesty_level, report_count, valid_report_count, honesty_score",
                        "#{honestyId}, #{honestyLevel}, #{reportCount}, #{validReportCount}, #{honestyScore}");
            }
        }.toString();
    }

    public String updateHonesty() {
        return new SQL() {
            {
                UPDATE(HONESTY_TB);
                SET("honesty_id = #{honestyId}, honesty_level = #{honestyLevel}, report_count = #{reportCount}, " +
                        "valid_report_count = #{validReportCount}, honesty_score = #{honestyScore}");
                WHERE("honesty_id = #{honestyId}");
            }
        }.toString();
    }

    public String selectHonestyById(final long honestyId) {
        return new SQL() {
            {
                SELECT("*");
                FROM(HONESTY_TB);
                WHERE("honesty_id = #{honestyId}");
            }
        }.toString();
    }

    public String selectMaxId() {
        return new SQL() {
            {
                SELECT("MAX(honesty_id)");
                FROM(HONESTY_TB);
            }
        }.toString();
    }

    public String deleteHonestyById(final long honestyId) {
        return new SQL() {
            {
                DELETE_FROM(HONESTY_TB);
                WHERE("honesty_id = #{honestyId}");
            }
        }.toString();
    }
}
