package com.ibai.patterns.strategy.algorithm;

public class Cannon implements Weapon {
    @Override
    public String attack() {
        return String.format("use %s", this.getClass().getSimpleName());
    }
}
