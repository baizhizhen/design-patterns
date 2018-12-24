package com.ibai.patterns.decorator;

/**
 * @author baizhizhen
 */
public class Decaf implements Beverage {
    @Override
    public String getDescription() {
        return "Decaf";
    }

    @Override
    public float cost() {
        return 22.2f;
    }
}
