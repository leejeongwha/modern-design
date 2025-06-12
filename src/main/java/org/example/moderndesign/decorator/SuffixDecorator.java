package org.example.moderndesign.decorator;

public class SuffixDecorator extends TextDecorator {
    private String suffix;

    public SuffixDecorator(Text text, String suffix) {
        super(text);
        this.suffix = suffix;
    }

    @Override
    public String format(String s) {
        return text.format(s) + suffix;
    }
}
