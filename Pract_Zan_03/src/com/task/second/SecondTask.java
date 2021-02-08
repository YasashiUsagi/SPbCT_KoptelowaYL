package com.task.second;
import java.util.Scanner;

public class SecondTask {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите оценку от 2 до 5: ");
        int mark = in.nextInt();
        in.close();

        switch (mark) {
            case 5:
                System.out.println("Отлично!");
                break;
            case 4:
                System.out.println("Хорошо!");
                break;
            case 3:
                System.out.println("Удовлетворительно!");
                break;
            case 2:
                System.out.println("Неудовлетворительно!");
                break;
            default:
                System.out.println("Некорректно введена оценка, попробуйте ещё раз!");
        }
    }
}
