package com.geely.design.pattern.creational.abstractfactory;

/**
 * @author gaozebin
 * @date 2023/4/28 20:04
 */
public class PythonVideo extends Video{
    @Override
    public void produce() {
        System.out.println("录制Python课程视频");
    }
}
