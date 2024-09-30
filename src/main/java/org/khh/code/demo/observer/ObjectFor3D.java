package org.khh.code.demo.observer;

import java.util.ArrayList;
import java.util.List;

public class ObjectFor3D implements Subject {

    public List<Observer> observers = new ArrayList<>();

    public String msg;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observers) {
            observer.printMsg(msg);
        }
    }

    public void setMsg(String msg) {
        this.msg = msg;

        notifyObservers();
    }

}
