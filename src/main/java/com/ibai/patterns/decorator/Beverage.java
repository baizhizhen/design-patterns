package com.ibai.patterns.decorator;

/**
 * @author baizhizhen
 */
public interface Beverage {
    String getDescription();

    float cost();

    default void print() {
        System.out.println(String.format("Description:%s, Cost:%f", getDescription(), cost()));
    }
}
