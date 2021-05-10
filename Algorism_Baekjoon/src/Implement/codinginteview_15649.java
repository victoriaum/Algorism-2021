package Implement;

import java.util.Scanner;

public class codinginteview_15649 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		int N = s.nextInt();
		
		int dp[] = new int[1001];
		
		dp[0]=0;
		dp[1]=1;
		dp[2]=2;
		
			
		for(int i=3;i<=N;i++) {
			dp[i]= (dp[i-1]+dp[i-2]) % 10007;
		}
        
		System.out.println(dp[N]);
		
	}
}
