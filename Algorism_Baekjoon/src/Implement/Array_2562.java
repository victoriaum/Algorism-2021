package Implement;

// ë°°ì—´
/*
-- ìµœëŒ“ê°? 2562
ì²«ì§¸ ì¤„ë??„° ?•„?™‰ ë²ˆì§¸ ì¤„ê¹Œì§? ?•œ ì¤„ì— ?•˜?‚˜?˜ ??—°?ˆ˜ê°? ì£¼ì–´ì§„ë‹¤. 
ì£¼ì–´ì§??Š” ??—°?ˆ˜?Š” 100 ë³´ë‹¤ ?‘?‹¤.
ì²«ì§¸ ì¤„ì— ìµœëŒ“ê°’ì„ ì¶œë ¥?•˜ê³?, ?‘˜ì§? ì¤„ì— ìµœëŒ“ê°’ì´ ëª? ë²ˆì§¸ ?ˆ˜?¸ì§?ë¥? ì¶œë ¥?•œ?‹¤.
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
