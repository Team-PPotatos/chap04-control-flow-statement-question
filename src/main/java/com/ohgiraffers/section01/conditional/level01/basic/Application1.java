package com.ohgiraffers.section01.conditional.level01.basic;
import java.util.Scanner;

public class Application1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 하나 입력하세요 : ");
		int a = sc.nextInt();
		System.out.println(a>=0?"양수다":"양수가 아니다."); // a가 0보다 크거나 같은경우 양수

		/* 정수를 하나 입력 받아 그 수가 양수이면 "양수다." 라고 출력하고,
		 * 양수가 아닌 경우 "양수가 아니다." 라고 출력하세요
		 * 
		 * -- 입력 예시 --
		 * 정수를 하나 입력하세요 : 5
		 * 
		 * -- 출력 예시 --
		 * 양수다.
		 * */

	}

}
