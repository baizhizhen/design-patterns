package com.ibai.patterns.decorator;

/**
 * @author baizhizhen
 */
public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public float cost() {
        return beverage.cost() + 1.12f;
    }

    @Override
    public String getDescription() {
        return String.format("%s,%s", beverage.getDescription(), "Mocha");
    }
}
