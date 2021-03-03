package Mar2;


// 그리디 알고리즘
/*
- 동전0 11047
준규가 가지고 있는 동전은 총 N종류이고, 각각의 동전을 매우 많이 가지고 있다.
동전을 적절히 사용해서 그 가치의 합을 K로 만들려고 한다. 
이때 필요한 동전 개수의 최솟값을 구하는 프로그램을 작성하시오.

첫째 줄에 N과 K가 주어진다. (1 ≤ N ≤ 10, 1 ≤ K ≤ 100,000,000)
둘째 줄부터 N개의 줄에 동전의 가치 Ai가 오름차순으로 주어진다. 
(1 ≤ Ai ≤ 1,000,000, A1 = 1, i ≥ 2인 경우에 Ai는 Ai-1의 배수)
*/

import java.util.Scanner;

public class greedy_11047 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		int sum = 0;
		
		int[] moneyArr = new int[n+1];
		
		for (int i=0; i<n; i++) moneyArr[i]=sc.nextInt();
		for (int i=n; i>0; i--) {
			if(moneyArr[i]!=0) {
				sum += k/moneyArr[i];
				k=k%moneyArr[i];
			}
		}
		
		System.out.println(sum);
		sc.close();
	}
}

/*
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, m = 0, n = sc.nextInt(), k = sc.nextInt();
		int a[] = new int[n + 1];
		for (i = 1; i <= n; i++) a[i] = sc.nextInt();
		for(i=n;i>0;i--){
			m+=k/a[i];
            k%=a[i];
		}
		System.out.println(m);
        sc.close();
	}
} 
*/
