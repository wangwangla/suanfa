package com.test.array;
/**
 * ���������Ĳ���Ƚ����˷�װ
 * 
 * ���а���û�жԱ߽磬��������ݽ��д�������ֻΪ��ʾʹ�ã���һ���֣����պ��氲����������
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
	 * ���벿���Լ����п��ƣ������ǵ����߽��е�
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