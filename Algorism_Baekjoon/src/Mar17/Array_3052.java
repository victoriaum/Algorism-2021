package Mar17;

// 배열
/*
-- 나머지 3052
첫째 줄부터 열번째 줄 까지 숫자가 한 줄에 하나씩 주어진다. 
이 숫자는 1,000보다 작거나 같고, 음이 아닌 정수이다.
첫째 줄에, 42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력한다.
*/
import java.util.*;

public class Array_3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> input = new ArrayList<>();
		List<Integer> remainder = new ArrayList<>();
		int cnt = 0;
		
		for (int i=0; i<10; i++) {
			input.add(sc.nextInt());
			remainder.add(input.get(i)%42);
		}
		sc.nextLine();
		
		for (int i=0; i<remainder.size()-1; i++) {
			for (int j=i+1; j<remainder.size(); j++) {
				if(remainder.get(i)==remainder.get(j)) {
					cnt++;
					break;
				}
			}
		}
		
		System.out.println(10-cnt);
	
		sc.close();
	}
}
