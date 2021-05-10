package Implement;

/*
-- ë³„ì°ê¸? - 3 2440 
ì²«ì§¸ ì¤„ì—?Š” ë³? Nê°?, ?‘˜ì§? ì¤„ì—?Š” ë³? N-1ê°?, ..., Në²ˆì§¸ ì¤„ì—?Š” ë³? 1ê°œë?? ì°ëŠ” ë¬¸ì œ
*/

import java.util.*;

public class math_2440 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.nextLine();
		
		for (int i=0; i<input; i++) {	
			for (int j=input-i; j>0; j--) {	
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		
		sc.close();		
	}
	
}