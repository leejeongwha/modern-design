package org.example.moderndesign.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Runnable> observers = new ArrayList<>();

    public void attach(Runnable observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        observers.forEach(Runnable::run);
    }

    public void changeState() {
        System.out.println("State changed!");
        notifyObservers();
    }
}
