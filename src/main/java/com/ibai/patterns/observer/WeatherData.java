package com.ibai.patterns.observer;

import java.util.HashSet;
import java.util.Set;

/**
 * @author baizhizhen
 */
public class WeatherData implements Observerable {
    private float temperature;
    private float humidity;
    private float pressure;
    private Set<Observer> observers = new HashSet<>();

    public void measurementsChanged() {
        this.notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.measurementsChanged();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        boolean contains = observers.contains(observer);
        if (contains) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }
}
