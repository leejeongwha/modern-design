package org.example.moderndesign.decorator;

public class PlainText implements Text {
    @Override
    public String format(String s) {
        return s;
    }
}
