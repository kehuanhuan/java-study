package org.khh.code;

import org.khh.code.demo.VolatileDemo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Main {

    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args)  {

        VolatileDemo volatileDemo = new VolatileDemo();

        Thread t = new Thread(() -> {

            volatileDemo.sumCount();
        });

        Thread t2 = new Thread(() -> {
            volatileDemo.sumCount();
        });

        t.start();
        t2.start();


        log.info("xx");
    }


}