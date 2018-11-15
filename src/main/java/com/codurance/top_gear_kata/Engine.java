package com.codurance.top_gear_kata;

class Engine {
    public static final int SHIFT_UP_THRESHOLD = 2000;
    public static final int SHIFT_DOWN_THRESHOLD = 500;

    public boolean isBelowThreshold(int rpm) {
        return rpm < SHIFT_DOWN_THRESHOLD;
    }

    public boolean isOverThreshold(int rpm) {
        return rpm > SHIFT_UP_THRESHOLD;
    }
}
