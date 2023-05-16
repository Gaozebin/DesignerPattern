package com.geely.design.pattern.creational.prototype.abstractprototype;

/**
 * @author gaozebin
 * @date 2023/5/3 22:23
 */
public class B extends A{
    public static void main(String[] args) throws CloneNotSupportedException {
        B b = new B();
        b.clone();
    }
}
