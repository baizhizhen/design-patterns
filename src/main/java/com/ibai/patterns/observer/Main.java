package com.ibai.patterns.observer;

/**
 * 观察者模式：定义对象的一对多依赖关系，当对象的状态发生变化时，所有依赖的对象会被通知
 * 面向对象设计原则：高内聚，低耦合
 * 对象与对象之间的依赖只是接口，观察者和被观察者并不知道对方的详细信息。
 * <p>
 * 其他设计原则：
 * 1.封装变化
 * 2.针对接口编程，而不是实现编程。
 * 3.多用组合，少用继承。
 * 4.高内聚低耦合
 *
 * @author baizhizhen
 */
public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        Observer currentConditionsDisplay = new CurrentConditionsDisplay();
        Observer statisticsDisplay = new StatisticsDisplay();
        Observer thirdPartyDisplay = new ThirdPartyDisplay();
        weatherData.registerObserver(currentConditionsDisplay);
        weatherData.registerObserver(statisticsDisplay);
        weatherData.registerObserver(thirdPartyDisplay);

        weatherData.setMeasurements(11.1f, 12, 1);
        weatherData.setMeasurements(12.1f, 10.1f, 9.9f);
    }
}
