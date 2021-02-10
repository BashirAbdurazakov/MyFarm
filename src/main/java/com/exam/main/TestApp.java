package com.exam.main;

public class TestApp {
    public static void main(String[] args) {
        System.out.println(rnd(2, 5));
    }


    public static int rnd(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}


