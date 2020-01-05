package kw.letcode;

public class Demo04 {
    public static void main(String[] args) {
        reverse(9);
    }

    public static int reverse(int x) {
        String s = new String(x+"");
        StringBuilder builder = new StringBuilder();
        int num = 0;
        if (x<0){
            for (int i = 1; i < s.length(); i++) {
                builder.append(s.charAt(s.length()-i));
            }
            num = Integer.parseInt(builder.toString());
            num = -num;
        }else {
            for (int i = 1; i <=s.length(); i++) {
                builder.append(s.charAt(s.length()-i));
            }
            num = Integer.parseInt(builder.toString());
        }
        System.out.println(num);
        return num;
    }
}
