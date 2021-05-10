package Implement;
// ë¬¸ì?—´ 
/*
-- ê·¸ë£¹ ?‹¨?–´ ì²´ì»¤ 1316
ê·¸ë£¹ ?‹¨?–´?? ?‹¨?–´?— ì¡´ì¬?•˜?Š” ëª¨ë“  ë¬¸ì?— ???•´?„œ, ê°? ë¬¸ìê°? ?—°?†?•´?„œ ?‚˜???‚˜?Š” ê²½ìš°ë§Œì„ ë§í•œ?‹¤. 
?˜ˆë¥? ?“¤ë©?, ccazzzzbb?Š” c, a, z, bê°? ëª¨ë‘ ?—°?†?•´?„œ ?‚˜???‚˜ê³?, kin?„ k, i, n?´ ?—°?†?•´?„œ ?‚˜???‚˜ê¸? ?•Œë¬¸ì— ê·¸ë£¹ ?‹¨?–´?´ì§?ë§?, 
aabbbccb?Š” bê°? ?–¨?–´? ¸?„œ ?‚˜???‚˜ê¸? ?•Œë¬¸ì— ê·¸ë£¹ ?‹¨?–´ê°? ?•„?‹ˆ?‹¤.
?‹¨?–´ Nê°œë?? ?…? ¥?œ¼ë¡? ë°›ì•„ ê·¸ë£¹ ?‹¨?–´?˜ ê°œìˆ˜ë¥? ì¶œë ¥?•˜?Š” ?”„ë¡œê·¸?¨?„ ?‘?„±?•˜?‹œ?˜¤.

bbbbbbbbcccccccc
*/


import java.util.Scanner;

public class string_1316 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		int cnt = n;
		
		for (int i=0; i<n; i++) {
			String str = sc.nextLine();

			out:
			for (int j=0; j<str.length(); j++) {
				for (int k=j+2; k<str.length(); k++) {
					if(str.charAt(j)!=str.charAt(j+1) && str.charAt(j)==str.charAt(k)) {
						cnt--;
						break out;
					}
				}
			}
		}
		
		
		System.out.println(cnt);
	}
}