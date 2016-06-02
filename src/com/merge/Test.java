package com.merge;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,5,6,1,3,9,8,4,7};
		mergeSort(a,0,a.length-1);
		for(int s:a){
			System.out.println(s);
		}
	}
	
	public static void merge(int a[],int l,int m,int r){
		int n1=m-l+1;
		int n2=r-m;
		int[] L=new int[n1];
		int[] R=new int[n2];
//		int i,j,k;
		for(int i=0,k=l;i<n1;i++,k++){
			L[i]=a[k];
		}
		for(int i=0,k=m+1;i<n2;i++,k++){
			R[i]=a[k];
		}
		
		int k,i,j;
		for(k=l,i=0,j=0;i<n1&&j<n2;k++){
			if(L[i]<R[j]){
				a[k]=L[i];
				i++;
			}
			else{
				a[k]=R[j];
				j++;
			}
		}
		
		if(i<n1){
			for(int n=i;n<n1;n++){
				a[k]=L[n];
				k++;
			}
		}
		if(j<n2){
			for(int n=j;n<n2;n++){
				a[k]=R[n];
				k++;
			}
		}
	}
	
	
	public static void mergeSort(int[] a,int l,int r){
		if(l<r){
			int m=(l+r)/2;
			mergeSort(a,l,m);
			mergeSort(a,m+1,r);
			merge(a,l,m,r);
		}
	}

}
