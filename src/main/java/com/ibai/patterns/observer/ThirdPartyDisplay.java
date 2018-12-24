package com.ibai.patterns.observer;

/**
 * @author baizhizhen
 */
public class ThirdPartyDisplay implements DisplayElement, Observer {
    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void display() {
        System.out.println("ThirdParty Condition: " + temperature + "F degrees and " + humidity + " % humidity " +
                pressure + " Pressure");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.display();
    }
}
