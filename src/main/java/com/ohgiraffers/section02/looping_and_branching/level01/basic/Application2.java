package com.ohgiraffers.section02.looping_and_branching.level01.basic;

import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int i = sc.nextInt();
		int result = 0;
		for(int j = 0; j <= i; j++){
			result += j;
		}
		System.out.println("1부터 " + i + "까지의 합 : " + result);
	}

}
