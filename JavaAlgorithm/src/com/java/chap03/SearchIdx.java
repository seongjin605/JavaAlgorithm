package com.java.chap03;

import java.util.Scanner;

public class SearchIdx {

	public static int searchidx(int[] x, int n, int key, int[] idx) {
		int count = 0;
		for (int i = 0; i <= n - 1; i++) {
			if(x[i]==key){
				idx[i]=x[i];
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("배열의 요솟수 n :");
		int n = sc.nextInt();
		int x[] = new int[n];
		int y[] = new int[n];

		for (int i = 0; i <= n - 1; i++) {
			System.out.println("요수 입력 n[" + i + "]=");
			x[i] = sc.nextInt();
		}

		System.out.println("key 값을 입력:");
		int key = sc.nextInt();
		int result=searchidx(x, n, key, y);
		System.out.println("결과:"+result);
	}

}
