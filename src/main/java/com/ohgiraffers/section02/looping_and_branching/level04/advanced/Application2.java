package com.ohgiraffers.section02.looping_and_branching.level04.advanced;

import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("받은 금액 : ");
		int receive = sc.nextInt();
		System.out.print("상품 금액 : ");
		int pay = sc.nextInt();
		int change[] = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		int give = receive - pay;
		int gave = receive - pay;

		System.out.println("======================================");
		for(int i : change){
			System.out.println(i > 500?i+"원권 지폐 " + give/i +"장 ":i+"원권 동전 " + give/i+"개");
			give = give % i;
		}
		System.out.println("======================================");
		System.out.println("거스름돈 : " + gave + "원");


	}

}
