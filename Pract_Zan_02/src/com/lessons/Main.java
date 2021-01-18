package com.lessons;

public class Main {

    public static void main(String[] args) {
/*      int x = 1;
        int y = 2;              //пример объявления переменных
        int r;                  //пример объявления переменных без инициализации

        byte getByte, putByte;  //пример объявления переменных типа byte
        getByte = 0;
        putByte = 0;

        float usd = 61.24f;     //пример инициализации переменных типа float
        float eur = 74.03f;
*/

/*      char symb1 = 1067;      //пример того, как символ ‘Ы’ соответствует числу 1067
        char symb2 = 'Ы';

        System.out.println("symb1 contains " + symb1);
        System.out.println("symb2 contains " + symb2);
*/

/*      char ch = 'J';          //как узнать, какому числу соответствует какой символ
        int intCh = (int)ch;

        System.out.println("J corresponds with "+ intCh);
*/

/*      Создание строки с помощью конструктора:
            String myString = new String("The weather was fine");
        Можно также создать строку используя кавычки "":
            String myString = "The weather was fine";
*/

/*      String s1 = "I have ";      //пример использования оператора "+"
        String s2 = " apples ";
        int num = 3;
        String s = s1 + num + s2;

        System.out.println(s);
*/
/*      int i = 35;                 //пример преобразования чисел в строку
        String str1 = Integer.toString(i);
        System.out.println(str1);

        double  o = 32.4e10;
        String str2 = Double.toString(o);
        System.out.println(str2);

        long  p = 3422222;
        String str3 = Long.toString(p);
        System.out.println(str3);

        float  q = 3.46f;
        String str4 = Float.toString(q);
        System.out.println(str4);
*/
/*      char ch = 'S';              //преобразование символа char

        // c использованием класса Character
        String charToString = Character.toString(ch);
        System.out.println(charToString);

        // с использованием операции добавления класса String
        String str = "" + ch;
        System.out.println(str);

        //с использованием массива
        String fromChar = new String(new char[] { ch });
        System.out.println(fromChar);

        // с использованием метода valueOf класса String
        String valueOfchar = String.valueOf(ch);
        System.out.println(valueOfchar);

        char ch1 = '9';

        // c использованием метода getNumericValue
        // класса Character
        int i1 = Character.getNumericValue(ch1);
        System.out.println(i1);

        // c использованием метода digit класса Character
        int i2 = Character.digit(ch1,10);
        System.out.println(i2);
*/
/*      int i1 = 2015;               //пример преобразования чисел
        long l = (long) (i1);
        System.out.println(l);

        int i2 = 2015;
        float f = (float) (i2);
        System.out.println(f);

        long l2 = 214748364;
        int i = (int) l2;
        System.out.println(i);

        double d = 3.14;
        int i3 = (int) d;
        System.out.println(i3);
*/

//        int x= 300000;            //пример переполнения
//        System.out.println(x*x);

/*      byte x=5;                   //примеры с операторами инкрементации и декрементации
        byte y1=x++;     // на момент начала исполнения x равен 5
        byte y2=x--;     // на момент начала исполнения x равен 6
        byte y3=++x;     // на момент начала исполнения x равен 5
        byte y4=--x;     // на момент начала исполнения x равен 6
        System.out.println(y1);
        System.out.println(y2);
        System.out.println(y3);
        System.out.println(y4);
*/
/*      byte x=-128;
        System.out.println(-x);

        byte y=127;
        System.out.println(++y);
*/
/*      System.out.println(1e-40f/1e10f);   // underflow для float
        System.out.println(-1e-300/1e100);  // underflow для double
        float f=1e-6f;
        System.out.println(f);
        f+=0.002f;
        System.out.println(f);
        f+=3;
        System.out.println(f);
        f+=4000;
        System.out.println(f);
*/
/*      double d = 1e-305 * Math.PI;
        System.out.println(d);
        for (int i = 0; i < 4; i++)
        System.out.println(d /= 100000);
*/
/*      class Point {
            int x, y;

            *//**
             * Конструктор принимает 2 аргумента,
             * которыми инициализирует поля объекта.
             *//*
            Point (int newx, int newy){
                x=newx;
                y=newy;
            }
        }

        Point p1=new Point(2,3);
        Point p2=p1;
        Point p3=new Point(2,3);
        System.out.println(p1==p2);
        System.out.println(p1==p3);
*/

//        String s = "abc";
//        Class cl=s.getClass();
//        System.out.println(cl.getName());

/*        class Point {
            int x, y;
            Point (int newx, int newy){
                x=newx;
                y=newy;
            }
        }

        Point p1=new Point(2,3);
        Point p2=new Point(2,3);
        System.out.println(p1.equals(p2));
*/

    }
}
