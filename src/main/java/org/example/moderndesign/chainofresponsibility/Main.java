package org.example.moderndesign.chainofresponsibility;

import org.example.moderndesign.chainofresponsibility.LambdaLogger.LoggerHandler;

public class Main {
    public static void main(String[] args) {
        leagcy();
        lambda();
    }

    private static void leagcy() {
        Logger chain = new InfoLogger();
        Logger errorLogger = new ErrorLogger();
        chain.setNext(errorLogger);

        chain.log("INFO", "This is an info message.");
        chain.log("ERROR", "This is an error message.");
        //chain.log("DEBUG", "This will not be handled.");
    }

    private static void lambda() {
        LoggerHandler loggerChain = new LoggerHandler(
            level -> "INFO".equals(level),
            msg -> System.out.println("INFO: " + msg)
        );

        loggerChain.setNext(new LoggerHandler(
            level -> "ERROR".equals(level),
            msg -> System.out.println("ERROR: " + msg)
        ));

        loggerChain.handle("INFO", "This is an info message.");
        loggerChain.handle("ERROR", "This is an error message.");
        //loggerChain.handle("DEBUG", "This will not be handled.");
    }
}
