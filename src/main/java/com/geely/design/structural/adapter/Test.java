package com.geely.design.structural.adapter;

/**
 * @author gaozebin
 * @date 2023/5/10 0:16
 */
public class Test {
    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter();
        dc5.outputDC5V();
    }
}
