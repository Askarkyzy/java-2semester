package com.example.demo3;

import java.io.File;
import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Scanner;

public class week10_2 {

    public static void main(String[] args) {


        PriorityQueue<String> queue = new PriorityQueue<>(1000 , String.CASE_INSENSITIVE_ORDER);

        try (Scanner in = new Scanner(new File("C:\\section 11_2\\out\\demo3\\src\\Text.txt"))) {
            String[] arr = null;
            while (in.hasNext()) {
                arr = in.nextLine().split(" ");
            }
            for (int i = 0; i < arr.length; i++) {
                queue.add(arr[i]);
            }
            while (queue.size() > 0) {
                System.out.println(queue.poll());
            }



        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}