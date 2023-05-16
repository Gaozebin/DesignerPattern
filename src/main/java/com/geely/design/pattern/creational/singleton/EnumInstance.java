package com.geely.design.pattern.creational.singleton;

/**
 * @author gaozebin
 * @date 2023/4/24 21:35
 */
public enum EnumInstance {
    INSTANCE;
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance() {
        return INSTANCE;
    }
}
