package com.geely.design.pattern.creational.singleton;

/**
 * @author gaozebin
 * @date 2023/4/25 23:44
 */
public class ThreadLocalInstance {
    private static final ThreadLocal<ThreadLocalInstance> threadLocalInstanceThreadLocal
            = new ThreadLocal<ThreadLocalInstance>(){
        @Override
        protected ThreadLocalInstance initialValue() {
            return new ThreadLocalInstance();
        }
    };
    public static ThreadLocalInstance getInstance(){
        return threadLocalInstanceThreadLocal.get();
    }
}
