package com.geely.design.pattern.creational.factoryMethod;

/**
 * @author gaozebin
 * @date 2023/4/17 22:56
 */
public class FEVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制前端课程视频");
    }
}
