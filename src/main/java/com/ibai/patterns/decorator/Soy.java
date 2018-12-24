package com.ibai.patterns.decorator;

/**
 * @author baizhizhen
 */
public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage) {
        super(beverage);
    }

    @Override
    public float cost() {
        return beverage.cost() + 1.21f;
    }

    @Override
    public String getDescription() {
        return String.format("%s,%s", beverage.getDescription(), "Soy");
    }
}
