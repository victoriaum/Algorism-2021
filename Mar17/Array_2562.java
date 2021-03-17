package Mar17;

// 배열
/*
-- 최댓값 2562
첫째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 
주어지는 자연수는 100 보다 작다.
첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지를 출력한다.
*/
import java.util.*;

public class Array_2562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> listArr = new ArrayList<>();
		int no = 0;
		
		for (int i=0; i<9; i++) {
			listArr.add(sc.nextInt());
		}
		
		int max = Collections.max(listArr);
		
		for (int i=0; i<9; i++) {
			if(listArr.get(i)==max) {
				no=i;
				break;
			}
		}
		
		
		System.out.println(max);
		System.out.println(no+1);
		
		sc.close();
	}

}
