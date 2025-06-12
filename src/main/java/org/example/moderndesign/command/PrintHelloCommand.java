package org.example.moderndesign.command;

public class PrintHelloCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Hello!");
    }
}
