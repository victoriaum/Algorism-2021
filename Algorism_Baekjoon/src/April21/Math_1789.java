package April21;

import java.util.Scanner;

public class Math_1789 {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String cnt = sc.nextLine();
		
		for (int i=0; i<Integer.parseInt(cnt); i++) {
			strStar[i]=sc.nextLine();
		}
		
		for (int i=0; i<Integer.parseInt(cnt); i++) {
			strX[i]=sc.nextLine();
		}
		
	}
}


/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        long n = Long.parseLong(br.readLine());

        System.out.println(solve(n));
    }

    static int solve(long n) {
        long sum = 0;
        int addNum = 1;
        while(n >= sum) {
            sum += addNum++;
        }

        return sum == n ? addNum - 1 : addNum - 2;
    }
}
*/
