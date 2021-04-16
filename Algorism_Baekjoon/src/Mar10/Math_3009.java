package Mar10;

// 기본수학2
/*
-- 네번째 점 3009
세 점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 프로그램을 작성하시오.
*/

import java.util.Scanner;

public class Math_3009 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1=0,x2=0,x3=0,y1=0,y2=0,y3=0;
		
		x1 = sc.nextInt();
		y1 = sc.nextInt();
		x2 = sc.nextInt();
		y2 = sc.nextInt();
		x3 = sc.nextInt();
		y3 = sc.nextInt();
		sc.nextLine();
		
		int a = 0, b = 0;
		
		if(x1==x2) a=x3;
		else if(x1==x3) a=x2;
		if(x2==x3) a=x1;
		
		if(y1==y2) b=y3;
		else if(y1==y3) b=y2;
		if(y2==y3) b=y1;
		
		
		System.out.println(a+" "+b);

		sc.close();
	}

}
