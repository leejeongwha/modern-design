package org.example.moderndesign.observer;

public class Main {
    public static void main(String[] args) {
        leagcy();
        lambda();
    }

    private static void leagcy() {
        Subject subject = new Subject();

        // 옵저버 등록
        subject.attach(new Observer1());

        // 또 다른 옵저버 등록
        subject.attach(new Observer2());

        // 상태 변경 -> 모든 옵저버 알림
        subject.changeState();
    }

    private static void lambda() {
        Subject subject = new Subject();

        // 옵저버 등록
        subject.attach(() -> System.out.println("Observer 1 notified"));
        subject.attach(() -> System.out.println("Observer 2 notified"));

        // 상태 변경 시 알림
        subject.changeState();
    }
}
