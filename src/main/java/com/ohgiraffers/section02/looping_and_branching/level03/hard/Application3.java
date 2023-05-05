package com.ohgiraffers.section02.looping_and_branching.level03.hard;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Application3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력 해 주세요 : ");
		String str = sc.nextLine();
		char letter;
		int count = 0;
		String pattern = "^[a-zA-Z]*$";
		boolean match = Pattern.matches(pattern, str);
		if(match != true) {
			System.out.println("영문자가 아닌 문자가 포함되어 있습니다.");
		}else{
			System.out.print("검색 할 문자를 입력 해 주세요 : ");
			letter = sc.nextLine().charAt(0);
			for (int i = 0; i < str.length(); i++) {
				if (letter == str.charAt(i)) {
					count++;
				}
			}
			System.out.println("포함된 갯수 : " + count);
		}
	}

}
