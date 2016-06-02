package com.select;

public class SelectSort {
	public static void main(String[] args){
		int[] a={3,5,6,1,8,4,2,6,9};
		selectSort(a);
		for(int s:a){
			System.out.println(s);
		}
	}
	
	public static void selectSort(int[] a){
		int tmp=0;
		int index=0;
		int len=a.length;
		for(int i=0;i<len;i++){
			tmp=a[i];
			index=i;
			for(int j=i+1;j<len;j++){
				if(a[j]<tmp){
					index=j;
					tmp=a[j];
				}
			}
			if(index!=i){
				a[index]=a[i];
				a[i]=tmp;
			}
			
		}
	}
	
}
