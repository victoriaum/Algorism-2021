package Implement;


//?¬ê·?
/*
- ?”¼ë³´ë‚˜ì¹˜ìˆ˜?—´ 10870
?”¼ë³´ë‚˜ì¹? ?ˆ˜?Š” 0ê³? 1ë¡? ?‹œ?‘?•œ?‹¤. 0ë²ˆì§¸ ?”¼ë³´ë‚˜ì¹? ?ˆ˜?Š” 0?´ê³?, 1ë²ˆì§¸ ?”¼ë³´ë‚˜ì¹? ?ˆ˜?Š” 1?´?‹¤. 
ê·? ?‹¤?Œ 2ë²ˆì§¸ ë¶??„°?Š” ë°”ë¡œ ?• ?‘ ?”¼ë³´ë‚˜ì¹? ?ˆ˜?˜ ?•©?´ ?œ?‹¤.
?´ë¥? ?‹?œ¼ë¡? ?¨ë³´ë©´ Fn = Fn-1 + Fn-2 (n ?‰¥ 2)ê°? ?œ?‹¤.
n=17?¼?•Œ ê¹Œì? ?”¼ë³´ë‚˜ì¹? ?ˆ˜ë¥? ?¨ë³´ë©´ ?‹¤?Œê³? ê°™ë‹¤.
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
n?´ ì£¼ì–´ì¡Œì„ ?•Œ, në²ˆì§¸ ?”¼ë³´ë‚˜ì¹? ?ˆ˜ë¥? êµ¬í•˜?Š” ?”„ë¡œê·¸?¨?„ ?‘?„±?•˜?‹œ?˜¤.
*/

import java.util.Scanner;

public class math_10870 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.nextLine();
		
		System.out.println(Fibonacci(a));
		
		sc.close();
	}

	private static int Fibonacci(int a) {
		if(a==0) {
			return 0;
		} else if(a==1) {
			return 1;
		} else {
			return Fibonacci(a-1)+Fibonacci(a-2);

		}
	}
	
}