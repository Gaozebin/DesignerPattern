package com.geely.design.principle.dependenceinversion;

/**
 * @author gaozb
 * @date 2023/4/15 16:03
 */
public class Geely {

    private ICourse iCourse;

    //    // 方法参数方式注入
//    public void studyImoocCourse(ICourse iCourse) {
//        iCourse.studyCourse();
//    }
    // 构造器方式注入
//    public Geely(ICourse iCourse) {
//        this.iCourse = iCourse;
//    }
    public void studyImoocCourse() {
        iCourse.studyCourse();
    }

    // set注入方式
    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }
}
