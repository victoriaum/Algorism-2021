package Feb25;

//함수, 브루트포스 알고리즘
/*
- 한수 1065
어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. 
N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 
첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.
첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.
https://steemit.com/kr-dev/@gyeryak/easyalgo-2-bruteforce
*/

import java.util.Scanner;

public class function_1065 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int hansu = 0;
		
		for(int i=1;i<input+1;i++) {
			if(cnt(i)<3) hansu++; 
			else if(i/100+i%10==i/10%10*2) hansu++;
		}
		System.out.println(hansu);
		sc.close();
	}
	
	public static int cnt(int x) {
		int a = 1;
		for(int j=0; x/10!=0; j++) {
		    a++;	
			x=x/10;
		}
	return a;
	}	
}
