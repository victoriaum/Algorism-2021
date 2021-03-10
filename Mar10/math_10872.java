package Mar10;


//재귀
/*
- 팩토리얼 10872
0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
*/

import java.util.Scanner;

public class math_10872 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.nextLine();
		
		System.out.println(fac(a));
		
		sc.close();
	}

	private static int fac(int a) {
		
		if(a<=1) {
			return 1;
		}
		else {
			return a*fac(a-1);

		}
	}
	
}