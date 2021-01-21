/*
 	Introduction
 	1. Scanner로 두 정수, 사칙연산자 입력받기
 	2. Method를 이용해서 Main클래스에서 계산수행하기
 	   //***main메서드의 내용과 answer메서드를 연동하기 위해 파라미터를 이용해 타입을 맞춰줘야 한다
 	   //***클래스명.메서드명(파라미터)으로 메서드 사용하기
 */

package scanner;

import java.util.Scanner;

public class Ex1ScannerMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String cal, num1, num2;
		
		System.out.print("첫번째 정수 => ");
		num1 = sc.nextLine();
		
		System.out.print("두번째 정수 => ");
		num2 = sc.nextLine();
		
		System.out.print("계산기호 => ");
		cal = sc.nextLine();
		
		System.out.println(Method.answer(sc, cal, num1, num2));
		
		sc.close();
	}

}
