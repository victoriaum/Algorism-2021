package Retry;

import java.util.Scanner;

public class Math_12852 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		do {
			if(cnt>cnt2) {
				System.out.println(cnt2);
			} else {
				System.out.println(cnt);
			} 
		} while(true);		
	}
	
	static int cnt=0, cnt2=0;
	static String[] str = new String[]; 
			
	public static int makeOne (int num) {
		int n = 0;
		if(num%3==0) {
			n=num/3;
		} else if(num%2==0) {
			n=num/2;
		} else {
			n=num-1;
		}
		cnt++;
		if(n!=1) return makeOne(n);
		else return 1;
	}
	
	public static int makeOne2 (int num) {
		int n = 0;
		if(num%2==0) {
			n=num/2;
		} else if(num%3==0) {
			n=num/3;
		} else {
			n=num-1;
		}
		cnt2++;
		if(n!=1) return makeOne2(n);
		else return 1;
	}

}
