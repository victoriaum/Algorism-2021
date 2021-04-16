package Mar3;

// 문자열 
/*
-- 크로아티아 알파벳 2941
예를 들어, ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다. 
단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
dž는 무조건 하나의 알파벳으로 쓰이고, d와 ž가 분리된 것으로 보지 않는다. 
lj와 nj도 마찬가지이다. 위 목록에 없는 알파벳은 한 글자씩 센다.

https://st-lab.tistory.com/68
*/

import java.io.*;

public class string_2941 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		
		int len = a.length();
		int cnt = 0;
		
		for (int i=0; i<len; i++) {
			char ch = a.charAt(i);
			
			if(i<len-1) {
				if(ch=='c' && (a.charAt(i+1)=='=' || a.charAt(i+1)=='-'))
					i++;
				else if(ch=='d' && a.charAt(i+1)=='-')
					i++;
				else if(ch=='l' && a.charAt(i+1)=='j')
					i++;
				else if(ch=='n' && a.charAt(i+1)=='j')
					i++;
				else if(ch=='s' && a.charAt(i+1)=='=')
					i++;
				else if(ch=='z' && a.charAt(i+1)=='=')
					i++;

			} 
			
			if(i<len-2) {
				if(ch=='d' && a.charAt(i+1)=='z' && a.charAt(i+2)=='=')
					i+=2;
			} 
			
			cnt++;
		}
		
		System.out.println(cnt);

		br.close();
		
	}
}
