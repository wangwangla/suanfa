package kw.suanfa.demo;

public class Demo13 {
	public static int maxArea(int height[]) {
		int max = 0;
        int i=0,j=height.length-1;
        while(i<j) {
        	max = Math.max(Math.min(height[i],height[j])*(j-i),max);
        	if(height[i]<height[j]) {
        		i++;
        	}else {
        		j--;
        	}
        }
		return max;
    }
	public static void main(String[] args) {
		int []height =new int[4];
		height[0]=1;
		height[1]=2;
		height[2]=4;
		height[3]=3;
	    
		System.out.println(maxArea(height));
		System.out.println(maxArea2(height));
		
	}
	
    public static int maxArea2(int[] height) {
        int maxarea = 0, l = 0, r = height.length - 1;
        while (l < r) {
            maxarea = Math.max(maxarea, Math.min(height[l], height[r]) * (r - l));
            if (height[l] < height[r])
                l++;
            else
                r--;
        }
        return maxarea;
    }
}
