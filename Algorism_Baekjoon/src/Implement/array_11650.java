package Implement;

import java.util.*;

public class array_11650 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int[][] point = new int[cnt][2];
		
		for (int i=0; i<cnt; i++) {
			point[i][0]=sc.nextInt();
			point[i][1]=sc.nextInt();
		}
		
		Arrays.sort(point, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0]==o2[0])
					return o1[1]-o2[1];
				else
					return o1[0]-o2[0];
			}
		});

		for (int i=0; i<cnt; i++) {
			System.out.println(point[i][0]+" "+point[i][1]);
		}

		sc.close();
	}

}
