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
		int a[] = { 8,5,6,9,1,11,2,10,7,4 };
		quickRank(0, 9, a);
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
		if (i > j) {
			return;
		}
		int left, right, temp, flag;
		left = i;
		right = j;

		flag = a[i];

		while (left != right) {

			while (a[right] >= flag && left < right)
				right--;

			while (a[left] <= flag && left < right)
				left++;
			
			if (left < right) {
				temp = a[left];
				a[left] = a[right];
				a[right] = temp;
			}

		}
		System.out.println(left+"	"+flag);
		a[i] = a[left];
		a[left] = flag;
		quickRank(i, left-1, a);
		quickRank(left+1 , j, a);
		return;
	}

}
