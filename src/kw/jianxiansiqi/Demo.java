package kw.jianxiansiqi;

public class Demo {
    public static void main(String[] args) {

    }

    /**
     * 冒泡法
     */
    public void maopao(int arr[],int length){
        for(boolean sorted = false;sorted = !sorted;length--){
            for (int i = 0; i < length; i++) {
                if (arr[i-1]>arr[i]){
                    //互换

                    sorted = false;
                }
            }
        }
    }

    public int digui(int arr[],int n){
        return (n<1)?0:digui(arr,n-1)+arr[n-1];
    }

    public void reseve(int arr[],int lo,int hi){
        if (hi>lo){
            //交换

            reseve(arr,lo+1,hi+1);
        }
    }

    public void reseve1(int arr[],int lo,int hi){
        while (hi>lo){
            //交换
         //   swap(arr[lo++],arr[hi++]);
        }
    }

    //减而知之    分而治之

    //分而治之 求和
    public int sum(int arr[],int lo,int hi){
        if (lo == hi){
            return arr[lo];
        }
        int mi = (lo + hi) >> 1;
        return sum(arr,lo,mi)+sum(arr,mi+1,hi);
    }


}
