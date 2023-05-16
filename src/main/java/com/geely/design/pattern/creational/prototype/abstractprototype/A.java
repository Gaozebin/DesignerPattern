package com.geely.design.pattern.creational.prototype.abstractprototype;

/**
 * @author gaozebin
 * @date 2023/5/3 22:23
 */
public abstract class A implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
