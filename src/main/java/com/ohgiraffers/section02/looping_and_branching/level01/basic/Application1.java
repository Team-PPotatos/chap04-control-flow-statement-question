package com.ohgiraffers.section02.looping_and_branching.level01.basic;

public class Application1 {

	public static void main(String[] args) {

		int result = 0;
		for(int i = 0; i < 11; i++){
			 result += i;
		}

		System.out.println("1부터 10까지의 합 : " + result);
	}

}
