package org.example.moderndesign.command;

public class Main {
    public static void main(String[] args) {
        leagcy();
        lamda();
    }

    private static void leagcy() {
        Button helloButton = new Button(new PrintHelloCommand());
        Button byeButton = new Button(new PrintByeCommand());

        helloButton.press();
        byeButton.press();
    }

    private static void lamda() {
        Button helloButton = new Button(() -> System.out.println("Hello!"));
        Button byeButton = new Button(() -> System.out.println("Bye!"));

        helloButton.press();
        byeButton.press();
    }
}
