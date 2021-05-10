package Implement;

// ë¬¸ì?—´
/*
-- ?‹¨?–´?˜ ê°œìˆ˜ 1152
?˜?–´ ???†Œë¬¸ì?? ?„?–´?“°ê¸°ë§Œ?œ¼ë¡? ?´ë£¨ì–´ì§? ë¬¸ì?—´?´ ì£¼ì–´ì§„ë‹¤. ?´ ë¬¸ì?—´?—?Š” ëª? ê°œì˜ ?‹¨?–´ê°? ?ˆ?„ê¹?? 
?´ë¥? êµ¬í•˜?Š” ?”„ë¡œê·¸?¨?„ ?‘?„±?•˜?‹œ?˜¤. 
?‹¨, ?•œ ?‹¨?–´ê°? ?—¬?Ÿ¬ ë²? ?“±?¥?•˜ë©? ?“±?¥?•œ ?šŸ?ˆ˜ë§Œí¼ ëª¨ë‘ ?„¸?–´?•¼ ?•œ?‹¤.
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
