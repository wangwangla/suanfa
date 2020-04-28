package com.letcode.nomal;

public class Question40 {
    public static void method(String str){
        if (str == null){
            return;
        }
        String[] s = str.split(" ");
        for (int i = 0; i < s.length / 2; i++) {
            String temp = s[i];
            s[i] = s[s.length-i-1];
            s[s.length-1-i] = temp;
        }
        System.out.println(s.toString());
    }

    public static void main(String[] args) {
        method("I love you y !");
    }
}
