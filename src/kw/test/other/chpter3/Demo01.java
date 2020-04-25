package kw.test.other.chpter3;


/**
 * 求素数
 */
public class Demo01 {
    public static void main(String[] args) {
        Demo01 demo01 = new Demo01();
        demo01.sushu();
    }

    /**
     * 实现思路：
     *  （1）将所有的数据都设置为1，将不是素数的设置为0，然后素数的整数倍设置为0
     */
    private int N = 100;
    public void sushu(){
        int i,j;
        int arr [] = new int[N];
        for (int k = 2; k < N; k++) {
            arr[k] = 1;
        }
        for (int k = 0; k < N; k++) {
            if (arr[k] == 1){
                for (int l = k; l < N/k; l++) {
                    arr[k*l] = 0;
                }
            }
        }
        for (int k = 2; k < N; k++) {
            if (arr[k]==1){
                System.out.print(k+"   ");
            }
        }
    }
}
