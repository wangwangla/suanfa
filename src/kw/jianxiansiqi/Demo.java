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

    //计算出一个数组中的两个最大值和次大值
    /**
     * 实现思路就是，先指定两个数，一个最大一个最小
     * 
     * 遍历数据，求出最大的值，并且更新x1和x2
     */
    public void find(int arr[],int lo ,int hi ,int x1,int x2){
        if(arr[lo]>arr[lo+1]){
            x1 = arr[lo];
            x2 = arr[lo+1]
        }else{
            x1 = arr[lo+1];
            x2 = arr[lo];
        }
        for(int i=2;i<arr.length;i++){
            if(x2>arr[i]){
                x2 = arr[i];
                if(x1<x2){
                    int temp = x1;
                    x1 = x2;
                    x2 = temp;
                }
            }
        }
    }


    //递归的写法
    public int fbnq(int n){
        return (n<2)?0:fbnq(n)+fbnq(n-1);
    }



    //fbnq
    //时间复杂度  n
    public int fun(){
        f = 0;
        g = 1;
        int n = 10;
        while(0 < n--){
            g = g + f;
            f = g - f;
        }
        return g;
    }
}
