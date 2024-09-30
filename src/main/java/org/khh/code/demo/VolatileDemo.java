package org.khh.code.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VolatileDemo {
    private static final Logger log = LoggerFactory.getLogger(VolatileDemo.class);
//    public  int count = 0;
    public static  int count = 0;

    public void sumCount() {

        for (int i = 0; i < 1000000; i++) {
            count++;
        }

        log.info("count {}", count);
    }

}
