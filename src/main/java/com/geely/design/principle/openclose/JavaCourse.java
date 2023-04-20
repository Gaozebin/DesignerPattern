package com.geely.design.principle.openclose;

/**
 * @author gaozb
 * @date 2023/4/15 11:18
 */
public class JavaCourse implements ICourse {
    private Integer Id;
    private String name;
    private Double price;

    public JavaCourse(Integer id, String name, Double price) {
        Id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return this.Id;
    }

    public String getName() {
        return this.name;
    }

    public Double getPrice() {
        return this.price;
    }

//    public Double getDiscountPrice() {
//        return this.price * 0.8;
//    }
}
