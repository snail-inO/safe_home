package com.cusehack.safe_home.dao.constant;

public enum HonestyLevelLevelEnum implements HonestyLevelInterface {
    HONEST_LEVEL5(100),
    HONEST_LEVEL4(80),
    HONEST_LEVEL3(60),
    HONEST_LEVEL2(40),
    HONEST_LEVEL1(20),
    HONEST_LEVEL0(0);

    private final int score;

    HonestyLevelLevelEnum(int score) {
        this.score = score;
    }

    @Override
    public int getScore() {
        return score;
    }
}
