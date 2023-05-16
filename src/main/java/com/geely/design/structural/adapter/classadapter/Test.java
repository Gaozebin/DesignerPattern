package com.geely.design.structural.adapter.classadapter;

/**
 * @author gaozebin
 * @date 2023/5/10 0:01
 */
public class Test {
    public static void main(String[] args) {
        Target target = new ConcreateTarget();
        target.request();

        Target adapterTarget = new Adapter();
        adapterTarget.request();

    }
}
