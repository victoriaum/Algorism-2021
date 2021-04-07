package April6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Greedy_1931 {

	static int[][] schedule;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt=Integer.parseInt(br.readLine());
		int[][] schedule = new int[cnt+1][2];
		
		for (int i=0; i<cnt; i++) {
			String str = br.readLine();
			String a = str.substring(0,str.indexOf(" "));
			String b = str.substring(str.indexOf(" ")+1);
			schedule[i][0]=Integer.parseInt(a);
			schedule[i][1]=Integer.parseInt(b);
		}
		
		Arrays.sort(schedule, new Comparator<int[]>() {
			@Override
			public int compare(int[] t1, int[] t2) {
			   if(t1[1] == t2[1]) {
                    return t1[0] - t2[0];
                } else {
                    return t1[1] - t2[1];
                }
			}
		});
		
		 int end = -1;
	        int count = 0;
	        
	        //끝나는 시간을 계속 수정해주며 회의를 진행한다.
	        for(int i=0; i<cnt; i++) {
	            if(schedule[i][0] >= end ) {
	                end = schedule[i][1];
	                count++;
	            }
	        }
	        
	        System.out.println(count);
		
		}
}

/*
6*/
