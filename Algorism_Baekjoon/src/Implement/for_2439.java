package Implement;

//forë¬?
/*
- ë³„ì°ê¸?2 2439
ì²«ì§¸ ì¤„ì—?Š” ë³? 1ê°?, ?‘˜ì§? ì¤„ì—?Š” ë³? 2ê°?, Në²ˆì§¸ ì¤„ì—?Š” ë³? Nê°œë?? ì°ëŠ” ë¬¸ì œ
?˜¤ë¥¸ìª½? •? ¬
*/

import java.util.Scanner;

public class for_2439 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for (int i=0; i<a; i++) {
			for (int j=a; j>i+1; j--) {
				System.out.print(" ");
			}
			for (int j=0; j<i+1; j++) {
				System.out.printf("%s","*");
			}
			System.out.print("\n");
		}
	    sc.close();
	}

}
