package scanner;

import java.util.Scanner;

public class Method {

	static int result;
	
	static int answer(Scanner sc, String cal, String num1, String num2) {
		int numOne = Integer.parseInt(num1);
		int numTwo = Integer.parseInt(num2);
		if(cal.equals("+")) {
			result = numOne + numTwo;
		} else if(cal.equals("-")) {
			result = numOne - numTwo;
		} else if(cal.equals("*")) {
			result = numOne * numTwo;
		} else if(cal.equals("/")) {
			result = numOne / numTwo;
		} else
			System.out.println("사칙연산 중에서 다시 선택해 주세요!");	
	return result;
	}
	
}
