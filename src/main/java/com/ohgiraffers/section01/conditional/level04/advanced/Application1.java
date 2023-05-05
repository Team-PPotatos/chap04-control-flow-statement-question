package com.ohgiraffers.section01.conditional.level04.advanced;

import java.util.Scanner;

public class Application1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수를 입력하세요 : ");
		int korean = sc.nextInt();
		System.out.print("영어 점수를 입력하세요 : ");
		int english = sc.nextInt();
		System.out.print("수학 점수를 입력하세요 : ");
		int math = sc.nextInt();

		int avg = (korean + english + math) / 3;

		if (avg >= 40) {
			if (korean >= 60 && english >= 60 && math >= 60) {
				System.out.println("합격입니다.");
			}
		}
		if (korean < 60) {
			System.out.println("국어 점수 미달로 불합격 입니다.");
		}
		if (english < 60) {
			System.out.println("영어 점수 미달로 불합격 입니다.");
		}
		if (math < 60) {
			System.out.println("수학 점수 미달로 불합격 입니다.");
		}
		if(avg < 40){
			System.out.println("평균 점수 미달입니다.");
		}
	}
}
