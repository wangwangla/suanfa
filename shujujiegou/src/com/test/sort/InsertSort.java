package com.test.sort;

public class InsertSort {
	public static void insertSort(int arr[]) {
		int num = 0;
		for(int i=1;i<arr.length;i++) {
			//取出第一个
			//遍历一下
			for(int j=i;j>0;j--) {
				if(arr[j] < arr[j-1]) {
					num=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=num;
				}
			}
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
		insertSort(arr);
		for(int z = 0;z<arr.length;z++) {
			System.out.println(arr[z]);
		}
	}
}
