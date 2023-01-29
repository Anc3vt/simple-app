package com.ancevt.teach.simpleapp;

import org.apache.log4j.Logger;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        switch (a) {
            case 1 -> System.out.println("HELLO");
            case 2 -> method2();
            default -> System.out.println("Not 1 or 2");
        }


        for(int i = 0; i < 10; i ++) {
            System.out.println(i);
        }
    }

    public static void method1()
    {
        System.out.println("Method 1!");
    }

    public static void method2()
    {
        System.out.println("Method 2!");
    }

}
