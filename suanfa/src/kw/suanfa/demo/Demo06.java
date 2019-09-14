package kw.suanfa.demo;

public class Demo06 {
	public static void main(String[] args) {
		str(new String("1.1.1.1"));
	}
	
	public static void str(String str) {
		
	}
	
	public String defangIPaddr(String address) {
		StringBuffer s = new StringBuffer();
		for(int i=0;i<address.length();i++) {
			if(address.charAt(i)=='.') {
				s.append("[.]");
			}else {
				s.append(address.charAt(i));
			}
		}
		return s.toString();
    }
	
}
