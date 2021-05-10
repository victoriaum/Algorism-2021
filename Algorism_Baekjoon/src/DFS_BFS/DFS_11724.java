package DFS_BFS;

// DFS 
/*
-- ?—°ê²°ìš”?†Œ?˜ ê°œìˆ˜ 11724
ë°©í–¥ ?—†?Š” ê·¸ë˜?”„ê°? ì£¼ì–´ì¡Œì„ ?•Œ, ?—°ê²? ?š”?†Œ (Connected Component)?˜ ê°œìˆ˜ë¥? êµ¬í•˜?Š” ?”„ë¡œê·¸?¨?„ ?‘?„±?•˜?‹œ?˜¤.
ì²«ì§¸ ì¤„ì— ? •? ?˜ ê°œìˆ˜ Nê³? ê°„ì„ ?˜ ê°œìˆ˜ M?´ ì£¼ì–´ì§„ë‹¤. (1 ?‰¤ N ?‰¤ 1,000, 0 ?‰¤ M ?‰¤ NÃ—(N-1)/2) ?‘˜ì§? ì¤„ë??„° Mê°œì˜ ì¤„ì— ê°„ì„ ?˜ ?–‘ ??  u?? vê°? ì£¼ì–´ì§„ë‹¤. 
(1 ?‰¤ u, v ?‰¤ N, u ?‰  v) ê°™ì? ê°„ì„ ?? ?•œ ë²ˆë§Œ ì£¼ì–´ì§„ë‹¤.

https://ktko.tistory.com/entry/%ED%83%90%EC%83%89%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EA%B9%8A%EC%9D%B4-%EC%9A%B0%EC%84%A0-%ED%83%90%EC%83%89DFS-Depth-First-Search
*/

import java.util.Scanner;

public class DFS_11724 {
	static int num = 0, path = 0;
	static boolean[][] node = new boolean[num+1][num+1];
	static boolean[] visit = new boolean[num+1];
	static int cnt = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int path = sc.nextInt();
				
		for (int i=0; i<num; i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			node[n][m] = true;
			node[m][n] = true;			
		}
		
		for (int i=1; i<=num; i++) {
			if (!visit[i]) {
				path(i);
	            cnt++;
	        }
		}

		sc.close();	
	}
	
	static void path(int x) {
		visit[x]=true;
        
        for(int i=1; i<=num; i++) {
            if (node[x][i] && !visit[i]) {
            	path(i);
            }
        }
    }
		
}


/*
import java.util.*;
 
public class Main {
    
    static int spots, nodes, cnt;
    static boolean visits[];
    static boolean map[][];
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        spots = sc.nextInt();
        nodes = sc.nextInt();
        visits = new boolean[spots+1];
        map = new boolean[spots+1][spots+1];
        cnt = 0;
        for (int i=1; i<=nodes; i++) {
            int tmp1 = sc.nextInt();
            int tmp2 = sc.nextInt();
            
            map[tmp1][tmp2] = true;
            map[tmp2][tmp1] = true;
            
        }
        
        for(int i=1; i<=spots; i++) {
            if (!visits[i]) {
                dfs(i);
                cnt++;
            }
        }
        
        System.out.println(cnt);
        
    }
    
    private static void dfs(int start) {
        visits[start]=true;
        
        for(int i=1; i<=spots; i++) {
            if (map[start][i] && !visits[i]) {
                dfs(i);
            }
        }
    }
}
*/
