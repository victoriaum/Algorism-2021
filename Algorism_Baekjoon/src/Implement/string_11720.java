package Implement;

import java.util.Scanner;

public class string_11720 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cnt = sc.nextLine();
		String number = sc.nextLine();
		
		int sum = 0;
		char[] chArr = number.toCharArray();
	
		for (int i = 0; i < Integer.parseInt(cnt); i++) {
			sum += chArr[i] - '0';
		}
		System.out.println(sum);
		
		sc.close();
	}
	
}
