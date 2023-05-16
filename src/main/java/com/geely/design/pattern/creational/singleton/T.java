package com.geely.design.pattern.creational.singleton;

/**
 * @author gaozebin
 * @date 2023/4/18 22:39
 */
public class T implements Runnable {
    @Override
    public void run() {
//        LazySingleton lazySingleton = LazySingleton.getInstance();
//        LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
//        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
//        ContainerSingleton.putInstance("object",new Object());
//        Object instance = ContainerSingleton.getInstance("object");
        ThreadLocalInstance instance = ThreadLocalInstance.getInstance();
        System.out.println(Thread.currentThread().getName() + instance);
    }
}
