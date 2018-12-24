package com.ibai.patterns.decorator;

/**
 * <p>
 * 装饰器模式：动态的将责任添加到对象上。若要扩展功能，装饰者提供了比继承更有弹性的替代方案。
 * </p>
 * <p>
 * 装饰者和被装饰者具有相同的超类，并且装饰者拥有被装饰者的引用
 * <p/>
 * <p>
 * 开闭原则
 * 其他面向对象设计原则
 * 1. 封装变化
 * 2.针对接口编程
 * 3.高内聚低耦合
 * 4.多用组合，少用继承
 * 5.开闭原则
 * <p/>
 *
 * @author baizhizhen
 */
public class Main {
    public static void main(String[] args) {
        Beverage beverage1 = new Espresso();
        beverage1.print();

        Beverage beverage2 = new DrakRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        beverage2.print();

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        beverage3.print();
    }
}
