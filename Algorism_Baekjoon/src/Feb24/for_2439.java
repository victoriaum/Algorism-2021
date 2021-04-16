package Feb24;

//for문
/*
- 별찍기2 2439
첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
오른쪽정렬
*/

import java.util.Scanner;

public class for_2439 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for (int i=0; i<a; i++) {
			for (int j=a; j>i+1; j--) {
				System.out.print(" ");
			}
			for (int j=0; j<i+1; j++) {
				System.out.printf("%s","*");
			}
			System.out.print("\n");
		}
	    sc.close();
	}

}
