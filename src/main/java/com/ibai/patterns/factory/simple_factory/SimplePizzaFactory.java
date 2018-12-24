package com.ibai.patterns.factory.simple_factory;

/**
 * @author Administrator
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("GreekPizza")) {
            pizza = new GreekPizza();
        } else if (type.equals("PepperoniPizza")) {
            pizza = new PepperoniPizza();
        }
        return pizza;
    }
}
