package com.ohgiraffers.section01.conditional.level04.advanced;

import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("월 급여를 입력하세요 : ");
		int salary = sc.nextInt();
		System.out.print("월 매출액을 입력하세요 : ");
		int profit = sc.nextInt();
		double bonus;

		if(profit >= 10000000 && profit < 30000000){
			bonus = 0.01;
		} else if (profit >= 30000000 && profit < 50000000) {
			bonus = 0.03;
		} else if (profit >= 50000000){
			bonus = 0.05;
		} else {
			bonus = 0;
		}
		double bonusSalary = profit * bonus;
		double total = salary + (bonusSalary);
		System.out.println("======================================");
		System.out.println("매출액 : " + profit);
		System.out.println("보너스율 : " + bonus * 100 + "%");
		System.out.println("월 급여 : " + salary);
		System.out.println("보너스 금액 : " + bonusSalary);
		System.out.println("======================================");
		System.out.println("총 급여 : " + total);
	}

}
