package com.ibai.patterns.observer;

/**
 * @author baizhizhen
 */
public interface Observerable {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
