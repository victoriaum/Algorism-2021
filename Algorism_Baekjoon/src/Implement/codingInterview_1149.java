package Implement;

import java.io.*;
import java.util.*;

public class codingInterview_1149 {
	static int sum = 0;
	static List<Integer> priceList;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());
		
		
		for (int i=0; i<a; i++) {
			String str = br.readLine();
			String[] sArr =  str.split(" ");
			priceList = new ArrayList<>();
			sum += Collections.min(priceList);
			
			for (int j=0; j<priceList.size(); j++) {				 
				if(Collections.min(priceList).equals(priceList.get(j)))
					cal(j);
			}
			
		}
       br.close();
	}
	
	public static int cal(int num) {		
		for (int i=0; i<3; i++) {
			sum += Collections.min(priceList);
		}
		return sum;
	}
}

