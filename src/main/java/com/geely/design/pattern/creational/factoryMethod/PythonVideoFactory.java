package com.geely.design.pattern.creational.factoryMethod;

/**
 * @author gaozebin
 * @date 2023/4/17 22:52
 */
public class PythonVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
