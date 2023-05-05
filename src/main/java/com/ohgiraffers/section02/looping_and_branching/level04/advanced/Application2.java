package com.ohgiraffers.section02.looping_and_branching.level04.advanced;

import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("받으신 금액을 입력하세요 : " );
		int money = sc.nextInt();

		System.out.print("상품 가격을 입력하세요 : " );
		int pay = sc.nextInt();

		int[] payList = {50000, 10000, 5000, 1000, 500, 100, 50, 10};	// if문 나열 막기 위해 사용
		int returns = money - pay;

		System.out.println("=================================");
		for (int i : payList) {											// 불러오기만 하기 때문에 향상 for문 사용
			System.out.println( i > 500?i+"원권 지폐 "+returns/i+"장":i+"원권 동전 "+ returns/i + "개");
			returns = returns % i;
		}
		System.out.println("=================================");
		System.out.println("거스름돈 : " + (money-pay) + "원");

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


	}

}
