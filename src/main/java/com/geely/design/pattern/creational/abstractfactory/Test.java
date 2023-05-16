package com.geely.design.pattern.creational.abstractfactory;

/**
 * @author gaozebin
 * @date 2023/4/28 21:03
 */
public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        Video video = courseFactory.getVideo();
        Article article = courseFactory.getArticle();
        video.produce();
        article.produce();
    }
}
