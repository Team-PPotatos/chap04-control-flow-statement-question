package com.ohgiraffers.section01.conditional.level02.normal;

import java.util.Scanner;

public class Application1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("1에서 10 사이의 정수를 입력하세요 ");
		int i = sc.nextInt();
		if(i < 11 && i > 0) {
			if (i % 2 == 0) {
				System.out.println("짝수");
			} else {
				System.out.println("홀수");
			}
		}
		else{
			System.out.println("1~10 사이의 정수를 입력 하셔야 합니다.");
			}
		}
	}
