package Implement;

// ë°°ì—´
/*
-- ìµœì†Œ, ìµœë? 10818
ì²«ì§¸ ì¤„ì— ? •?ˆ˜?˜ ê°œìˆ˜ N (1 ?‰¤ N ?‰¤ 1,000,000)?´ ì£¼ì–´ì§„ë‹¤. ?‘˜ì§? ì¤„ì—?Š” Nê°œì˜ ? •?ˆ˜ë¥? ê³µë°±?œ¼ë¡? êµ¬ë¶„?•´?„œ ì£¼ì–´ì§„ë‹¤. 
ëª¨ë“  ? •?ˆ˜?Š” -1,000,000ë³´ë‹¤ ?¬ê±°ë‚˜ ê°™ê³ , 1,000,000ë³´ë‹¤ ?‘ê±°ë‚˜ ê°™ì? ? •?ˆ˜?´?‹¤.
ì²«ì§¸ ì¤„ì— ì£¼ì–´ì§? ? •?ˆ˜ Nê°œì˜ ìµœì†Ÿê°’ê³¼ ìµœëŒ“ê°’ì„ ê³µë°±?œ¼ë¡? êµ¬ë¶„?•´ ì¶œë ¥?•œ?‹¤.
*/
import java.util.*;

public class Array_10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		List<Integer> listArr = new ArrayList<>();
		
		for (int i=0; i<x; i++) {
			listArr.add(sc.nextInt());
		}
		
		int min = Collections.min(listArr);
		int max = Collections.max(listArr);
		
		System.out.println(min+" "+max);
		
		sc.close();
	}

}
