package Retry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Math_2659 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strArr = new String[4];
		strArr=br.readLine().split(" ");
		Arrays.sort(strArr);
		
		String str = "";
		for (int i=0; i<4; i++) {
			str+=strArr[i];
		}

		int num = Integer.parseInt(str);		
		System.out.println(num-1112);
	}
}