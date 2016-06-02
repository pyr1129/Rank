package com.quickRank;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class QuickRank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {3,17,3,8,5,6,9,1,11,2,10,7,4 };
		quickRank(0,11, a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static int[] readTxt(String path) throws IOException {
		int a[] = new int[20];
		try {
			File file = new File(path);
			FileInputStream fis = new FileInputStream(file);
			InputStreamReader isr = new InputStreamReader(fis, "GBK");
			BufferedReader reader = new BufferedReader(isr);
			int i = 0;
			String num;
			while ((num = reader.readLine()) != null) {
				a[i] = Integer.parseInt(num);
				i++;
			}

		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a;
	}

	public static void quickRank(int i, int j, int a[]) {
		if(i>=j)
			return;
		int start=i;
		int end=j;
		int flag=a[i];
		while(i<j){
			while(i<j&&a[j]>=flag)
				j--;
			if(i<j)
				a[i++]=a[j];
			while(i<j&&a[i]<flag)
				i++;
			if(i<j)
				a[j--]=a[i];
		}
		a[i]=flag;
		quickRank(start,i-1,a);
		quickRank(i+1, end, a);
	}

}
