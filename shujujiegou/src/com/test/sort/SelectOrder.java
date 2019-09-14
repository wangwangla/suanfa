package com.test.sort;

/**
 * 选择排序基本就是每次只将一个数据排列出来。
 * @author Administrator
 *
 */
public class SelectOrder {
	public static void seletOrder(int arr[]) {
		int j=0;
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			j=i;
			for(int z=i+1;z<arr.length;z++) {
				if(arr[j]<arr[z]) {
					j=z;
				}
			}
			temp = arr[i];
			arr[i]=arr[j];
			arr[j] = temp;
		}
	}
	
	public static void main(String[] args) {
		int arr[] =new int[6];
		arr[0] = 6;
		arr[1] = 3;
		arr[2] = 7;
		arr[3] = 9;
		arr[4] = 1;
		arr[5] = 2;
		seletOrder(arr);
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]+"  ");
		}
	}
}

