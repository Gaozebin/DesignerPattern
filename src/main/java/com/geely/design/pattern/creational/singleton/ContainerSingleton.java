package com.geely.design.pattern.creational.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * @author gaozebin
 * @date 2023/4/25 23:11
 */
public class ContainerSingleton {
    private ContainerSingleton(){

    }
    private static Map<String, Object> singletonMap = new HashMap<String, Object>();

    public static void putInstance(String key, Object instance) {
        if ("".equals(key) && key != null && instance != null) {
            if (!singletonMap.containsKey(key)) {
                singletonMap.put(key, instance);
            }
        }
    }

    public static Object getInstance(String key) {
        return singletonMap.get(key);
    }
}
