package kw.suanfa.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 **最长子串** 的长度。
 * @author Administrator
 *
 */
public class Demo03 {
	public static void main(String[] args) {
		an();
	}
	
	public static void an() {
		String str = "abdchdj";
		Map<Character, Integer> m = new HashMap<Character,Integer>();
		char [] c = str.toCharArray();
		int max = 0;
		int index =0;
		for(int i=0;i<c.length;i++) {
			if(!m.containsKey(c[i])) {
				m.put(c[i], 1);
			}else {
				m.put(c[i], 1);
				while(m.size()>0&&m.containsKey(c[i])) {
					m.remove(c[index]);
					index++;
				}
				
			}
			if(m.size()>max) {
				max = m.size();
			}
		}
		System.out.println(max);
	}
	 public int lengthOfLongestSubstring(String s) {
		Map<Character, Integer> m = new HashMap<Character,Integer>();
		char [] c = s.toCharArray();
		int max = 0;
		for(int i=0;i<c.length;i++) {
			if(!m.containsKey(c[i])) {
				m.put(c[i], 1);
			}else {
				if(m.size()>max) {
					max = m.size();
				}
				m.clear();
			}
			
		}
		return max;
 
	 }
}
