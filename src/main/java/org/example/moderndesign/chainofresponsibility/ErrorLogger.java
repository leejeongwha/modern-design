package org.example.moderndesign.chainofresponsibility;

public class ErrorLogger extends Logger {
    protected boolean canHandle(String level) {
        return "ERROR".equals(level);
    }

    protected void handle(String message) {
        System.out.println("ERROR: " + message);
    }
}
