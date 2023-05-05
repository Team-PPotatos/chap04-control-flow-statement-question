package com.ohgiraffers.section01.conditional.level03.hard;

import java.util.Scanner;

public class Application1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int result;
		System.out.print("첫번째 정수 : ");
		int first = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int second = sc.nextInt();
		System.out.print("연산자를 입력하세요 (+, -, /, % 만 사용가능) : ");
		char c = sc.next().charAt(0);
		switch (c){
			case '+':
				result = first + second;
				System.out.println(first + " " + c + " " + second + " = " + result);
				break;

			case '-':
				result = first - second;
				System.out.println(first + " " + c + " " + second + " = " + result);
				break;

			case '/':
				result = first / second;
				System.out.println(first + " " + c + " " + second + " = " + result);
				break;

			case '%':
				result = first % second;
				System.out.println(first + " " + c + " " + second + " = " + result);
				break;

			default:
				System.out.println("입력한 연산은 없습니다. 프로그램을 종료합니다.");
		}


	}

}
