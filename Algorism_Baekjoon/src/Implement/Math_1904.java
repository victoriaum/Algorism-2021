package Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Math_1904 {

	static int cnt=0;
	static boolean[][] visited;
	static char[][] nodes = null;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		cnt = Integer.parseInt(br.readLine());
		nodes = new char[cnt][cnt];
		
		for (int i=0; i<cnt; i++) {			
			nodes[i] = br.readLine().toCharArray();
		}
		
		check(1);
		System.out.println(cnt);
	}
	
	static void check(int a) {
		for (int i=0; i<node; i++) {
			if(nodes[i][0].equals(a) && computers[i]!=0) {
				
			}
			
		}
	}

}


/*
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

class Node{
    int a;
    int b;
    Node(int a, int b){
        this.a = a;
        this.b = b;
    }
}

class Main{
    static ArrayList<Integer> list;
    static int N;
    static int[][] map;
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        // 1: ÏßëÏù¥ ?ûà?äî Í≥?
        // 0: ÏßëÏù¥ ?óÜ?äî Í≥?
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        list = new ArrayList<>();
        for(int i=0; i<N; i++) {
            String[] temp = br.readLine().split("");
            for(int j=0; j<N; j++){
                map[i][j] = Integer.parseInt(temp[j]);
            }
        }

        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                if(map[i][j] == 1) {
                    list.add(dfs(i,j));
                }
            }
        }

        Collections.sort(list);
        bw.write("" + list.size());
        bw.newLine();
        for(int i=0; i<list.size(); i++) {
            bw.write("" + list.get(i));
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }

    public static int dfs(int x, int y) {
        // ?úÑ, ?ïÑ?ûò, ?ôºÏ™?, ?ò§Î•∏Ï™Ω
        int[] xdir = {-1,1,0,0};
        int[] ydir = {0,0,-1,1};
        int count = 0;
        Stack<Node> stack = new Stack<>();

        stack.add(new Node(x,y));
        while(!stack.isEmpty()) {
            Node n = stack.pop();

            // Î∞©Î¨∏?ñà?äîÏß? ?ôï?ù∏
            if(map[n.a][n.b] == 1) {
                int ax, ay;

                // Î∞©Î¨∏ Ï≤òÎ¶¨
                map[n.a][n.b] = 0;
                count++;
                // 4Î∞©Ìñ• Î≥¥Í∏∞
                for(int i=0; i<4; i++) {
                    ax = n.a + xdir[i];
                    ay = n.b + ydir[i];
                    // Î≤îÏúÑÎ•? ?ÑòÏß? ?ïä?äîÏß? ?ôï?ù∏
                    if(isCorrect(ax, ay)) {
                        if(map[ax][ay] == 1)
                            stack.add(new Node(ax, ay));
                    }
                }
            }
        }

        return count;
    }

    public static boolean isCorrect(int x, int y) {
        boolean flag = true;

        if(x < 0 || x >= N || y < 0 || y >= N)
            flag = false;

        return flag;
    }
}
*/
