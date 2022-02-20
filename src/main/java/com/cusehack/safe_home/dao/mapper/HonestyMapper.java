package com.cusehack.safe_home.dao.mapper;

import com.cusehack.safe_home.dao.beans.Honesty;
import com.cusehack.safe_home.dao.sqlbuilder.HonestySQLBuilder;
import org.apache.ibatis.annotations.*;

@Mapper
public interface HonestyMapper {
    @InsertProvider(value = HonestySQLBuilder.class, method = "insertHonesty")
    void insertHonesty(Honesty honesty);
    @UpdateProvider(value = HonestySQLBuilder.class, method = "updateHonesty")
    void updateHonesty(Honesty honesty);
    @SelectProvider(value = HonestySQLBuilder.class, method = "selectHonestyById")
    Honesty selectHonestyById(final long honestId);
    @SelectProvider(value = HonestySQLBuilder.class, method = "selectMaxId")
    long selectMaxId();
    @DeleteProvider(value = HonestySQLBuilder.class, method = "deleteHonestyById")
    void deleteHonestyById(final long honestId);
}
