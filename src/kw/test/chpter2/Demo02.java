package kw.test.chpter2;

/**
 * 查看计算0到10亿花费多久时间
 */
public class Demo02 {
    public static void main(String[] args) {
        int i,j,k,count = 0;
        int N = 10000;
        Long start = System.currentTimeMillis();
        for (int l = 0; l < N; l++) {
            for (int m = 0; m < N; m++) {
                for (int n = 0; n < N; n++) {
                    count++;
                }
            }
        }
        System.out.println(System.currentTimeMillis() - start);
    }
}
