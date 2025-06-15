package org.example.moderndesign.chainofresponsibility;

public class InfoLogger extends Logger {
    protected boolean canHandle(String level) {
        return "INFO".equals(level);
    }

    protected void handle(String message) {
        System.out.println("INFO: " + message);
    }
}
