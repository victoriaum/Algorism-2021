package Implement;


//?¬ê·?
/*
- ?Œ©?† ë¦¬ì–¼ 10872
0ë³´ë‹¤ ?¬ê±°ë‚˜ ê°™ì? ? •?ˆ˜ N?´ ì£¼ì–´ì§„ë‹¤. ?´?•Œ, N!?„ ì¶œë ¥?•˜?Š” ?”„ë¡œê·¸?¨?„ ?‘?„±?•˜?‹œ?˜¤.
*/

import java.util.Scanner;

public class math_10872 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.nextLine();
		
		System.out.println(fac(a));
		
		sc.close();
	}

	private static int fac(int a) {
		
		if(a<=1) {
			return 1;
		}
		else {
			return a*fac(a-1);

		}
	}
	
}