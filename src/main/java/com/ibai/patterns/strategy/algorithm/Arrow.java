package com.ibai.patterns.strategy.algorithm;

public class Arrow implements Weapon {
    @Override
    public String attack() {
        return String.format("use %s", this.getClass().getSimpleName());
    }
}
