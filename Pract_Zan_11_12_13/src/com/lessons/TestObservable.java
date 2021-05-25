package com.lessons;

import java.util.*;
import java.text.*;

public class TestObservable extends java.util.Observable {
    private String name = "";
    public TestObservable(String name) {
        this.name = name;
    }

    public void modify() {
        setChanged();
    }

    public String getName() {
        return name;
    }
}