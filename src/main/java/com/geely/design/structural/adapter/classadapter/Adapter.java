package com.geely.design.structural.adapter.classadapter;

/**
 * @author gaozebin
 * @date 2023/5/9 23:59
 */
public class Adapter extends Adaptee implements Target{
    @Override
    public void request() {
        // ...
        super.adapteeRequest();
        // ...
    }
}
