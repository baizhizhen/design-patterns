package com.ibai.patterns.decorator;

/**
 * @author baizhizhen
 */
public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public float cost() {
        return beverage.cost() + 9.23f;
    }

    @Override
    public String getDescription() {
        return String.format("%s,%s", beverage.getDescription(), "Milk");
    }
}
