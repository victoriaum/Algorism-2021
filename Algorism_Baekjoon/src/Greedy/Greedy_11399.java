package Greedy;

// ê·¸ë¦¬?”” ?•Œê³ ë¦¬ì¦?
/*
-- ATM 11399
ì²«ì§¸ ì¤„ì— ?‚¬?Œ?˜ ?ˆ˜ N(1 ?‰¤ N ?‰¤ 1,000)?´ ì£¼ì–´ì§„ë‹¤. 
?‘˜ì§? ì¤„ì—?Š” ê°? ?‚¬?Œ?´ ?ˆ?„ ?¸ì¶œí•˜?Š”?° ê±¸ë¦¬?Š” ?‹œê°? Piê°? ì£¼ì–´ì§„ë‹¤. (1 ?‰¤ Pi ?‰¤ 1,000)
*/
import java.util.*;

public class Greedy_11399 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  x = sc.nextInt();
		int[] listArr = new int[x];
		int sum=0;
		
		for (int i=0; i<x; i++) {
			listArr[i]=sc.nextInt();
		}
		sc.nextLine();
		
		Arrays.sort(listArr);
		
		for (int i=0; i<x-1; i++) {
			listArr[i+1]=listArr[i]+listArr[i+1];
			sum+=listArr[i];
		}
		
		
		System.out.println(sum);
		
		sc.close();
	}

}

/*
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, min = 0, n = sc.nextInt(), p[] = new int[n+1];
		for (i = 1; i <= n; i++) p[i] = sc.nextInt();
		Arrays.sort(p); //java.util.Arrays?— ?¬?•¨.
		for (i = 1; i <= n; i++) {
			p[i] = p[i - 1] + p[i];
			min += p[i];
		}
		System.out.println(min);
		sc.close();
	}
}
[ì¶œì²˜] [ë°±ì?] 11399 - ATM|?‘?„±? occidere 
*/
