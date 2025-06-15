package org.example.moderndesign.chainofresponsibility;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaLogger {
    static class LoggerHandler {
        private final Predicate<String> condition;
        private final Consumer<String> action;
        private LoggerHandler next;

        public LoggerHandler(Predicate<String> condition, Consumer<String> action) {
            this.condition = condition;
            this.action = action;
        }

        public LoggerHandler setNext(LoggerHandler next) {
            this.next = next;
            return next;
        }

        public void handle(String level, String message) {
            if (condition.test(level)) {
                action.accept(message);
            } else if (next != null) {
                next.handle(level, message);
            }
        }
    }
}
