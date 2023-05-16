package com.geely.design.pattern.creational.abstractfactory;

/**
 * @author gaozebin
 * @date 2023/4/28 20:05
 */
public class JavaArticle extends Article {
    @Override
    public void produce() {
        System.out.println("编辑Java课程手记");
    }
}
