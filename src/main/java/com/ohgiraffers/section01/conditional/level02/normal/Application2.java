package com.ohgiraffers.section01.conditional.level02.normal;

import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("체중을 입력 해 주세요(kg 단위)");
		double weight = sc.nextDouble();
		System.out.println("키를 입력해주세요(m 단위)");
		double height = sc.nextDouble();
		double BMI = weight / (height * height);
		if (BMI > 0) {
			if (BMI < 20) {
				System.out.println("당신은 저체중 입니다.");
			} else if (BMI >= 20 && BMI < 25) {
				System.out.println("당신은 정상체중 입니다.");
			} else if (BMI >= 25 && BMI < 30) {
				System.out.println("당신은 과체중 입니다.");
			} else if (BMI >= 30) {
				System.out.println("당신은 비만 입니다.");
			}
		} else{ System.out.println("음수가 아닌 체중, 키를 입력해주세요");}
	}
}
