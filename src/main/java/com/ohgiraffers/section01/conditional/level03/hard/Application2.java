package com.ohgiraffers.section01.conditional.level03.hard;

import java.util.HashMap;
import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {

		/* 과일 이름("사과", "바나나", "복숭아", "키위") 중 한 가지를 문자열로 입력하면
		 * 해당하는 가격에 맞게 상품명과 가격이 출ㅅ력되게 하세요.
		 * 단, 목록에 없는 과일을 입력 시 "준비된 상품이 없습니다." 출력 후 프로그램 종료
		 *
		 * -- 상품 가격 --
		 * 사과 :  1000원
		 * 바나나 : 3000원
		 * 복숭아 : 2000원
		 * 키위 : 5000원
		 *
		 * -- 입력 예시 --
		 * 과일 이름을 입력하세요 : 바나나
		 *
		 * -- 출력 예시 --
		 * 바나나의 가격은 3000원 입니다.
		 * */
		HashMap<String, Integer> hm = new HashMap<>();
		Scanner sc = new Scanner(System.in);

		/* 해쉬맵에 정보 입력 */
		hm.put("사과", 1000);
		hm.put("바나나", 3000);
		hm.put("복숭아", 2000);
		hm.put("키위", 5000);

		System.out.print("과일 이름을 입력하세요 : ");
		String fruitName = sc.nextLine();

		/* 찾는 과일이 있는 경우와 없는 경우로 나뉨 */
		if (hm.containsKey(fruitName)) {	// 입력받은 과일 이름의 키 존재 시 true
			int price = hm.get(fruitName);	// key의 value(가격 값)을 가져온다.
			System.out.println(fruitName + "의 가격은 " + price + "원 입니다.");
		} else {
			System.out.println("찾는 과일은 없습니다. ");
		}
	}
}
