/*
package kw.letcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

*/
/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * 将数据放入数组
 *//*

public class Demo03 {
    public int lengthOfLongestSubstring(String s) {
        String s1 ;
        int arr[] = new int[26];
        int max = 0;

        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if (arr[c - 98] != 0) {
                arr[c - 98] = i - arr[c - 98];
            }
            max = Math.max(arr[c-98],i);
        }
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    public int lengthOfLongestSubstring1(String s) {
        */
/*
        *      st = {}
        i, ans = 0, 0
        for j in range(len(s)):
            if s[j] in st:
                i = max(st[s[j]], i)
            ans = max(ans, j - i + 1)
            st[s[j]] = j + 1
        return ans;
        * *//*

        int st[] = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (st.contains(s.charAt(i))){
                i = Math.max(st.get(s.charAt(i),i));
            }

        }
        return max;
    }




}
*/
