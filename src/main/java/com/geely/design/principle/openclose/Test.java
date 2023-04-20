package com.geely.design.principle.openclose;

/**
 * @author gaozb
 * @date 2023/4/15 11:24
 */
public class Test {
    public static void main(String[] args) {
//        ICourse javaCourse = new JavaCourse(96, "Java从零到企业级电商开发", 348d);
//        System.out.println("课程ID:" + javaCourse.getId() + "课程名称:" +javaCourse.getName()+"课程价格:"+javaCourse.getPrice()+"元");

        ICourse iCourse = new JavaDiscountCourse(96, "Java从零到企业级电商开发", 348d);
        JavaDiscountCourse javaCourse = (JavaDiscountCourse) iCourse;
        System.out.println("课程ID:" + javaCourse.getId() + "课程名称:" +javaCourse.getName()+"课程价格:"+javaCourse.getOriginPrice()+"元");
    }
}
