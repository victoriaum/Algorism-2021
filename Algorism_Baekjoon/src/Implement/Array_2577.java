package Implement;

// ë°°ì—´
/*
-- ?ˆ«??˜ ê°œìˆ˜ 2577
ì²«ì§¸ ì¤„ì— A, ?‘˜ì§? ì¤„ì— B, ?…‹ì§? ì¤„ì— Cê°? ì£¼ì–´ì§„ë‹¤. 
A, B, C?Š” ëª¨ë‘ 100ë³´ë‹¤ ê°™ê±°?‚˜ ?¬ê³?, 1,000ë³´ë‹¤ ?‘?? ??—°?ˆ˜?´?‹¤.
ì²«ì§¸ ì¤„ì—?Š” A Ã— B Ã— C?˜ ê²°ê³¼?— 0 ?´ ëª? ë²? ?“°???Š”ì§? ì¶œë ¥?•œ?‹¤. 
ë§ˆì°¬ê°?ì§?ë¡? ?‘˜ì§? ì¤„ë??„° ?—´ ë²ˆì§¸ ì¤„ê¹Œì§? A Ã— B Ã— C?˜ ê²°ê³¼?— 1ë¶??„° 9ê¹Œì??˜ ?ˆ«?ê°? ê°ê° ëª? ë²? ?“°???Š”ì§? ì°¨ë?ë¡? ?•œ ì¤„ì— ?•˜?‚˜?”© ì¶œë ¥?•œ?‹¤.
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
