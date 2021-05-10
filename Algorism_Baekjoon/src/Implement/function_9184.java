package Implement;

import java.util.*;

public class function_9184 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=0, b=0, c=0;
		
		while(true) {	
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();	
			if (a == -1 && b == -1 && c == -1) 
				break;
			System.out.printf("w(%d, %d, %d) = %d\n", a, b, c, W(a, b, c));
		}	
	}

	private static int W(int a, int b, int c) {
		int result = 0;		
		if (a<=0 || b<=0 || c<=0) result=1;
		else if (a>20 || b>20 || c>20) W(20, 20, 20);
		else if (a<b && b<c) 
			result = W(a, b, c-1) + W(a, b-1, c-1) - W(a, b-1, c);
		else
			result = W(a-1, b, c) + W(a-1, b-1, c) + W(a-1, b, c-1) - W(a-1, b-1, c-1);
		return result;
	}

}
