package com.task.fifth;

import java.util.Scanner;

public class FifthTask {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите x: ");
        double x = in.nextDouble();
        in.close();

        double y;
        double a = 3.9;
        double b = 4.8;

        if (x > 4) y = Math.sqrt(a + Math.abs(Math.sin(x)));
        else y = Math.tan(b * x);
        System.out.println("y = " + y);
    }
}
