package com.geely.design.pattern.creational.builder.v2;

/**
 * @author gaozebin
 * @date 2023/4/29 21:52
 */
public class Test {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder()
                .builderCourseName("Java设计模式精讲")
                .buildCoursePPT("Java设计模式精讲PPT")
                .buildCourseVideo("Java设计模式精讲视频")
                .buildCourseArticle("Java设计模式精讲手记").build();
        System.out.println(course);
    }
}
