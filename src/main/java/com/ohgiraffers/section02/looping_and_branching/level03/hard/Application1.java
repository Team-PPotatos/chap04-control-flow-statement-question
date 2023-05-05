package com.ohgiraffers.section02.looping_and_branching.level03.hard;

import java.util.Scanner;

public class Application1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("2보다 큰 정수를 입력 하세요 : ");
		int i = sc.nextInt();
		if (i < 2) {
			System.out.println("2보다 큰 수를 입력 해 주세요");
		} else if (i == 2) {
			System.out.println("소수 입니다.");
		} else if (i > 2) {
			for (int j = 2; j < i; j++) {
				boolean isPrime = true;
				if (i % j == 0) {
					isPrime = false;
					System.out.println("소수가 아닙니다.");
					break;
				}
				if(isPrime){
					System.out.println("소수 입니다.");
					break;
				}
			}
		}
	}
}

