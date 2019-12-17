package kw.test.chpter2;

/**
 * 求最大连续和
 *
 *
 * 比较麻烦，i从0开始，
 */
public class Demo01 {
    public static void main(String[] args) {
        int [] arr = {2,5,4,3,2,5,-20};
        demo01(arr);
    }
    public static void demo01(int [] a){
        int tot = 0;
        int best = a[1];
        for (int i = 1; i <=a.length ; i++) {
            for (int j = i; j <= a.length; j++) {
                int sum = 0;
                for (int k = i-1; k < j; k++) {
                    sum += a[k];
                    tot++;
                }
                if (sum > best){
                    best = sum;
                }
            }
        }
        System.out.println(best);
    }
}
