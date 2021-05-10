package Implement;

import java.util.*;

public class array_1427 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] arr = str.toCharArray();
		char[] reverse = new char[arr.length];
		
		Arrays.sort(arr);

		for (int i=0; i<arr.length; i++) {
			reverse[arr.length-1-i] = arr[i];
		}
		
		String reversedStr = new String(reverse); 
		System.out.println(reversedStr);

		sc.close();
	}

}
