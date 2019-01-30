package com.home.designpattern.designpatterns.Decorator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

/**
 * 裝飾類別-將讀入句子反轉
 */
public class ReverseReader extends BufferedReader {

    public ReverseReader(Reader in) {
        super(in);
    }

    public String reverseLine() throws IOException {
        String line = super.readLine();
        if (line == null) return null;
        return reverse(line);
    }

    // 反轉字串
    private String reverse(String line) {
        String result = "";
        for (int i = 0; i < line.length(); i++) {
            result = line.charAt(i) + result;
        }
        return result;
    }
}
