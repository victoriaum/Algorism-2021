package Mar15;

/*
-- 블랙잭 2798
첫째 줄에 카드의 개수 N(3 ≤ N ≤ 100)과 M(10 ≤ M ≤ 300,000)이 주어진다. 
둘째 줄에는 카드에 쓰여 있는 수가 주어지며, 이 값은 100,000을 넘지 않는 양의 정수이다.
합이 M을 넘지 않는 카드 3장을 찾을 수 있는 경우만 입력으로 주어진다.

첫째 줄에 M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합을 출력한다.

★★★ 세가지 수의 합을 더할때 for문의 제한값을 잘 생각하기!
*/

// 

//

//
 

import java.util.*;

public class bruteforce_2798 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cardnum = sc.nextInt();
		int value = sc.nextInt();
		int max = 0, sum = 0;
		int[] intArr = new int[cardnum];
		
		
		for (int i=0; i<intArr.length; i++) {
			intArr[i]=sc.nextInt();
		}
		sc.nextLine();
		
		for (int i=0; i<intArr.length-2; i++) {
			for (int j=i+1; j<intArr.length-1; j++) {
				for (int l=j+1; l<intArr.length; l++) {
					sum = intArr[i]+intArr[j]+intArr[l];
					if (sum<=value) max = Math.max(max,sum);
				}
			}
			
		}
		
		System.out.print(max);
		sc.close();		
	}
	
}