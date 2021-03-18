package Mar18;

// 문자열
/*
-- 단어의 개수 1152
영어 대소문자와 띄어쓰기만으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을까? 
이를 구하는 프로그램을 작성하시오. 
단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.
*/
import java.util.*;

public class String_1152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int cnt=0;
		int last = str.length();
		
		if(str.charAt(0)==' ') cnt--;
		if(str.charAt(last-1)==' ') cnt--;
		
		for (int i=0; i<last; i++) {
			if(str.charAt(i)==' ')
				cnt++;				
		}	
		
		System.out.println(cnt+1);
		sc.close();
	}
}
