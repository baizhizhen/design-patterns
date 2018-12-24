package com.ibai.patterns.decorator;

/**
 * @author baizhizhen
 */
public class HouseBlend implements Beverage {
    @Override
    public float cost() {
        return 20;
    }

    @Override
    public String getDescription() {
        return "HouseBlend";
    }
}
