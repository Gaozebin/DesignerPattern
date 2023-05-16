package com.geely.design.structural.decorator.v1;

/**
 * @author gaozebin
 * @date 2023/5/4 0:41
 */
public class BattercakeWithEggSausage extends BattercakeWithEgg {
    @Override
    public String getDesc() {
        return super.getDesc() + " 加一根香肠";
    }

    @Override
    public int cost() {
        return super.cost() + 2;
    }
}
