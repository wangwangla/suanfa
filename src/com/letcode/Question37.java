package com.letcode;

/**
 * 打印出字符串
 * 例子：
 * 1        开始为1
 * 11       1个1
 * 21       2个1
 * 1211     1个11个22个1
 * 111221   ……
 */
public class Question37 {
    public static void show(int n){
        String startStr = 1+"";
        String strTemp = "";
        int count = 0;
        for (int i = 1; i < n; i++) {
            char[] chars = startStr.toCharArray();
            for (int j = 0; j < chars.length; j++) {
                char c = chars[j];
                while (j<chars.length){
                    if (c!=chars[j]){break;}
                    count++;
                    j++;
                }
                strTemp += count+""+c;
                count = 0;
                j=j-1;
            }
            startStr = strTemp;

            strTemp="";
            System.out.println(startStr);
        }
    }

    public static void main(String[] args) {
        show(6);
    }
    public static void show2(int n){
        //初始值
        String startStr = 1+"";
//        输出的值
        String strTemp = "";
        //计数
        int count = 0;
//        第n行
        for (int i = 1; i < n; i++) {
            char[] chars = startStr.toCharArray();
            for (int j = 0; j < chars.length; j++) {
                char c = chars[j];
                while (j<chars.length){
                    if (c!=chars[j]){break;}
                    count++;
                    j++;
                }
                strTemp += count+""+c;
                count = 0;
                //这个减去1的目的是在for循环计算的时候，先+1在比较
                j=j-1;
            }
            startStr = strTemp;

            strTemp="";
            System.out.println(startStr);
        }
    }

}
