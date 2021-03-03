package Mar3;

// 문자열 
/*
-- 다이얼 5622
전화를 걸고 싶은 번호가 있다면, 숫자를 하나를 누른 다음에 금속 핀이 있는 곳 까지 시계방향으로 돌려야 한다. 
숫자를 하나 누르면 다이얼이 처음 위치로 돌아가고, 다음 숫자를 누르려면 다이얼을 처음 위치에서 다시 돌려야 한다.
숫자 1을 걸려면 총 2초가 필요하다. 1보다 큰 수를 거는데 걸리는 시간은 이보다 더 걸리며, 
한 칸 옆에 있는 숫자를 걸기 위해선 1초씩 더 걸린다.
상근이의 할머니는 전화 번호를 각 숫자에 해당하는 문자로 외운다. 
즉, 어떤 단어를 걸 때, 각 알파벳에 해당하는 숫자를 걸면 된다. 예를 들어, UNUCIC는 868242와 같다.
할머니가 외운 단어가 주어졌을 때, 이 전화를 걸기 위해서 필요한 최소 시간을 구하는 프로그램을 작성하시오.
*/

import java.io.*;

public class string_5622 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		
		int len = a.length();
		int time = 0;
		int result = 0;
		
		for (int i=0; i<len; i++) {
			char ch = a.charAt(i);
			
			if(65<=ch&&ch<=67)	time = 3;
			else if(68<=ch&&ch<=70)	time = 4;
			else if(71<=ch&&ch<=73)	time = 5;
			else if(74<=ch&&ch<=76)	time = 6;
			else if(77<=ch&&ch<=79)	time = 7;
			else if(80<=ch&&ch<=83)	time = 8;
			else if(84<=ch&&ch<=86)	time = 9;
			else if(87<=ch&&ch<=90)	time = 10;
			
			result += time;
			
			
		}
		
		System.out.println(result);

		br.close();
		
	}
}
