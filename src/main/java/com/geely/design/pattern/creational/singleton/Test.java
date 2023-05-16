package com.geely.design.pattern.creational.singleton;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/**
 * @author gaozebin
 * @date 2023/4/18 22:36
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
//        LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println("main thread"+ThreadLocalInstance.getInstance());
        System.out.println("main thread"+ThreadLocalInstance.getInstance());
        System.out.println("main thread"+ThreadLocalInstance.getInstance());
        System.out.println("main thread"+ThreadLocalInstance.getInstance());
        System.out.println("main thread"+ThreadLocalInstance.getInstance());
        System.out.println("main thread"+ThreadLocalInstance.getInstance());
        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();
        System.out.println("program end");

//        HungrySingleton instance = HungrySingleton.getInstance();
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
//        oos.writeObject(instance);
//
//        File file = new File("singleton_file");
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
//
//        HungrySingleton newInstance = (HungrySingleton) ois.readObject();
//        System.out.println(instance);
//        System.out.println(newInstance);
//        System.out.println(instance == newInstance);
//        Class objectClass = HungrySingleton.class;
//        Class objectClass = StaticInnerClassSingleton.class;
//        Class objectClass = LazySingleton.class;
//        Constructor constructor = objectClass.getDeclaredConstructor();
//        constructor.setAccessible(true);

//        HungrySingleton instance = HungrySingleton.getInstance();
//        HungrySingleton newInstance = (HungrySingleton) constructor.newInstance();
//        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
//        StaticInnerClassSingleton newInstance = (StaticInnerClassSingleton) constructor.newInstance();

//        LazySingleton newInstance = (LazySingleton) constructor.newInstance();
//        LazySingleton instance = LazySingleton.getInstance();

//        System.out.println(instance);
//        System.out.println(newInstance);
//        System.out.println(instance == newInstance);

    }
}
