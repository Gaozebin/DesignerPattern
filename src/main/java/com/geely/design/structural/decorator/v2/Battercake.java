package com.geely.design.structural.decorator.v2;

/**
 * @author gaozebin
 * @date 2023/5/4 0:56
 */
public class Battercake extends ABattercake{
    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 8;
    }
}
