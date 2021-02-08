package com.task.third;
import java.util.Scanner;

public class ThirdTask {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите день недели: ");
        String dayWeek = in.nextLine();
        in.close();

        switch (dayWeek) {
            case "Воскресенье":
                System.out.println("0");
                break;
            case "Понедельник":
                System.out.println("1");
                break;
            case "Вторник":
                System.out.println("2");
                break;
            case "Среда":
                System.out.println("3");
                break;
            case "Четверг":
                System.out.println("4");
                break;
            case "Пятница":
                System.out.println("5");
                break;
            case "Суббота":
                System.out.println("6");
                break;
            default:
                System.out.println("Неверно введён день недели!");
        }
    }
}
