package April20;

import java.util.Scanner;

public class DFS_2667 {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		System.out.println(repeat(cnt)%15746);	
	}
	
	public static int repeat(int a) {
		int n = 0;
		if(a==0) n=0;
		else if(a==1) n=1;
		else if(a==2) n=2;
		else n=repeat(a-2)+repeat(a-1);
		return n;
	}

}

/*
import java.util.Scanner;
 
public class Main {
 
	public static int[] dp = new int[1000001];;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		
		
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 2;
 
		// -1 로 초기화
		for(int i = 3; i < dp.length; i++) {
			dp[i] = -1;
		}
		
		System.out.println(Tile(N));
		
	}
	
	public static int Tile(int N) {
		
		if(dp[N] == -1) {
			dp[N] = (Tile(N - 1) + Tile((N - 2))) % 15746;
		}
		return dp[N];
	}
 
}
*/
