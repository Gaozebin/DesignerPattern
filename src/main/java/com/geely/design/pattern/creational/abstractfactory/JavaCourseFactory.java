package com.geely.design.pattern.creational.abstractfactory;

/**
 * @author gaozebin
 * @date 2023/4/28 20:03
 */
public class JavaCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
