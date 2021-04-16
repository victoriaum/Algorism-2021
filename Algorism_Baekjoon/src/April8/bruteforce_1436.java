package April8;

import java.util.*;

public class bruteforce_1436 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		sc.nextLine();
		int number=666, count=1;

		if(cnt==1) System.out.println(number);
		else {
			do {
				number++;
				if(String.valueOf(number).contains("666")) {
					count++;					
				}
			} while (!(cnt==count));
			System.out.println(number);
		}
	}

}
