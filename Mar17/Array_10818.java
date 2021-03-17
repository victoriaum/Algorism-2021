package Mar17;

// 배열
/*
-- 최소, 최대 10818
첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 
모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
*/
import java.util.*;

public class Array_10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		List<Integer> listArr = new ArrayList<>();
		
		for (int i=0; i<x; i++) {
			listArr.add(sc.nextInt());
		}
		
		int min = Collections.min(listArr);
		int max = Collections.max(listArr);
		
		System.out.println(min+" "+max);
		
		sc.close();
	}

}
