package Greedy;


// ê·¸ë¦¬?”” ?•Œê³ ë¦¬ì¦?
/*
- ?™? „0 11047
ì¤?ê·œê? ê°?ì§?ê³? ?ˆ?Š” ?™? „?? ì´? Nì¢…ë¥˜?´ê³?, ê°ê°?˜ ?™? „?„ ë§¤ìš° ë§ì´ ê°?ì§?ê³? ?ˆ?‹¤.
?™? „?„ ? ? ˆ?ˆ ?‚¬?š©?•´?„œ ê·? ê°?ì¹˜ì˜ ?•©?„ Kë¡? ë§Œë“¤? ¤ê³? ?•œ?‹¤. 
?´?•Œ ?•„?š”?•œ ?™? „ ê°œìˆ˜?˜ ìµœì†Ÿê°’ì„ êµ¬í•˜?Š” ?”„ë¡œê·¸?¨?„ ?‘?„±?•˜?‹œ?˜¤.

ì²«ì§¸ ì¤„ì— Nê³? Kê°? ì£¼ì–´ì§„ë‹¤. (1 ?‰¤ N ?‰¤ 10, 1 ?‰¤ K ?‰¤ 100,000,000)
?‘˜ì§? ì¤„ë??„° Nê°œì˜ ì¤„ì— ?™? „?˜ ê°?ì¹? Aiê°? ?˜¤ë¦„ì°¨?ˆœ?œ¼ë¡? ì£¼ì–´ì§„ë‹¤. 
(1 ?‰¤ Ai ?‰¤ 1,000,000, A1 = 1, i ?‰¥ 2?¸ ê²½ìš°?— Ai?Š” Ai-1?˜ ë°°ìˆ˜)
*/

import java.util.Scanner;

public class greedy_11047 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		int sum = 0;
		
		int[] moneyArr = new int[n+1];
		
		for (int i=0; i<n; i++) moneyArr[i]=sc.nextInt();
		for (int i=n; i>0; i--) {
			if(moneyArr[i]!=0) {
				sum += k/moneyArr[i];
				k=k%moneyArr[i];
			}
		}
		
		System.out.println(sum);
		sc.close();
	}
}

/*
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, m = 0, n = sc.nextInt(), k = sc.nextInt();
		int a[] = new int[n + 1];
		for (i = 1; i <= n; i++) a[i] = sc.nextInt();
		for(i=n;i>0;i--){
			m+=k/a[i];
            k%=a[i];
		}
		System.out.println(m);
        sc.close();
	}
} 
*/
