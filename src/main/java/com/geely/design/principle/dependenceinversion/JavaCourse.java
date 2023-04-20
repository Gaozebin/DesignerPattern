package com.geely.design.principle.dependenceinversion;

/**
 * @author gaozb
 * @date 2023/4/15 16:08
 */
public class JavaCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("Geely在学习Java课程");
    }
}
