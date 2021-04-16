package Mar10;

import java.util.Scanner;

public class Greedy_1783 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.nextLine();
		int cnt = 0;
		
		if(n==1) cnt=1;
		else if(n==2 && m==2) cnt=1;
		else if(n<3 || m<7) cnt=4;
		else {
			if(n-3>m-7) cnt = (n-3)/3+16; 
			else (n-3<m-7) cnt = (n-3)/3+16;
		}
		
		System.out.println(cnt);
		sc.close();
	}

}

/*
	import java.util.*;
	public class Test{
		public static void main(String[] args){
			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			int m = scan.nextInt();
			int cnt =0;
			if(n==1)
				cnt = 1;
			else if(n==2)
				cnt = (int)Math.min(4, (m+1)/2);
			else
			{
				if(m<7)
					cnt = Math.min(4, m);
				else
					cnt = m-2;
			}
			System.out.println(cnt);
		}
	}
	[출처] [백준] 1783번: 병든 나이트(그리디, 구현)|작성자 주현
*/
