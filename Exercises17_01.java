package com.example.demo3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;


public class Exercises17_01 {

    public static void main(String[] args) throws IOException {


        FileOutputStream outputStream = new FileOutputStream("C:\\section 11_2\\out\\demo3\\src\\Exercises17_01.txt");
        String temp = "";
        for (int i = 0; i < 100; i++) {
            int random = new Random().nextInt(100);
            temp+=random+" ";
        }
        outputStream.write(temp.getBytes());

        FileInputStream inputStream = new FileInputStream("C:\\section 11_2\\out\\demo3\\src\\Exercises17_01.txt");
        byte[] bytes = inputStream.readAllBytes();
        String text = new String(bytes);
        System.out.println(text);
    }
}