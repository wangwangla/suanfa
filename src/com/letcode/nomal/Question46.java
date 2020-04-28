package com.letcode.nomal;

public class Question46 {
    public static void main(String[] args) {
        String str = "12:12:12PM";
        String temp = "";
        String substring = str.substring(8, str.length());
        temp = str.substring(0,8);
        if (substring.equals("PM")){
            String substring1 = str.substring(0, 2);
            int tempInteger = Integer.parseInt(substring1);
            int target = tempInteger+ 12;
            if (target == 24){
                temp = "00" + str.substring(2,8);
            }else {
                temp = target + str.substring(2, 8);
            }
        }

        System.out.println(temp);
    }
}
