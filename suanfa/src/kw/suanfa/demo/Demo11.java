package kw.suanfa.demo;

public class Demo11 {
	public static void main(String[] args) {
		int arr[] = new int[99];
		for(int i=0;i<99;i++) {
			arr[i] = 98-i;
		}
		
		for(int i =0 ;i<99;i++) {
			System.out.print(arr[i]+"--------");
		}
		
		System.out.println();	
		for(int i=0;i<99;i++) {
			arr[i] = arr[arr[i]];
		}
		
		
		for(int i =0 ;i<99;i++) {
			System.out.print(arr[i]+"--------");
		}
	}
}
