package Feb24;

//for문
/*
- 별찍기1 2438
첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
*/

import java.util.Scanner;

public class for_2438 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for (int i=0; i<a; i++) {
			for (int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	    sc.close();
	}

}
