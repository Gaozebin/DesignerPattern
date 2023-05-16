package com.geely.design.structural.decorator.v1;

/**
 * @author gaozebin
 * @date 2023/5/4 0:40
 */
public class BattercakeWithEgg extends Battercake {
    @Override
    public String getDesc() {
        return super.getDesc() + " 加一个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost() + 1;
    }
}
