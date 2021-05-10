package Implement;

//?•¨?ˆ˜, ë¸Œë£¨?Š¸?¬?Š¤ ?•Œê³ ë¦¬ì¦?
/*
- ?•œ?ˆ˜ 1065
?–´?–¤ ?–‘?˜ ? •?ˆ˜ X?˜ ê°? ?ë¦¬ê? ?“±ì°¨ìˆ˜?—´?„ ?´ë£¬ë‹¤ë©?, ê·? ?ˆ˜ë¥? ?•œ?ˆ˜?¼ê³? ?•œ?‹¤. ?“±ì°¨ìˆ˜?—´?? ?—°?†?œ ?‘ ê°œì˜ ?ˆ˜?˜ ì°¨ì´ê°? ?¼? •?•œ ?ˆ˜?—´?„ ë§í•œ?‹¤. 
N?´ ì£¼ì–´ì¡Œì„ ?•Œ, 1ë³´ë‹¤ ?¬ê±°ë‚˜ ê°™ê³ , Në³´ë‹¤ ?‘ê±°ë‚˜ ê°™ì? ?•œ?ˆ˜?˜ ê°œìˆ˜ë¥? ì¶œë ¥?•˜?Š” ?”„ë¡œê·¸?¨?„ ?‘?„±?•˜?‹œ?˜¤. 
ì²«ì§¸ ì¤„ì— 1,000ë³´ë‹¤ ?‘ê±°ë‚˜ ê°™ì? ??—°?ˆ˜ N?´ ì£¼ì–´ì§„ë‹¤.
ì²«ì§¸ ì¤„ì— 1ë³´ë‹¤ ?¬ê±°ë‚˜ ê°™ê³ , Në³´ë‹¤ ?‘ê±°ë‚˜ ê°™ì? ?•œ?ˆ˜?˜ ê°œìˆ˜ë¥? ì¶œë ¥?•œ?‹¤.
https://steemit.com/kr-dev/@gyeryak/easyalgo-2-bruteforce
*/

import java.util.Scanner;

public class function_1065 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int hansu = 0;
		
		for(int i=1;i<input+1;i++) {
			if(cnt(i)<3) hansu++; 
			else if(i/100+i%10==i/10%10*2) hansu++;
		}
		System.out.println(hansu);
		sc.close();
	}
	
	public static int cnt(int x) {
		int a = 1;
		for(int j=0; x/10!=0; j++) {
		    a++;	
			x=x/10;
		}
	return a;
	}	
}
