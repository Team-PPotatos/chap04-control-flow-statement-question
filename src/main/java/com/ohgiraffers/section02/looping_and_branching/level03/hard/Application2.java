package com.ohgiraffers.section02.looping_and_branching.level03.hard;

import java.util.Random;
import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {

		Random random = new Random();
		int randomNum = random.nextInt(100) + 1;
		Scanner sc = new Scanner(System.in);
		int i;
		int answerCount = 0;
		System.out.println("1~100 사이의 정수를 입력해 주세요");
		do{
			answerCount++;
			System.out.println("정답 : ");
			i = sc.nextInt();
			if(i < randomNum){
				System.out.println("작습니다");
			}
			if(i > randomNum){
				System.out.println("큽니다");
			}
		} while(i != randomNum);
			System.out.println("정답입니다. " + answerCount + "회 만에 맞추셨습니다.");
	}

}
