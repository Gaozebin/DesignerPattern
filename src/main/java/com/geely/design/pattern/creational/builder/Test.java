package com.geely.design.pattern.creational.builder;

/**
 * @author gaozebin
 * @date 2023/4/29 20:59
 */
public class Test {
    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);

        Course course = coach.makeCourse("Java设计模式精讲",
                "Java设计模式精讲ppt",
                "Java设计模式精讲视频",
                "Java设计模式精讲手记",
                "Java设计模式精讲问答");
        System.out.println(course);
    }
}
