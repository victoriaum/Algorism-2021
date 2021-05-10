package Implement;

//forë¬?
/*
- ë³„ì°ê¸?1 2438
ì²«ì§¸ ì¤„ì—?Š” ë³? 1ê°?, ?‘˜ì§? ì¤„ì—?Š” ë³? 2ê°?, Në²ˆì§¸ ì¤„ì—?Š” ë³? Nê°œë?? ì°ëŠ” ë¬¸ì œ
*/

import java.util.Scanner;

public class for_2438 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for (int i=0; i<a; i++) {
			for (int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	    sc.close();
	}

}
