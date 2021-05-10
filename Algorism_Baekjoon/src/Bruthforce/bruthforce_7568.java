package Bruthforce;

//ë¸Œë£¨?Š¸?¬?Š¤
/*
-- ?©ì¹? 7568
ì²? ì¤„ì—?Š” ? „ì²? ?‚¬?Œ?˜ ?ˆ˜ N?´ ì£¼ì–´ì§„ë‹¤. 
ê·¸ë¦¬ê³? ?´?–´ì§??Š” Nê°œì˜ ì¤„ì—?Š” ê°? ?‚¬?Œ?˜ ëª¸ë¬´ê²Œì? ?‚¤ë¥? ?‚˜???‚´?Š” ?–‘?˜ ? •?ˆ˜ x?? yê°? ?•˜?‚˜?˜ ê³µë°±?„ ?‘ê³? ê°ê° ?‚˜???‚œ?‹¤.
?—¬?Ÿ¬ë¶„ì? ?…? ¥?— ?‚˜?—´?œ ?‚¬?Œ?˜ ?©ì¹? ?“±?ˆ˜ë¥? êµ¬í•´?„œ ê·? ?ˆœ?„œ??ë¡? ì²? ì¤„ì— ì¶œë ¥?•´?•¼ ?•œ?‹¤. 
?‹¨, ê°? ?©ì¹? ?“±?ˆ˜?Š” ê³µë°±ë¬¸ìë¡? ë¶„ë¦¬?˜?–´?•¼ ?•œ?‹¤.
*/

import java.util.Scanner;

public class bruthforce_7568 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int[][] figure = new int[cnt+1][2];
		
		for (int i=0; i<cnt; i++) {
			figure[i][0] = sc.nextInt();
			figure[i][1] = sc.nextInt();	
		}
		
		int rank =0 ;
		
		for (int i=0; i<cnt; i++) {
			rank = 1;
			for (int j=0; j<cnt; j++) {
				if(figure[i][0]<figure[j][0] && figure[i][1]<figure[j][1]) {
					rank++;
				}
			}
			if(i==0) System.out.print(rank);
			else System.out.print(" "+rank);
		}
	}

}
