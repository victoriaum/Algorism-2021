package April2;

import java.util.*;

public class Array_2108 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		sc.nextLine();
		List<Integer> arr = new ArrayList<>();
		List<Integer> freqArr = new ArrayList<>();
		int sum=0, cnt1=0, cnt2=0, freq=0;
		
		for (int i=0; i<a; i++) {
			int b =sc.nextInt();
			arr.add(b);
			sum+=b;
			sc.nextLine();
		}
		Collections.sort(arr);
		
		for (int i=0; i<a; i++) {
			for (int j=0; j<a; j++) {
				if(arr.get(i)==arr.get(j)) cnt2++;
			}
			if(i==0) {
				cnt1=cnt2;
				freqArr.add(arr.get(i));
				
			}
			if(cnt1<cnt2) {				
				freqArr.add(arr.get(i));
			}
		}

		System.out.println((int) Math.round((double)sum/a));
		System.out.println(arr.get((int)a/2));
		System.out.println(freqArr.get(2));		
		System.out.println(arr.get(arr.size()-1)-arr.get(0));
	}

}
