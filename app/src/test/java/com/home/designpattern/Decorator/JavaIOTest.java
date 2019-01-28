package com.home.designpattern.Decorator;

import com.home.designpattern.designpatterns.Decorator.ReverseReader;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 裝飾模式實例JavaIO-測試
 */
public class JavaIOTest {

    @Test
    public void test() throws IOException {
        System.out.println("==========FileReader讀取檔案==========");

        String path = "/Users/pomankao/Desktop/test.txt";

        FileReader fileReader = new FileReader(path);
        int c = fileReader.read();
        while (c >= 0) {
            System.out.println((char)c);
            c = fileReader.read();
        }

        System.out.println("==========BufferedReader讀取檔案==========");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        String line = bufferedReader.readLine();
        while (line != null) {
            System.out.println(line);
            line = bufferedReader.readLine();
        }

        System.out.println("==========Reverse Reader反轉讀入的內容==========");
        // 測試將讀入的句子倒轉
        ReverseReader reverseReader = new ReverseReader(new FileReader(path));
        String rLine = reverseReader.reverseLine();
        while (rLine != null) {
            System.out.println(rLine);
            rLine = reverseReader.reverseLine();
        }
    }
}
