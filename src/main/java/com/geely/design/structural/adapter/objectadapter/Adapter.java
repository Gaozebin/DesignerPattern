package com.geely.design.structural.adapter.objectadapter;

/**
 * @author gaozebin
 * @date 2023/5/10 0:05
 */
public class Adapter implements Target {
    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        // ...
        adaptee.adapteeRequest();
        // ...
    }
}
