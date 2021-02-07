/*
 	Introduction
 	=> 1byte 기본 Stream(system.in)을 이용한 파일과 콘솔 간 내용 출력 및 저장
 	1. 영문자(char)를 int로 출력하기
 		Condition
 		// 입력시 수행된 엔터 값은 char값을 나타내지 않는다.
 		// cmd에서 ctrl+c 값으로 프로그램 종료하도록 한다.
 */

package io;

import java.util.Scanner;

public class Ex_1StreamBasic {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print(">> 영단어를 입력하세요 : ");
		String input = sc.nextLine();
		
		char[] inputArr = input.toCharArray();
		
		for (int i=0; i<inputArr.length; i++) {
			//if((int)inputArr[i]!=)
			System.out.println("영문자 : "+inputArr[i]);
			System.out.println("숫자로의 변환 : "+(int)inputArr[i]+"\n");
		
		}
		
	}

}

/*
	>> 영단어를 입력하세요 : dog
	영문자 : d
	숫자로의 변환 : 100
	
	영문자 : o
	숫자로의 변환 : 111
	
	영문자 : g
	숫자로의 변환 : 103
*/
