package kw.suanfa.demo;

public class Demo14 {
	public static void sort() {
		
		int[] arr1=new int[4];
		arr1[0]=1;
		arr1[1]=7;
		arr1[2]=2;
		arr1[3]=5;
		int[] arr2=new int[3];
		arr2[0]=4;
		arr2[1]=6;
		arr2[2]=3;
		
		int length = arr1.length + arr2.length;
		int[] arr3 = new int[length];
		int z=0;
		
		for(int i=0;i<arr1.length;i++) {
			arr3[z] = arr1[i];
			z++;
		}
		for(int i=0;i<arr2.length;i++) {
			arr3[z] = arr2[i];
			z++;
		}
		int a = 0;
		for(int i=0;i<length/2+1;i++) {
			for(int j=0;j<length-1-i;j++) {
				if(arr3[j]>arr3[j+1]) {
					a = arr3[j];
					arr3[j]=arr3[j+1];
					arr3[j+1]=a;
				}
			}
		}
		if(length%2==0) {
			System.out.println((arr3[length/2]+arr3[length/2-1])/2.0);	
		}else {
			System.out.println(arr3[length/2]);
		}
		
	}
	public static void main(String[] args) {
		/*sort();*/
		int[] arr1=new int[4];
		arr1[0]=1;
		arr1[1]=7;
		arr1[2]=2;
		arr1[3]=5;
		sortArr(arr1);
	}
	public static void sortArr(int arr3[]) {
		int a = 0;
		int length = arr3.length;
		for(int i=0;i<length/2+1;i++) {
			for(int j=0;j<length-1-i;j++) {
				if(arr3[j]>arr3[j+1]) {
					a = arr3[j];
					arr3[j]=arr3[j+1];
					arr3[j+1]=a;
				}
			}
		}
		for(int i=0;i<length;i++) {
			System.out.println(arr3[i]);
		}
	}
	
	public static void sortAr(int arr1[],int arr2[]) {
		int a = 0,b=0,i=0;
		int n = (a+b)/2;
		while(i<n) {
			if(arr1[a]>arr2[b]) {
				b++;
				i++;
			}
			if(arr1[a]<arr2[b]) {
				a++;
				i++;
			}
			else {
				
			}
		}
	}
	
	
}
