package com.cusehack.safe_home.dao;

import com.cusehack.safe_home.dao.beans.Honesty;
import com.cusehack.safe_home.dao.mapper.HonestyMapper;

public class HonestyDAOImpl implements HonestyDAO{
    private final HonestyMapper honestyMapper;

    public HonestyDAOImpl(HonestyMapper honestyMapper) {
        this.honestyMapper = honestyMapper;
    }

    @Override
    public Honesty retrieveHonesty(long honestyId) {
        return honestyMapper.selectHonestyById(honestyId);
    }

    @Override
    public void createHonesty(Honesty honesty) {
        honestyMapper.insertHonesty(honesty);
    }

    @Override
    public long retrieveMaxHonestyId() {
        return honestyMapper.selectMaxId();
    }
}
