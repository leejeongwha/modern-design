package org.example.moderndesign.command;

public class PrintByeCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Bye!");
    }
}
