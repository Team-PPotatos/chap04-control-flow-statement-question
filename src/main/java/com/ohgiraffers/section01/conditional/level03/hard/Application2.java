package com.ohgiraffers.section01.conditional.level03.hard;

import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("과일 이름을 적어주세요 : ");
		String fruit = sc.next();
		switch (fruit){
			case "사과" :
				System.out.println(fruit + "의 가격은 1000원 입니다.");
				break;

			case "바나나" :
				System.out.println(fruit + "의 가격은 3000원 입니다.");
				break;

			case "복숭아" :
				System.out.println(fruit + "의 가격은 2000원 입니다.");
				break;

			case "키위" :
				System.out.println(fruit + "의 가격은 5000원 입니다.");
				break;

			default:
				System.out.println("해당 과일은 준비되지 않았습니다.");
		}

	}
}
