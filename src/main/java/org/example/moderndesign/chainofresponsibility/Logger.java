package org.example.moderndesign.chainofresponsibility;

abstract class Logger {
    protected Logger next;

    public void setNext(Logger next) {
        this.next = next;
    }

    public void log(String level, String message) {
        if (canHandle(level)) {
            handle(message);
        } else if (next != null) {
            next.log(level, message);
        }
    }

    protected abstract boolean canHandle(String level);

    protected abstract void handle(String message);
}
