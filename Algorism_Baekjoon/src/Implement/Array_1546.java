package Implement;

// ë°°ì—´
/*
-- ?‰ê·? 1546
?„¸ì¤??´?Š” ê¸°ë§ê³ ì‚¬ë¥? ë§ì³¤?‹¤. ?„¸ì¤??´?Š” ? ?ˆ˜ë¥? ì¡°ì‘?•´?„œ ì§‘ì— ê°?? ¸ê°?ê¸°ë¡œ ?–ˆ?‹¤. 
?¼?‹¨ ?„¸ì¤??´?Š” ?ê¸? ? ?ˆ˜ ì¤‘ì— ìµœëŒ“ê°’ì„ ê³¨ë?‹¤. ?´ ê°’ì„ M?´?¼ê³? ?•œ?‹¤. 
ê·¸ë¦¬ê³? ?‚˜?„œ ëª¨ë“  ? ?ˆ˜ë¥? ? ?ˆ˜/M*100?œ¼ë¡? ê³ ì³¤?‹¤.

?˜ˆë¥? ?“¤?–´, ?„¸ì¤??´?˜ ìµœê³ ? ?´ 70?´ê³?, 
?ˆ˜?•™? ?ˆ˜ê°? 50?´?—ˆ?œ¼ë©? ?ˆ˜?•™? ?ˆ˜?Š” 50/70*100?´ ?˜?–´ 71.43? ?´ ?œ?‹¤.

?„¸ì¤??´?˜ ?„±? ?„ ?œ„?˜ ë°©ë²•??ë¡? ?ƒˆë¡? ê³„ì‚°?–ˆ?„ ?•Œ, ?ƒˆë¡œìš´ ?‰ê· ì„ êµ¬í•˜?Š” ?”„ë¡œê·¸?¨?„ ?‘?„±?•˜?‹œ?˜¤.
*/
import java.util.*;

public class Array_1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		double max=0, sum=0; 
		double[] arr = new double[x];
		
		for (int i=0; i<x; i++) {
			arr[i]=sc.nextDouble();
			if(arr[i]>max)
				max=arr[i];
		}
		
		for (int i=0; i<x; i++) {
			arr[i]=arr[i]/max*100;
			sum += arr[i];
		}
		
		System.out.println(sum/x);
		
		sc.close();
	}
}

/*
?™œ ??? ¸?Š”ì§? ëª¨ë¥´?Š” ?‚˜?˜ ?‹µ
import java.util.*;

public class Array_1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		double sum=0; 
		List<Double> listArr = new ArrayList<>();
		List<Double> newlistArr = new ArrayList<>();
		
		for (int i=0; i<x; i++) {
			listArr.add(sc.nextDouble());
		}
		
		double max = Collections.max(listArr);
		
		for (int i=0; i<x; i++) {
			newlistArr.add(listArr.get(i)/(double)max*100);

		}
		
		for (int i=0; i<x; i++) {
			System.out.println(newlistArr.get(i));
			sum += newlistArr.get(i);
		}
		
		System.out.println(sum/x);
		
		sc.close();
	}

}
 
*/
 */