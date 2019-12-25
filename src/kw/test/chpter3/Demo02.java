package kw.test.chpter3;

import java.util.Random;

/**
 * 模拟硬币   有问题
 */
public class Demo02 {
    public static void main(String[] args) {
        int f [] = new int[30];
        for (int i = 0; i < 10; i++) {
            f[i] = 0;
        }
        Random random = new Random(System.currentTimeMillis());
        int c =0 , j = 0;
        for (int i = 0; i < 18; i++,f[c] ++) {
            for (c = 0,j=0;j<=10;j++ ){
                random.nextInt(Integer.MAX_VALUE);
                if (random.nextBoolean()){
                    c ++;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int k = 0; k < f[j]; k+=10) {
                System.out.println("*");
            }
            System.out.println("\n");
        }
    }
}
