package org.example.moderndesign.decorator;

public class AllCapsDecorator extends TextDecorator {
    public AllCapsDecorator(Text text) {
        super(text);
    }

    @Override
    public String format(String s) {
        return text.format(s).toUpperCase();
    }
}
