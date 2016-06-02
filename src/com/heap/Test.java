package com.heap;

import javax.naming.ldap.SortControl;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,5,6,1,3,9,8,4};
		MaxHeapSort(a);
		for(int s:a){
			System.out.println(s);
		}

	}
		
	public static void adjustMaxHeap(int[] a,int par, int len){
		int temp;
		int child;
		for(temp=a[par];2*par+1<len;par=child){
			child=2*par+1;
			if(a[child]<a[child+1])
				child++;
			if(temp<a[child])
				a[par]=a[child];
			else
				break;
		}
		a[par]=temp;//
	}
	
	public static void MaxHeapSort(int[] a){
		int len=a.length;
		int i;
		for(i=len/2-1;i>=0;i--){
			adjustMaxHeap(a, i, len-1);//从中间节点开始调整的堆
		}
		for(i=len-1;i>=0;i--){
			int tmp=a[i];
			a[i]=a[0];
			a[0]=tmp;
			adjustMaxHeap(a, 0, i-1);//第一个和最后一个交换后的堆调整，此时的a【i】个已经是最大的了
		}
	}

}
