package Mar24;

import java.util.*;

public class sort_2750 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.nextLine();
		List<Integer> intList = new ArrayList<>();
		
		for (int i=0; i<a; i++) {
			intList.add(Integer.parseInt(sc.nextLine()));
		}
		
		Collections.sort(intList);
		
		
		for (int i=0; i<a; i++) {
			System.out.println(intList.get(i));
		}

	}

}
