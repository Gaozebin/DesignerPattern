package com.geely.design.principle.singleresponsibility;

/**
 * @author gaozebin
 * @date 2023/4/15 22:11
 */
public interface ICourse {
    String getCourseName();

    byte[] getCourseVideo();

    void studyCourse();

    void refundCourse();
}
