package Mar23;

// 배열
/*
-- 숫자의 개수 2577
첫째 줄에 A, 둘째 줄에 B, 셋째 줄에 C가 주어진다. 
A, B, C는 모두 100보다 같거나 크고, 1,000보다 작은 자연수이다.
첫째 줄에는 A × B × C의 결과에 0 이 몇 번 쓰였는지 출력한다. 
마찬가지로 둘째 줄부터 열 번째 줄까지 A × B × C의 결과에 1부터 9까지의 숫자가 각각 몇 번 쓰였는지 차례로 한 줄에 하나씩 출력한다.
*/
import java.util.*;

public class Array_2577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();		
		long b = sc.nextLong();
		long c = sc.nextLong();
		sc.nextLine();
		
		String result = String.valueOf(a*b*c);
		
		for (int j=0; j<=9; j++) {

			int cnt = 0;
			for (int i=0; i<result.length(); i++) {
				if(j==result.charAt(i)-'0') {
					cnt++;			
				}
			}	
			System.out.println(cnt);
		}
		
		sc.close();
	}

}
