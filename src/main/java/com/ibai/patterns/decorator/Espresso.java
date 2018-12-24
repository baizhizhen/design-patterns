package com.ibai.patterns.decorator;

/**
 * @author baizhizhen
 */
public class Espresso implements Beverage {
    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public float cost() {
        return 112.1f;
    }
}
