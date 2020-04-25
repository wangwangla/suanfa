package kw.test.other.chpter5;

/**
 * 递归
 */
public class Demo01 {

    public int test(int n){
        if (n == 0){
           return 1;
        }
        return n * test(n - 1);
    }
}

/**
 *  10 * 9 * 8
 */
