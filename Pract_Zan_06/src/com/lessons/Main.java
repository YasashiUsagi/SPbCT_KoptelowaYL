package com.lessons;

interface Printable {
    public void println();
}

class Car implements Printable {
    String name, klass, series;
    int num, year;
    Car(String n, String k, String s, int nu, int y) {
        name = n;
        klass = k;
        series = s;
        num = nu;
        year = y;
    }
    public void println() {
        System.out.println("Автомобиль марки " + name + " модель: " + klass + " Конфиг: " + series + " Цена: " + num + " Год выпуска: " + year);
    }
}

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("Mercedes-Benz", "S-klass", "S500", 7000000, 2015);
        c1.println();
        Car c2 = new Car("BMW", "7 Series", "750 Li", 7050000, 2016);
        c2.println();
        Car c3 = new Car("Audi", "A8", "Long", 7450000, 2016);
        c3.println();
    }
}