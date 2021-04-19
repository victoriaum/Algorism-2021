package April19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DFS_2606 {

	static int computer=0, node=0, cnt=0;
	static int[] computers;
	static String[][] nodes = null;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		computer = Integer.parseInt(br.readLine());
		node = Integer.parseInt(br.readLine());

		nodes = new String[node][2]; 
		computers = new int[computer];
		
		for (int i=0; i<node; i++) {			
			nodes[i] = br.readLine().split(" ");
		}
		
		check(1);
		
		System.out.println(cnt);
	}
	
	static void check(int a) {
		for (int i=0; i<node; i++) {
			if(nodes[i][0].equals(a) && computers[i]!=0) {
				computers[i]=1;
				cnt++;
				check(i);
			}
			
		}
	}

}

/*
	import java.util.Scanner;
 
	public class BJ2606_DFS {
    static int N_com, N_conn;
    static int map[][];
    static int cnt;
    static int visited[];
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Scanner scan = new Scanner(System.in);
        
        N_com = scan.nextInt();
        N_conn = scan.nextInt();
        
        map = new int[N_com+1][N_com+1];
        visited = new int[N_com+1];
        
        for(int i=0;i<N_conn;i++) 
        {
            int a = scan.nextInt();
            int b = scan.nextInt();
            map[a][b] = map[b][a] = 1;    
        }
        
        dfs(1);
        System.out.println(cnt);
    }
    
    
    static void dfs(int start) 
    {
        visited[start] = 1;
        
        for(int i=1;i<N_com+1;i++) 
        {
            if(map[start][i] == 1 && visited[i] == 0) 
            {
                dfs(i);
                cnt++;
            }
        }
    }
}
*/
