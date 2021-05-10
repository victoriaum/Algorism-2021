package Implement;

// ë°°ì—´
/*
-- ?‰ê· ì? ?„˜ê² ì? 4344
ì²«ì§¸ ì¤„ì—?Š” ?…Œ?Š¤?Š¸ ì¼??´?Š¤?˜ ê°œìˆ˜ Cê°? ì£¼ì–´ì§„ë‹¤.
?‘˜ì§? ì¤„ë??„° ê°? ?…Œ?Š¤?Š¸ ì¼??´?Š¤ë§ˆë‹¤ ?•™?ƒ?˜ ?ˆ˜ N(1 ?‰¤ N ?‰¤ 1000, N?? ? •?ˆ˜)?´ ì²? ?ˆ˜ë¡? ì£¼ì–´ì§?ê³?, 
?´?–´?„œ Nëª…ì˜ ? ?ˆ˜ê°? ì£¼ì–´ì§„ë‹¤. ? ?ˆ˜?Š” 0ë³´ë‹¤ ?¬ê±°ë‚˜ ê°™ê³ , 100ë³´ë‹¤ ?‘ê±°ë‚˜ ê°™ì? ? •?ˆ˜?´?‹¤.
*/
import java.util.*;

public class Array_4344 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		double sum=0;
		int num=0;
		int[] scoreArr = null;
		
		for (int j=0; j<testcase; j++) {
			int student = sc.nextInt();
			
			for (int i=0; i<student; i++) {
				scoreArr = new int[student];
				scoreArr[i]=sc.nextInt();
				sum += scoreArr[i];
			}
				
			for (int i=0; i<student; i++) {
				System.out.println(scoreArr[i]);
				if(scoreArr[i]>sum/student) {
					num++;
				}	
			}
			
			System.out.printf("%.3f",num/student*100);
			System.out.println("%");
		}
		
		
		sc.close();
	}

}
