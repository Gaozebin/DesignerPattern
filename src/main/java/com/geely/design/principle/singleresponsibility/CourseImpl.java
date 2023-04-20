package com.geely.design.principle.singleresponsibility;

/**
 * @author gaozebin
 * @date 2023/4/15 22:14
 */
public class CourseImpl implements ICourseContent,ICourseManager{
    @Override
    public String getCourseName() {
        return null;
    }

    @Override
    public byte[] getCourseVideo() {
        return new byte[0];
    }

    @Override
    public void studyCourse() {

    }

    @Override
    public void refundCourse() {

    }
}
