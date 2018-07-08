package com.java.chap01;

import java.util.Scanner;

public class SumWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*		Scanner sc=new Scanner(System.in);
		
		System.out.println("1부터 n까지 합을 구합니다.");
		
		System.out.println("n의 값:");
		int n=sc.nextInt();
		
		int sum=0;
		int i=1;
		while(i<=n) {
			sum+=i;
			i++;
		}
		System.out.println("1부터 "+n+"까지의 합은 :"+sum+"입니다.");*/
		
		
		/**
		 * @author psj
		 * p30 Q8
		 
		Scanner sc=new Scanner(System.in);
		
		System.out.println("=====가우스의 덧셈=====");
		System.out.println("n값 입력:");
		int n=sc.nextInt();
		
		//가우스 덧셈의 공식
		int sum=(1+n)*n/2;
		
		System.out.println("합계:"+sum);*/
		
		Scanner sc=new Scanner(System.in);
		
		int a,b;
		  
		System.out.println("a의 값:");
		a=sc.nextInt();
		System.out.println("b의 값:");
		b=sc.nextInt();
		
		System.out.println(sumof(a, b));
	}
	public static int sumof(int a, int b) {
		int sum=0;
		for(int i=a; i<=b; i++) {
			sum+=i;
		}
		
		return sum;
	}
}
