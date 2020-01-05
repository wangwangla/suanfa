package kw.letcode;

import java.util.HashMap;
import java.util.HashSet;

public class Demo01 {
    public static void main(String[] args) {
        int indexs[] = new int[2];
    }
    /**
     * 最初的想法：
     *  for 便利 然后得到第二个参数  for for
     *
     *  不是答案的数据放入map,为下次的数据查找提供方便
     */
    public void sum(int arr[],int target){
        int indexs [] = new int[2];
        HashMap<Integer,Integer> hashMap = new HashMap();
        for (int i = 0; i < arr.length; i++) {
            if (hashMap.containsKey(arr[i])){
                indexs[0] = i;
                indexs[1] = hashMap.get(arr[i]);
            }
            hashMap.put(target - arr[i],i);
        }
    }
/*

    public void sum1(int arr[],int target){
        int indexs [] = new int[2];
        HashMap<Integer,Integer> hashMap = new HashMap();
        for (int i = 0; i < arr.length; i++) {
            if (hashMap.containsKey(arr[i])){

            }
            hashMap.put(target - arr[i],i);
        }
    }
*/

}
