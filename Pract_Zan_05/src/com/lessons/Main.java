package com.lessons;

public class Main{

    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.setR(5.1);
        System.out.println(circle.getLength() + " cm");

        circle.setR(7);
        System.out.println(circle.getLength() + " cm");
    }
}

class Circle {
    double r = 0;
    void setR(double r) {
        this.r = r;
    }

    double getLength() {
        return 2 * Math.PI * r;
    }
}