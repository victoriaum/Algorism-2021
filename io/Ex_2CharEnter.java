/*
	Introduction
 	=> Enter 키를 제외한 문자의 숫자로의 변환
 	1. 영문자(char)를 int로 출력하기
 		Condition
 		// Scanner 사용없이 작성
 		// 입력시 수행된 엔터 값은 char값을 나타내지 않는다.
 		// cmd에서 ctrl+c 값으로 프로그램 종료하도록 한다.
 */

package io;

import java.io.IOException;

public class Ex_2CharEnter {

	public static void main(String[] args) {
		
		int input = 0;
	
		try {
			while ((input=System.in.read())!=-1) {
				if((int)input!=13 && (int)input!=10) {
					System.out.println("\n영문자 : "+(char)input);
					System.out.println("숫자로의 변환 : "+(int)input);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}

/*
	beautiful
	
	영문자 : b
	숫자로의 변환 : 98
	
	영문자 : e
	숫자로의 변환 : 101
	
	영문자 : a
	숫자로의 변환 : 97
	
	영문자 : u
	숫자로의 변환 : 117
	
	영문자 : t
	숫자로의 변환 : 116
	
	영문자 : i
	숫자로의 변환 : 105
	
	영문자 : f
	숫자로의 변환 : 102
	
	영문자 : u
	숫자로의 변환 : 117
	
	영문자 : l
	숫자로의 변환 : 108
*/
