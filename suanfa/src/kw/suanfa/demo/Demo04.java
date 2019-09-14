package kw.suanfa.demo;

public class Demo04 {
	public static void main(String[] args) {
		System.out.println(reverse(1534236469));
								   
	}
	public static int reverse(int x) {    
		if(x>Integer.MAX_VALUE||x<Integer.MIN_VALUE) {
			return 0;
		}
		int temp=0;
		int mod;
		boolean flag=false;
		if(x<0) {
			x = -x;
			flag = true;
		}
		while(x>0) {
			mod = x%10;
			 if(temp > Integer.MAX_VALUE/10||temp<Integer.MIN_VALUE/10)
			temp = temp*10+mod;
			x = x/10;
		}
		if(flag) {
			return -temp;
		}else {
			return temp;
		}
	}
}
