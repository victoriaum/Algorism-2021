package Mar26;

import java.io.*;
import java.util.*;

public class codingInterview_10828 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());
		List<Integer> intList = new ArrayList<>();
		
		for (int i=0; i<a; i++) {
			String str = br.readLine();
			if("pu".equals(str.substring(0,2))) {
				intList.add(Integer.parseInt(str.substring(5)));
			} else if ("po".equals(str.substring(0,2))) {
				System.out.println((intList.size()==0)?"-1":intList.get(intList.size()-1));
				if(intList.size()!=0) 
					intList.remove(intList.size()-1);
			} else if ("to".equals(str.substring(0,2))) {
				System.out.println((intList.size()==0)?"-1":intList.get(intList.size()-1));
			} else if ("si".equals(str.substring(0,2))) {
				System.out.println(intList.size());
			} else if ("em".equals(str.substring(0,2))) {
				System.out.println((intList.size()==0)?"1":"0");
	
			}
		}
       br.close();
	}
}

