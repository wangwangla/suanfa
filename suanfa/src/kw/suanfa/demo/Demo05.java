package kw.suanfa.demo;

public class Demo05 {
	public static void main(String[] args) {
		System.out.println(isPalindrome(121));
	}
    public static boolean isPalindrome(int x) {
        int num = 0;
        int temp=0;
        int y = x;
        if(x<0){
            return false;
        }else {
            while(x>0){
                temp = x%10;
                num = num*10+temp;
                x = x/10;
            }
            if(num==y){
                return true;
            }
        }
        return false;
    }
}
