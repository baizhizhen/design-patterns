package com.ibai.patterns.factory.simple_factory;

/**
 * 简单工厂，更像是一种编程习惯
 * 优点：简单，直接，可以复用创建对象的逻辑
 * 缺点：违反了开闭原则，每增加一种新的Pizza，都需要修改SimplePizzaFactory
 * 违反了针对接口编程，而不是针对实现编程
 */
public class Main {
    public static void main(String[] args) {
        PizzaStore store = new PizzaStore(new SimplePizzaFactory());
        Pizza cheese = store.orderPizza("cheese");

    }
}
