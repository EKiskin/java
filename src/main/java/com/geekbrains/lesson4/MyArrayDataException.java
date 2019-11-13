package com.geekbrains.lesson4;

public class MyArrayDataException extends Exception {
    private int i;
    private int j;

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

    public MyArrayDataException (int i, int j) {
        super();
        this.i = i;
        this.j = j;
    }
}
