package com.geely.design.pattern.creational.simplefactory;

/**
 * @author gaozebin
 * @date 2023/4/17 21:10
 */
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Java课程视频");
    }
}
