package com.java.chap02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q4 {
/*	public static List rcopy(int[] a, int[] b) {
		
		List resultList=new ArrayList<>();
			for (int i =b.length; i <=1; i--) {
				a[i] = b[i];
				resultList.add(a[i]);
			}
			return resultList;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("a의 배열 갯수 입력:");
		int aCount = sc.nextInt();
		int a[] = new int[aCount];
		for (int i = 0; i <= a.length - 1; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = sc.nextInt();
		}

		System.out.println("b의 배열 갯수 입력:");
		int bCount = sc.nextInt();
		int b[] = new int[bCount];
		for (int i = 0; i <= b.length - 1; i++) {
			System.out.print("b[" + i + "] = ");
			b[i] = sc.nextInt();
		}
		List resultList=new ArrayList<>();
		resultList.add(rcopy(a, b));
		

		System.out.println("=== 배열 b의 모든 요소를 배열 a에 역순으로 변환 ===");
		for (int i = 0; i <= a.length - 1; i++) {
			System.out.println(resultList.get(i));
		}
	}*/
	//커스터마이징 method말고 자바 method를 활용한 배열 복사
	//System.arraycopy(src, srcPos, dest, destPos, length); 
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("a의 배열 갯수 입력:");
		int aCount = sc.nextInt();
		int a[] = new int[aCount];
		for (int i = 0; i <= a.length - 1; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = sc.nextInt();
		}

		System.out.println("b의 배열 갯수 입력:");
		int bCount = sc.nextInt();
		int b[] = new int[bCount];
		for (int i = 0; i <= b.length - 1; i++) {
			System.out.print("b[" + i + "] = ");
			b[i] = sc.nextInt();
		}
		System.arraycopy(b, 0, a, 0, a.length);


		System.out.println("=== 배열 b의 모든 요소를 배열 a에 역순으로 변환 ===");
		for (Integer value : a) {
			System.out.println(value);
		}
	}
}
