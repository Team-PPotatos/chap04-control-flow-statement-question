package com.ohgiraffers.section02.looping_and_branching.level03.hard;

import java.util.Scanner;

public class Application1 {

	public static void main(String[] args) {

		/* 2보다 큰 정수를 하나 입력 받아 그 수가 소수인지 아닌지를 판별해서 출력하세요
		 * 소수인 경우 "소수다." 출력, 소수가 아닌 경우 "소수가 아니다." 출력
		 * 
		 * 단, 2보다 큰 정수가 아닌 경우 "잘못 입력하셨습니다. 다시 입력하세요." 라고 출력 후
		 * 정수를 다시 입력 받을 수 있도록 한다. 
		 * 
		 * 소수란?
		 * 어떤 수를 1부터 자기 자신까지 차례대로 나누었을 때
		 * 나누어 떨어지는 수가 1과 자기 자신만 존재하는 수를 소수라고 한다.
		 * 
		 * -- 입력 예시 --
		 * 2보다 큰 정수를 하나 입력하세요 : 7
		 * 
		 * -- 출력 예시 --
		 * 소수다.
		 * */
		Scanner sc = new Scanner(System.in);
		int num = 0;

		System.out.print("2보다 큰 정수를 하나 입력하세요 : ");

		/* 3 이상의 값을 받기 전에는 계속 입력을 받게 한다. */
		while (num < 3) {
			num = sc.nextInt();
			if (num < 3) System.out.print("잘못 입력하셨습니다. 다시 입력하세요 : ");
		}

		/* 소수가 아닌게 판명되면 프로그램 종료 */
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println("소수가 아니다.");
				return;
			}
		}

		/* 반복문을 돌아도 나눠지는 수가 없었다. */
		System.out.println("소수다.");


	}

}
