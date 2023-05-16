package com.geely.design.structural.decorator.v2;

/**
 * @author gaozebin
 * @date 2023/5/4 0:57
 */
public abstract class AbstractDecorator extends ABattercake{
    private ABattercake aBattercake;

    public AbstractDecorator(ABattercake aBattercake){
        this.aBattercake = aBattercake;
    }

    protected abstract void doSomething();

    @Override
    protected String getDesc() {
        return this.aBattercake.getDesc();
    }

    @Override
    protected int cost() {
        return this.aBattercake.cost();
    }
}
