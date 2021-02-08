package com.task.first;

import java.util.Scanner;                           //импортируем библиотеку Scanner для ввода чисел

public class FirstTask {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();
        in.close();

        if (num < 100)
            System.out.println("Less");
        else System.out.println("Not less");
    }
}
