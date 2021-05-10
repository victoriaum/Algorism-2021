package Implement;

//1ì°¨ì› ë°°ì—´, 8958
/*
- ox?´ì¦ˆ 8958
"OOXXOXXOOO"?? ê°™ì? OX?´ì¦ˆ?˜ ê²°ê³¼ê°? ?ˆ?‹¤. O?Š” ë¬¸ì œë¥? ë§ì? ê²ƒì´ê³?, X?Š” ë¬¸ì œë¥? ??ë¦? ê²ƒì´?‹¤. 
ë¬¸ì œë¥? ë§ì? ê²½ìš° ê·? ë¬¸ì œ?˜ ? ?ˆ˜?Š” ê·? ë¬¸ì œê¹Œì? ?—°?†?œ O?˜ ê°œìˆ˜ê°? ?œ?‹¤. ?˜ˆë¥? ?“¤?–´, 10ë²? ë¬¸ì œ?˜ ? ?ˆ˜?Š” 3?´ ?œ?‹¤.
"OOXXOXXOOO"?˜ ? ?ˆ˜?Š” 1+2+0+0+1+0+0+1+2+3 = 10? ?´?‹¤.
OX?´ì¦ˆ?˜ ê²°ê³¼ê°? ì£¼ì–´ì¡Œì„ ?•Œ, ? ?ˆ˜ë¥? êµ¬í•˜?Š” ?”„ë¡œê·¸?¨?„ ?‘?„±?•˜?‹œ?˜¤.
*/

import java.util.Scanner;

public class array_8958 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = Integer.parseInt(sc.nextLine());
		
		String check = sc.nextLine();
		String[] strArr = new String[]{check};
		
		int score = 0;

			for(int j=1;j<strArr.length+1;j++) {
				if("o".equalsIgnoreCase(strArr[j])) 
					score++;
			}
			System.out.println(score);

		
		
		
		sc.close();
	}
	
}

/*
import java.util.Scanner;

public class java_8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        
        String[] str = new String[num+1];

        for (int i = 0; i < num; i++) {
            int count = 0, sum = 0;
            str[i] = sc.next();
            for (int j =0; j < str[i].length(); j++) {
                if (str[i].charAt(j) == 'O')
                    sum += ++count;
                else count = 0;
            }
            System.out.println(sum);
        }
        
        sc.close();
    }
} 
 */
