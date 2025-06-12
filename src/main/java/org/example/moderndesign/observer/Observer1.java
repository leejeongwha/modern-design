package org.example.moderndesign.observer;

public class Observer1 implements Runnable {

    @Override
    public void run() {
        System.out.println("Observer 1 notified");
    }
}
