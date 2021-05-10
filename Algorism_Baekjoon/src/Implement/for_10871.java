package Implement;

//forë¬?
/*
- xë³´ë‹¤ ?‘?? ?ˆ˜ 10871
ì²«ì§¸ ì¤„ì— Nê³? Xê°? ì£¼ì–´ì§„ë‹¤. (1 ?‰¤ N, X ?‰¤ 10,000)
?‘˜ì§? ì¤„ì— ?ˆ˜?—´ Aë¥? ?´ë£¨ëŠ” ? •?ˆ˜ Nê°œê? ì£¼ì–´ì§„ë‹¤. ì£¼ì–´ì§??Š” ? •?ˆ˜?Š” ëª¨ë‘ 1ë³´ë‹¤ ?¬ê±°ë‚˜ ê°™ê³ , 10,000ë³´ë‹¤ ?‘ê±°ë‚˜ ê°™ì? ? •?ˆ˜?´?‹¤.
Xë³´ë‹¤ ?‘?? ?ˆ˜ë¥? ?…? ¥ë°›ì? ?ˆœ?„œ??ë¡? ê³µë°±?œ¼ë¡? êµ¬ë¶„?•´ ì¶œë ¥?•œ?‹¤. Xë³´ë‹¤ ?‘?? ?ˆ˜?Š” ? ?–´?„ ?•˜?‚˜ ì¡´ì¬?•œ?‹¤.
*/

import java.util.Scanner;

public class for_10871 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		for (int i=0; i<n; i++) {
			int a = sc.nextInt();
			if(a<x) System.out.print(a+" ");
		}
		
	    sc.close();
	}

}
