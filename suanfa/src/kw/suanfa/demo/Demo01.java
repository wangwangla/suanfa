package kw.suanfa.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * 	����һ���������� nums ��һ��Ŀ��ֵ target�������ڸ��������ҳ���ΪĿ��ֵ���� ���� ���������������ǵ������±ꡣ
 *
 */
public class Demo01 {
    public int[] twoSum1(int[] nums, int target) {
		int [] arr = new int[2];
		int data;
    	for(int i=0;i<nums.length;i++) {
    		data = target-nums[i];
    		for(int j=0;j<i;j++) {
				if(data == nums[j]) {
					arr[0]=i;
					arr[1]=j;
				}
			}
		}
		return arr;
	}
    
    public int[] twoSum2(int[] nums, int target) {
    	
		int [] arr = new int[2];
		Map<Integer,Integer> m = new HashMap<>();
		int data;
    	//�Ƚ����е�����װ��һ��������
		for(int i=0;i<nums.length;i++) {
    		m.put(nums[i], i);
    	}
    	//ѭ����������
		for(int i=0;i<nums.length;i++) {
			data = target-nums[i];
			if(m.containsKey(data)) {
				arr[0]=i;
				arr[1]=m.get(nums[i]);
			}
	 	}
		return arr;
	}
    
    
    public static void main(String[] args) {
    		int target = 6;
    		int [] nums = {3,2,4};
        	
    		int [] arr = new int[2];
    		Map<Integer,Integer> m = new HashMap<>();
    		int data;
        	//�Ƚ����е�����װ��һ��������
    		for(int i=0;i<nums.length;i++) {
        		m.put(nums[i], i);
        	}
        	//ѭ����������
    		for(int i=0;i<nums.length;i++) {
    			data = target-nums[i];
    			if(m.containsKey(data)&& m.get(data) != i) {
    				arr[0]=i;
    				arr[1]=m.get(data);
    			}
    	 	}
        
	}
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int [] arr = new int[2];
    		int data;
        	for(int i=0;i<nums.length;i++) {
        		data = target-nums[i];
        		for(int j=0;j<i;j++) {
    				if(data == nums[j]) {
    					arr[0]=i;
    					arr[1]=j;
    				}
    			}
    		}
    		return arr;
        }
    }
}
