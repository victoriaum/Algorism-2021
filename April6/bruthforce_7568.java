package April6;

//브루트포스
/*
-- 덩치 7568
첫 줄에는 전체 사람의 수 N이 주어진다. 
그리고 이어지는 N개의 줄에는 각 사람의 몸무게와 키를 나타내는 양의 정수 x와 y가 하나의 공백을 두고 각각 나타난다.
여러분은 입력에 나열된 사람의 덩치 등수를 구해서 그 순서대로 첫 줄에 출력해야 한다. 
단, 각 덩치 등수는 공백문자로 분리되어야 한다.
*/

import java.util.Scanner;

public class bruthforce_7568 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int[][] figure = new int[cnt+1][2];
		
		for (int i=0; i<cnt; i++) {
			figure[i][0] = sc.nextInt();
			figure[i][1] = sc.nextInt();	
		}
		
		int rank =0 ;
		
		for (int i=0; i<cnt; i++) {
			rank = 1;
			for (int j=0; j<cnt; j++) {
				if(figure[i][0]<figure[j][0] && figure[i][1]<figure[j][1]) {
					rank++;
				}
			}
			if(i==0) System.out.print(rank);
			else System.out.print(" "+rank);
		}
	}

}
