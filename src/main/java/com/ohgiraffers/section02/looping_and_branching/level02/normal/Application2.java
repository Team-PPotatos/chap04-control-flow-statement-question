package com.ohgiraffers.section02.looping_and_branching.level02.normal;

import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String result = "";
		for(char i = 'a'; i <= 'z'; i++){
			result += i;
		}
		System.out.println(result);
	}

}
