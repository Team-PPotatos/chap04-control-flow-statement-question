package com.ohgiraffers.section01.conditional.level04.advanced;

import java.util.ArrayList;
import java.util.Scanner;

public class Application1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<String> subjectList = new ArrayList<String>();	// 가상의 array 생성

		System.out.print("국어 점수를 입력하세요 : ");
		int korean = sc.nextInt();
		System.out.print("영어 점수를 입력하세요 : ");
		int english = sc.nextInt();
		System.out.print("수학 점수를 입력하세요: ");
		int math = sc.nextInt();

		int average = (korean + english + math) / 3;

		if (average >= 60 && korean >= 40 && english >= 40 && math >= 40) {
			System.out.println("합격입니다!");
		} else {
			if (korean < 40) {
				subjectList.add("국어");								// 해당 과목에 문제가 있을 경우 add
			}
			if (english < 40) {
				subjectList.add("영어");
			}
			if (math < 40) {
				subjectList.add("수학");
			}
			if (average < 60) {
				subjectList.add("평균");
			}
		}

		for (String s : subjectList){
			System.out.println(s+ " 점수 미달로 불합격 입니다.");		// array 안에 있는걸 하나씩 get
		}

		/* 국어, 영어, 수학 점수를 입력받아
		 * 평균 점수가 60점 이상이면서 각 과목이 40점 이상인 조건이 만족하면 "합격입니다!" 를 출력하세요,
		 * 단, 합격이 아닌 경우 불합격 사유가 무엇인지를 모두 출력해주어야 합니다.
		 * 평균점수 미달인 경우 "평균점수 미달로 불합격입니다." 라고 출력하고,
		 * 과목당 과락 점수가 있는 경우 "xx 과목의 점수 미달로 불합격 입니다." 출력하세요
		 * 
		 * -- 입력 예시 --
		 * 국어 점수를 입력하세요 : 60
		 * 영어 점수를 입력하세요 : 30
		 * 수학 점수를 입력하세요 : 20
		 * 
		 * -- 출력 예시 --
		 * 평균 점수 미달로 불합격입니다.
		 * 영어 점수 미달로 불합격입니다.
		 * 수학 점수 미달로 불합격입니다.
		 * */

	}

}
