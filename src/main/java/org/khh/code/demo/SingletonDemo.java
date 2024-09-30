package org.khh.code.demo;

public class SingletonDemo {

    public static SingletonDemo single;

    private SingletonDemo(){};

    public static SingletonDemo getInstance() {

        if (single == null) {
            single = new SingletonDemo();
        }

        return single;
    }

}
