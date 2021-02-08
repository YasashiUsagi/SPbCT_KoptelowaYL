package com.task.fourth;

import java.util.Scanner;

public class FourthTask {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите оценку до 100: ");
        int mark = in.nextInt();
        in.close();

        if (mark > 90) System.out.println("Разряд - A");
        else if (mark > 80) System.out.println("Разряд - B");
        else if (mark > 70) System.out.println("Разряд - C");
        else if (mark > 60) System.out.println("Разряд - D");
        else if (mark > 50) System.out.println("Разряд - E");
        else System.out.println("Разряд - F");
    }
}
