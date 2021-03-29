package Mar25;

import java.io.*;
import java.util.*;

public class sort_2751 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int a = Integer.parseInt(br.readLine());
		List<Integer> intList = new ArrayList<>();
		
		for (int i=0; i<a; i++) {
			intList.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(intList);
				
		 for(int i=0;i<a;i++) {
	          bw.write(intList.get(i)+"\n");
	       }
	       bw.flush();
	       bw.close();
	       br.close();

	}

}

