package com.ibai.patterns.observer;

/**
 * @author baizhizhen
 */
public class CurrentConditionsDisplay implements DisplayElement, Observer {
    private float temperature;
    private float humidity;

    @Override
    public void display() {
        System.out.println("Current Condition: " + temperature + "F degrees and " + humidity + " % humidity");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.display();
    }
}
