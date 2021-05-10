package Implement;

//forë¬?
/*
- A+B - 8 11022
ì²«ì§¸ ì¤„ì— ?…Œ?Š¤?Š¸ ì¼??´?Š¤?˜ ê°œìˆ˜ Tê°? ì£¼ì–´ì§„ë‹¤.

ê°? ?…Œ?Š¤?Š¸ ì¼??´?Š¤?Š” ?•œ ì¤„ë¡œ ?´ë£¨ì–´? ¸ ?žˆ?œ¼ë©?, ê°? ì¤„ì— A?? Bê°? ì£¼ì–´ì§„ë‹¤. (0 < A, B < 10)
ê°? ?…Œ?Š¤?Š¸ ì¼??´?Š¤ë§ˆë‹¤ "Case #x: A + B = C" ?˜•?‹?œ¼ë¡? ì¶œë ¥?•œ?‹¤. x?Š” ?…Œ?Š¤?Š¸ ì¼??´?Š¤ ë²ˆí˜¸?´ê³? 1ë¶??„° ?‹œ?ž‘?•˜ë©?, C?Š” A+B?´?‹¤.
*/

/*
import java.io.*;

public class for_11022 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			int cnt = Integer.parseInt(br.readLine());
			for(int i=0;i<cnt;i++) {
				int a = br.read();
				int b = br.read();
				System.out.printf("Case #%d: %d + %d = %d\n", i+1, a, b, a+b);
			}
			br.close();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
*/


import java.util.Scanner;

public class for_11022 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		for (int i = 0; i < cnt; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.printf("Case #%d: %d + %d = %d\n", i+1, a, b, a+b);
		}
		
	}

}
