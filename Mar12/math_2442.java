package Mar12;

/*
-- 별찍기 - 5 2442 
첫째 줄에는 별 1개, 둘째 줄에는 별 3개, ..., N번째 줄에는 별 2×N-1개를 찍는 문제
별은 가운데를 기준으로 대칭이어야 한다.
*/

import java.util.*;

public class math_2442 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.nextLine();
		
		for (int i=0; i<input; i++) {	
			for (int j=i+1; j<input; j++) {	
				System.out.print(" ");
			}
			for (int j=input-i*2; j<input+1; j++) {	
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		
		sc.close();		
	}
	
}