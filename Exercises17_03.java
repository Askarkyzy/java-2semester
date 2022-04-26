package com.example.demo3;

import java.io.*;
        import java.util.Random;

public class Exercises17_03 {

    public static void main(String[] args) throws IOException {

        DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("C:\\section 11_2\\out\\demo3\\src\\Exercise17_03.dat"));
        for (int i = 0; i < 100; i++) {
            int random = new Random().nextInt(100);
            outputStream.writeUTF(random + " ");
        }

        DataInputStream inputStream = new DataInputStream(new FileInputStream("C:\\section 11_2\\out\\demo3\\src\\Exercise17_03.dat"));
        try {
            while (true) {
                System.out.print(inputStream.readUTF());

            }
        } catch (EOFException e) {

        }
    }
}