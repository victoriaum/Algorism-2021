package Implement;

// ifë¬? 9498
/*
- ?‹œ?—˜?„±?  9498
?‹œ?—˜ ? ?ˆ˜ë¥? ?…? ¥ë°›ì•„ 90 ~ 100? ?? A, 80 ~ 89? ?? B, 70 ~ 79? ?? C, 60 ~ 69? ?? D, ?‚˜ë¨¸ì? ? ?ˆ˜?Š” Fë¥? ì¶œë ¥?•˜?Š” ?”„ë¡œê·¸?¨?„ ?‘?„±?•˜?‹œ?˜¤.
*/

import java.util.Scanner;

public class if_9498 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		if(90<=x && x<=100) System.out.println("A");
		else if(80<=x) System.out.println("B");
		else if(70<=x) System.out.println("C");
		else if(60<=x) System.out.println("D");
		else System.out.println("F");
		
		sc.close();
	}
	
}
