package com.geely.design.principle.singleresponsibility;

/**
 * @author gaozebin
 * @date 2023/4/15 22:18
 */
public class Method {
    private void updateUserInfo(String userName, String address) {
        userName = "geely";
        address = "beijing";
    }

    private void updateUserInfo(String userName, String... address) {
        userName = "geely";
//        address = "beijing";
    }

    private void updateUserName(String userName) {
        userName = "geely";
    }

    private void updateUserAddress(String address) {
        address = "beijing";
    }

    private void updateUserInfo(String userName, String address, boolean bool) {
        if (bool) {
            // todo something1
        } else {
            // todo something2
        }
        userName = "geely";
        address = "beijing";
    }
}
