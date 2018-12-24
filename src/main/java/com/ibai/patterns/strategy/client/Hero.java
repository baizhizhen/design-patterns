package com.ibai.patterns.strategy.client;

import com.ibai.patterns.strategy.algorithm.Weapon;

/**
 * 客户端
 * 将英雄的攻击方式委托给武器去处理
 */
public abstract class Hero {

    private Weapon weapon;


    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack() {
        System.out.println(weapon.attack());
    }
}
