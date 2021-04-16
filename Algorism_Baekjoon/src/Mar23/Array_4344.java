package Mar23;

// 배열
/*
-- 평균은 넘겠지 4344
첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 
이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
*/
import java.util.*;

public class Array_4344 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		double sum=0;
		int num=0;
		int[] scoreArr = null;
		
		for (int j=0; j<testcase; j++) {
			int student = sc.nextInt();
			
			for (int i=0; i<student; i++) {
				scoreArr = new int[student];
				scoreArr[i]=sc.nextInt();
				sum += scoreArr[i];
			}
				
			for (int i=0; i<student; i++) {
				System.out.println(scoreArr[i]);
				if(scoreArr[i]>sum/student) {
					num++;
				}	
			}
			
			System.out.printf("%.3f",num/student*100);
			System.out.println("%");
		}
		
		
		sc.close();
	}

}
