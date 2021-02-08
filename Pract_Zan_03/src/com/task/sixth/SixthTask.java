package com.task.sixth;

import java.util.Scanner;

public class SixthTask {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите x: ");
        double x = in.nextDouble();
        in.close();

        double y;
        double a = 1.7;

        if (x <= 1) y = x * x - a * x;
        else if (x > 4) y = 1 / (x * x + 2);
        else y = Math.cbrt((x + 1) * (x + 1));
        System.out.println("Y = " + y);
    }
}
