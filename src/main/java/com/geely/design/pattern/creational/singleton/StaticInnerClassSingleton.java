package com.geely.design.pattern.creational.singleton;

/**
 * @author gaozebin
 * @date 2023/4/20 21:25
 */
public class StaticInnerClassSingleton {
    private static class InnerClass{
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance(){
        return InnerClass.staticInnerClassSingleton;
    }

    private StaticInnerClassSingleton(){
        if (InnerClass.staticInnerClassSingleton != null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }
}
