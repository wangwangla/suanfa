package com.test.array;

/**
 * ��������
 * �������������ڲ����ʱ�򣬽����ݲ��뵽һ��׼ȷ��λ����
 * @author Administrator
 *
 */
public class OrderArray {
	private long[]a;
	private int nElem;
	public OrderArray(int max) {
		a=new long[max];
		this.nElem = 0;
	}
	public int size() {
		return nElem;
	}
	public int find(long key) {
		int start = 0;
		int end = 0;
		int cur =0;
		while(true) {
			cur = (start+end)/2;
			if(a[cur]==key) {
				return cur;
			}else if(a[cur]>key) {
				end = cur-1;
			}else if(a[cur]<key) {
				start = cur+1;
			}else {
				return -1;
			}
		}
	}
	public void insertV(int value) {
		int i=0;
		for(i=0;i<nElem;i++) 
			if(a[i]>value) {
				break;
			}
		for(int j=nElem;j<i;j--) {
			a[j]=a[j-1];
		}
		a[i]=value;
		nElem++;
	}
	
	public boolean delete(long key) {
		int j = find(key);
		if(j==-1) {
			return false;
		}else {
			for(int k=j;k<nElem;k++) {
				a[k]=a[k+1];
			}
			nElem--;
			return true;
		}
	}
}
