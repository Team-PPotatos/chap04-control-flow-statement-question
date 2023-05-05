package com.ohgiraffers.section01.conditional.level03.hard;

import java.util.Arrays;
import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {

		String[] foodArray = {"사과", "바나나", "복숭아", "키위"};
		System.out.println("-- 상품 가격 --\n 사과 : 1000원 \n 바나나 : 3000원 \n 복숭아 : 2000원 \n 키위 : 5000원");

		System.out.println("과일 이름을 입력하세요. : ");
		Scanner sc = new Scanner(System.in);
		String fruit = sc.nextLine();


		if (!Arrays.asList(foodArray).contains(fruit)){	// 해당 과일이 있는지 확인
			System.out.println("준비된 상품이 없습니다.");
		} else {
			int price = 0;

			switch (fruit) {
				case "사과":
					price = 1000;
					break;
				case "바나나":
					price = 3000;
					break;
				case "복숭아":
					price = 2000;
					break;
				case "키위":
					price = 5000;
					break;
			}
			System.out.println(fruit + "의 가격은 "+ price);
		}
		/* 과일 이름("사과", "바나나", "복숭아", "키위") 중 한 가지를 문자열로 입려하면
		 * 해당하는 가격에 맞게 상품명과 가격이 출력되게 하세요.
		 * 단, 목록에 없는 과일을 입력 시 "준비된 상품이 없습니다." 출력 후 프로그램 종료
		 * 
		 * -- 상품 가격 --
		 * 사과 :  1000원
		 * 바나나 : 3000원
		 * 복숭아 : 2000원
		 * 키위 : 5000원
		 * 
		 * -- 입력 예시 --
		 * 과일 이름을 입력하세요 : 바나나
		 * 
		 * -- 출력 예시 --
		 * 바나나의 가격은 3000원 입니다.
		 * */

	}

}
