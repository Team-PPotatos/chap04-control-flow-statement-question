package com.ohgiraffers.section02.looping_and_branching.level04.advanced;

import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {

		/* 받은 금액을 입력 받고, 상품 가격을 입력 받아 거스름돈을 계산하는 프로그램을 작성하세요
		 * 
		 * 단, 거스름돈은 대한민국 화폐 단위 별 필요 수량이 출력되도록 작성하고,
		 * 지폐외 동전을 구분하여 단위를 표기하세요
		 * 
		 * -- 입력 예시 --
		 * 받으신 금액을 입력하세요 : 100000
		 * 상품 가격을 입력하세요 : 22340
		 * 
		 * -- 출력 예시 --
		 * ============================
		 * 50000원권 지폐 1장
		 * 10000원권 지폐 2장
		 * 5000원권 지폐 1장
		 * 1000원권 지폐 2장
		 * 500원권 동전 1개
		 * 100원권 동전 1개
		 * 50원권 동전 1개
		 * 10원권 동전 1개
		 * ============================
		 * 거스름돈 : 77660원
		 * */
		Scanner sc = new Scanner(System.in);

		System.out.print("받으신 금액을 입력하세요 : ");
		int money = sc.nextInt();

		System.out.print("상품 가격을 입력하세요 : ");
		int price = sc.nextInt();

		int change = money - price;		// 거스름돈 (for문에 사용)
		int changePrint = change;		// 마지막 거스름돈 출력을 위한 변수
		int currency = 50000;			// 화폐 시작 단위

		System.out.println("============================");

		/* 지폐 (5만원, 만원, 5천원, 천원)*/
		for (int i = 0; i < 4; i++) {
			System.out.println(currency + "원권 지폐 " + (change / currency) + "장");

			/* 화폐를 제외한 나머지 계산 */
			change %= currency;

			if (i % 2 == 0) {	// 5만원에서 만원, 5천원에서 천원으로 바뀔 때
				currency /= 5;
			} else {			// 만원에서 5천원으로 바뀔 때
				currency /= 2;
			}
		}

		/* 동전 (500원, 100원, 50원, 10원)*/
		for (int j = 0; j < 4; j++) {

			/* currency는 지폐쪽 for문을 돈 결과, 500이 대입되어 있다. */
			System.out.println(currency + "원권 동전 " + (change / currency) + "개");

			/* 동전을 제외한 나머지 계산 */
			change %= currency;

			if (j % 2 == 0) {	// 500원에서 100원, 50원에서 10원으로 바뀔 때
				currency /= 5;
			} else {			// 100원에서 50원으로 바뀔 때
				currency /= 2;
			}
		}
		System.out.println("============================");


		System.out.println("거스름돈 : " + changePrint);
	}
}
