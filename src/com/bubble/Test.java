package com.bubble;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {8,5,6,9,1,11,2,10,7,4};
		bubbleSort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	public static void bubbleSort(int[] a){
		int len=a.length;
		for(int i=0;i<len;i++){
			for(int j=len-1;j>i;j--){
				if(a[j]<a[j-1]){
					int tmp=a[j];
					a[j]=a[j-1];
					a[j-1]=tmp;
				}
			}		
		}
	}

}
