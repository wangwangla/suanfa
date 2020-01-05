package kw.letcode;

public class Demo06 {
    public static void main(String[] args) {
        String string[] = {"abca","abc"};
        System.out.println(longestCommonPrefix(string));
    }
        public static String longestCommonPrefix(String[] strs) {
            if(strs.length==0){
                return "";
            }
            String res = "";
            char char1 = ' ',char2 = ' ';
            for (int i=0;i<strs.length;i++){
                for(int j = 0;j < strs.length;j++){
                    try{
                        char1 = strs[j].charAt(i);
                        System.out.println(char1);
                        char2 = strs[0].charAt(i);
                        if(char1!= char2){
                            return res;
                        }
                    }catch(Exception e){
                        return res;
                    }
                }
                res += char1;
            }
            return res;
        }

}
