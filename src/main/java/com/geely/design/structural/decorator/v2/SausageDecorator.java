package com.geely.design.structural.decorator.v2;

/**
 * @author gaozebin
 * @date 2023/5/4 1:00
 */
public class SausageDecorator extends AbstractDecorator {

    public SausageDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一根香肠";
    }

    @Override
    protected void doSomething() {

    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}
