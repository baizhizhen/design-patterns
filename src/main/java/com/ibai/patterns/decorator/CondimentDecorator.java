package com.ibai.patterns.decorator;

/**
 * @author baizhizhen
 */
public abstract class CondimentDecorator implements Beverage {
    Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
}
