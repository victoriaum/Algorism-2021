package Implement;

/*
-- ë³„ì°ê¸? - 5 2442 
ì²«ì§¸ ì¤„ì—?Š” ë³? 1ê°?, ?‘˜ì§? ì¤„ì—?Š” ë³? 3ê°?, ..., Në²ˆì§¸ ì¤„ì—?Š” ë³? 2Ã—N-1ê°œë?? ì°ëŠ” ë¬¸ì œ
ë³„ì? ê°??š´?°ë¥? ê¸°ì??œ¼ë¡? ??ì¹??´?–´?•¼ ?•œ?‹¤.
*/

import java.util.*;

public class math_2442 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.nextLine();
		
		for (int i=0; i<input; i++) {	
			for (int j=i+1; j<input; j++) {	
				System.out.print(" ");
			}
			for (int j=input-i*2; j<input+1; j++) {	
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		
		sc.close();		
	}
	
}