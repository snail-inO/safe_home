package com.cusehack.safe_home.constant;

public enum HonestyLevelLevelEnum implements HonestyLevelInterface {
    HONEST_LEVEL5(5, 100),
    HONEST_LEVEL4(4, 80),
    HONEST_LEVEL3(3, 60),
    HONEST_LEVEL2(2, 40),
    HONEST_LEVEL1(1, 20),
    HONEST_LEVEL0(0, 0);

    private final int level;
    private final int score;

    HonestyLevelLevelEnum(int level, int score) {
        this.level = level;
        this.score = score;
    }

    @Override
    public int getScore() {
        return score;
    }

    @Override
    public int getLevel() {
        return level;
    }
}
