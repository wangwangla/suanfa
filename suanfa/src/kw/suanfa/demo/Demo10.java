package kw.suanfa.demo;

import java.util.Random;
/**
 * 模拟投掷硬币，不过代码是有问题的
 * @author Administrator
 *
 */
public class Demo10 {
	public static void main(String[] args) {
		int arr[] = new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=0;
		}
		int cnt = 0;
		for(int i=0;i<20;i++,arr[cnt]++) {
			cnt = 0;
			for(int j=0;j<=10;j++) {
				if(heads())cnt++;
			}
		}
		for(int j =0 ;j<=10;j++) {
			System.out.print(j+"");
			for(int i=0;i<arr[j];i+=10) {
				System.out.println("*");
			
			}
			System.out.println("\n");
		}
	}
	public static boolean heads() {
		Random random = new Random();
		int i= random.nextInt(10);
		System.out.println(i+"====");
		return i<10/2;
	}
}
