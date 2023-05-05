package com.ohgiraffers.section02.looping_and_branching.level02.normal;

import java.util.Scanner;

public class Application3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int i = sc.nextInt();
		String result = "";
		for(int j = 1; j <= i; j++){
			if(j % 2 == 0){
				result += "박";
			}else{
				result += "수";
				}
			}
		System.out.println(result);
	}
	}
