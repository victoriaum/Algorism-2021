package Bruthforce;

/*
-- ë¸”ë™?­ 2798
ì²«ì§¸ ì¤„ì— ì¹´ë“œ?˜ ê°œìˆ˜ N(3 ?‰¤ N ?‰¤ 100)ê³? M(10 ?‰¤ M ?‰¤ 300,000)?´ ì£¼ì–´ì§„ë‹¤. 
?‘˜ì§? ì¤„ì—?Š” ì¹´ë“œ?— ?“°?—¬ ?ˆ?Š” ?ˆ˜ê°? ì£¼ì–´ì§?ë©?, ?´ ê°’ì? 100,000?„ ?„˜ì§? ?•Š?Š” ?–‘?˜ ? •?ˆ˜?´?‹¤.
?•©?´ M?„ ?„˜ì§? ?•Š?Š” ì¹´ë“œ 3?¥?„ ì°¾ì„ ?ˆ˜ ?ˆ?Š” ê²½ìš°ë§? ?…? ¥?œ¼ë¡? ì£¼ì–´ì§„ë‹¤.

ì²«ì§¸ ì¤„ì— M?„ ?„˜ì§? ?•Š?œ¼ë©´ì„œ M?— ìµœë??•œ ê°?ê¹Œìš´ ì¹´ë“œ 3?¥?˜ ?•©?„ ì¶œë ¥?•œ?‹¤.

?˜…?˜…?˜… ?„¸ê°?ì§? ?ˆ˜?˜ ?•©?„ ?”?• ?•Œ forë¬¸ì˜ ? œ?•œê°’ì„ ?˜ ?ƒê°í•˜ê¸?!
*/

// 

//

//
 

import java.util.*;

public class bruteforce_2798 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cardnum = sc.nextInt();
		int value = sc.nextInt();
		int max = 0, sum = 0;
		int[] intArr = new int[cardnum];
		
		
		for (int i=0; i<intArr.length; i++) {
			intArr[i]=sc.nextInt();
		}
		sc.nextLine();
		
		for (int i=0; i<intArr.length-2; i++) {
			for (int j=i+1; j<intArr.length-1; j++) {
				for (int l=j+1; l<intArr.length; l++) {
					sum = intArr[i]+intArr[j]+intArr[l];
					if (sum<=value) max = Math.max(max,sum);
				}
			}
			
		}
		
		System.out.print(max);
		sc.close();		
	}
	
}