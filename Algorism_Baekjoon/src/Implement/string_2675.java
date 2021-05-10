package Implement;

// ë¬¸ì?—´ 2675
/*
--
ë¬¸ì?—´ Së¥? ?…? ¥ë°›ì? ?›„?—, ê°? ë¬¸ìë¥? Rë²? ë°˜ë³µ?•´ ?ƒˆ ë¬¸ì?—´ Pë¥? ë§Œë“  ?›„ ì¶œë ¥?•˜?Š” ?”„ë¡œê·¸?¨?„ ?‘?„±?•˜?‹œ?˜¤. 
ì¦?, ì²? ë²ˆì§¸ ë¬¸ìë¥? Rë²? ë°˜ë³µ?•˜ê³?, ?‘ ë²ˆì§¸ ë¬¸ìë¥? Rë²? ë°˜ë³µ?•˜?Š” ?‹?œ¼ë¡? Pë¥? ë§Œë“¤ë©? ?œ?‹¤. S?—?Š” QR Code "alphanumeric" ë¬¸ìë§? ?“¤?–´?ˆ?‹¤.
QR Code "alphanumeric" ë¬¸ì?Š” 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: ?´?‹¤.
*/

import java.util.Scanner;

public class string_2675 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		String s = sc.nextLine();

		char[] chArr = s.toCharArray();
	
		for (int i = 1; i < chArr.length; i++) {
			for (int j = 0; j < cnt; j++) {
				System.out.print(chArr[i]);			
			}
		}
		
		
		sc.close();
	}
	
}
