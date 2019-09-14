package com.test.array;
/**
 * 这个将数组的插入等进行了封装
 * 
 * 所有案例没有对边界，数组的扩容进行处理，仅仅只为演示使用，这一部分，按照后面安排在做决定
 * @author Administrator
 *
 */
public class HighArray {
	public static void main(String[] args) {
		
	}

}
class HiArray{
	private long[] a;
	private int nElems;
	public HiArray(int max) {
		a = new long[max];
		nElems = 0;
	}
	public boolean find(long seach) {
		int j=0;
		for(j=0;j<nElems;j++) {
			if(a[j]==seach) {
				break;
			}
		}
		if(j==nElems)
			return false;
		else
			return true;
	}
	/**
	 * 插入部分自己进行控制，而不是调用者进行的
	 * @param value
	 */
	public void insert(long value) {
		a[nElems]=value;
		nElems++;
	}
	
	public boolean delete(long value) {
		int j;
		for(j=0;j<nElems;j++) {
			if(value == a[j])
				break;
		}
		if(j==nElems) {
			return false;
		}else {
			for(int k=j;k<nElems;k++) {
				a[k] =a[k+1];
			}
			nElems--;
			return true;
		}
	}
}