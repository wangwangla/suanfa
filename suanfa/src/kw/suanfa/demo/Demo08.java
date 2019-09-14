package kw.suanfa.demo;

public class Demo08 {
	public static void main(String[] args) {
		int i,j;
		int a[] = new int[100];
		for(i=2;i<100;i++) {
			a[i]=1;
		}
		for(i=2;i<100;i++) {
		//	System.out.println(a[j]);
			if(a[i]==1) {
				for(j=i;j<100/i;j++) {
					a[i*j]=0;
				}
			}
		}
		for(i=2;i<100;i++) {
			if(a[i]==1) {
				System.out.println(i+" ");
			}
		}
	}
}
