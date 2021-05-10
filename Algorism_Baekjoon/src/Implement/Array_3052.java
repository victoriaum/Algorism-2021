package Implement;

// ë°°ì—´
/*
-- ?‚˜ë¨¸ì? 3052
ì²«ì§¸ ì¤„ë??„° ?—´ë²ˆì§¸ ì¤? ê¹Œì? ?ˆ«?ê°? ?•œ ì¤„ì— ?•˜?‚˜?”© ì£¼ì–´ì§„ë‹¤. 
?´ ?ˆ«??Š” 1,000ë³´ë‹¤ ?‘ê±°ë‚˜ ê°™ê³ , ?Œ?´ ?•„?‹Œ ? •?ˆ˜?´?‹¤.
ì²«ì§¸ ì¤„ì—, 42ë¡? ?‚˜?ˆ„?—ˆ?„ ?•Œ, ?„œë¡? ?‹¤ë¥? ?‚˜ë¨¸ì?ê°? ëª? ê°? ?ˆ?Š”ì§? ì¶œë ¥?•œ?‹¤.
*/
import java.util.*;

public class Array_3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> input = new ArrayList<>();
		List<Integer> remainder = new ArrayList<>();
		int cnt = 0;
		
		for (int i=0; i<10; i++) {
			input.add(sc.nextInt());
			remainder.add(input.get(i)%42);
		}
		sc.nextLine();
		
		for (int i=0; i<remainder.size()-1; i++) {
			for (int j=i+1; j<remainder.size(); j++) {
				if(remainder.get(i)==remainder.get(j)) {
					cnt++;
					break;
				}
			}
		}
		
		System.out.println(10-cnt);
	
		sc.close();
	}
}
