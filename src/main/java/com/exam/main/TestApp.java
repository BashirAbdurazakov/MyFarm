package com.exam.main;

public class
TestApp {

    private static final int MAX_TEXT_VIEW_SIZE = 18;


    public static void main(String[] args) {


        StringBuilder stringBuilder = new StringBuilder();
        String text = "123123sdawdsd";
//        text.
//        stringBuilder.substring()
        for (int i = 1; i < 51; i++){
            if(i == 18){
//                stringBuilder.
            }
            stringBuilder.append(i + "\n");
        }


    }


    public static int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}


