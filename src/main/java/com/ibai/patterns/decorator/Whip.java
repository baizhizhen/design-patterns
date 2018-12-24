package com.ibai.patterns.decorator;

/**
 * @author baizhizhen
 */
public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        super(beverage);
    }

    @Override
    public float cost() {
        return beverage.cost() + 3.21f;
    }

    @Override
    public String getDescription() {
        return String.format("%s,%s", beverage.getDescription(), "Whip");
    }
}
