package Implement;
// 기본수학1
/*
-- 직사각형에서 탈출
한수는 지금 (x, y)에 있다. 직사각형의 왼쪽 아래 꼭짓점은 (0, 0)에 있고, 
오른쪽 위 꼭짓점은 (w, h)에 있다. 직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.
*/

import java.util.Scanner;

public class Math_1085 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int h = sc.nextInt();
		int w = sc.nextInt();   
		sc.nextLine();
		
		System.out.println(Math.min(Math.min(x, h-x), Math.min(y,w-y)));
		sc.close();
	}

}
