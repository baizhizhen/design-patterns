package com.ibai.patterns.strategy;

import com.ibai.patterns.strategy.algorithm.Arrow;
import com.ibai.patterns.strategy.algorithm.Sword;
import com.ibai.patterns.strategy.client.Hero;
import com.ibai.patterns.strategy.client.HouYi;


/**
 * 定义：
 * 将可变的部分封装为算法，独立于使用算法的客户端
 * 算法之间可以相互替换而且不影响客户端的实现
 * <p>
 * 原则：
 * 1.针对接口编程，而不是针对实现编程(实例化weapon的方式，不是new Object)
 * 2.封装变化(算法是变化的部分，这里指的是攻击的方式)
 * 3.多用组合少用继承(weapon)
 */
public class Main {

    public static void main(String[] args) {
        try {
            Hero houYi = new HouYi(new Arrow());
            houYi.attack();
            houYi.setWeapon(new Sword());
            houYi.attack();

        } catch (Exception ex) {

        }
    }
}
