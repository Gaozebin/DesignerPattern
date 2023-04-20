package com.geely.design.principle.singleresponsibility;

/**
 * @author gaozb
 * @date 2023/4/15 16:35
 */
public class Bird {
    public void mainMoveMode(String birdName) {
        if ("鸵鸟".equals(birdName)) {
            System.out.println(birdName + "用脚走");
        } else {
            System.out.println(birdName + "用翅膀飞");
        }
    }
}
