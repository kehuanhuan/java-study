package org.khh.code.demo.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Observer1 implements Observer {

    private static final Logger log = LoggerFactory.getLogger(Observer1.class);

    @Override
    public void printMsg(String msg) {
        log.info("observer1 得到 3D 号码 -->" + msg + "我要告诉舍友们。");
    }
}
