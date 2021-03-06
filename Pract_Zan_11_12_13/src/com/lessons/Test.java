package com.lessons;

import java.util.*;
import java.text.*;
import java.io.*;

 class MyResource extends ListResourceBundle {
    Vector v = new Vector();
    Object[][] resources = {
            {"StringKey","String"},
            {"DoubleKey",new Double(0.0)},
            {"VectorKey",v},
    };
    public MyResource() {
        super();
        v.add("Element 1");
        v.add("Element 2");
        v.add("Element 3");
    }
    protected Object[][] getContents() {
        return resources;
    }
}
public class Test {
    public Test() {
    }
    public static void main(String[] args) {
        Test test = new Test();
        ResourceBundle rb = ResourceBundle.getBundle("com.lessons.MyResource",Locale.getDefault());
        Vector v = (Vector)rb.getObject("VectorKey");
        Iterator it = v.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}