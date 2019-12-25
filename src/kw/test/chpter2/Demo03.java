package kw.test.chpter2;

/**
 * 顺序搜索
 *
 */
public class Demo03 {
    //顺序搜索
    public int search(int a[],int v ,int l,int r){
        for (int i = l; i < r; i++) {
            if (v == a[i]) return i;
        }
        return -1;
    }

    //有序表，我们就只是搜索比目标小或者大的数据

    /**
     * 搜索永远不会超过lgN + 1
     * @param a
     * @param v
     * @param l
     * @param r
     * @return
     */
    public int searchBin(int a[],int v, int l ,int r){
        while (r>l){
            int m = (l+r)/2;
            if (v == a[m]){
                return m;
            }
            if (v < a[m]) r = m - 1;
            else l = m+1;
        }
        return -1;
    }
}
