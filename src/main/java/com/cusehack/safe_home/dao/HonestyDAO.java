package com.cusehack.safe_home.dao;

import com.cusehack.safe_home.dao.beans.Honesty;

public interface HonestyDAO {
    Honesty retrieveHonesty(long honestyId);
    void createHonesty(Honesty honesty);
    long retrieveMaxHonestyId();
}
