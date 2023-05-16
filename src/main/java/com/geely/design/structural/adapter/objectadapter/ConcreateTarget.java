package com.geely.design.structural.adapter.objectadapter;

/**
 * @author gaozebin
 * @date 2023/5/9 23:58
 */
public class ConcreateTarget implements Target {
    @Override
    public void request() {
        System.out.println("concreateTarget目标方法");
    }
}
