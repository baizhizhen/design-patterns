package com.ibai.patterns.decorator;

/**
 * @author baizhizhen
 */
public class DrakRoast implements Beverage {
    @Override
    public String getDescription() {
        return "DarkRoast";
    }

    @Override
    public float cost() {
        return 21.1f;
    }
}
