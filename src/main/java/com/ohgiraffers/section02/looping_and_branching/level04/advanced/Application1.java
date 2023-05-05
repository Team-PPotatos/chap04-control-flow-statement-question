package com.ohgiraffers.section02.looping_and_branching.level04.advanced;

import java.util.Scanner;

public class Application1 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("변환 할 문자열을 입력 해 주세요 : ");
		String str = sc.nextLine();
		System.out.print("숫자를 입력 해 주세요 : ");
		int i = sc.nextInt();
		String answer = "";
		for(int j = 0; j < str.length(); j++){
			char letter = str.charAt(j);
			if(letter == ' '){
				answer += letter;
				continue;
			}
			if(letter >= 'a' && letter <= 'z'){
				if(letter + i > 'z'){
					answer += (char) (letter - 26 + i);
				}else {
					answer += (char) (letter + i);
				}
			}else if(letter >= 'A' && letter <= 'Z'){
				if(letter + i > 'Z'){
					answer += (char) (letter - 26 + i);
				}else {
					answer += (char) (letter + i);
				}
			}
		}
		System.out.println(answer);

	}
	
}
