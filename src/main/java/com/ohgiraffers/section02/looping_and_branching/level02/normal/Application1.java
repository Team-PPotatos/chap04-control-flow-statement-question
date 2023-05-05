package com.ohgiraffers.section02.looping_and_branching.level02.normal;

import java.util.Scanner;

public class Application1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		for(int i = 0; i < str.length(); i ++){
			System.out.println(i + " : " + str.charAt(i));
		}
	}

}
