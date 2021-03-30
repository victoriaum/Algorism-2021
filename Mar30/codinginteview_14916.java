package Mar30;

import java.util.Scanner;

public class codinginteview_14916 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int input = sc.nextInt();
		sc.nextLine();
		int cnt = 0;
		
		if(input<0)  cnt=-1;
		else if(input==0)  cnt=0;
		else if(input%5!=0)	 {
			while(input%5==0) {
				input = input-2;
				cnt++;					
			}
			cnt+=input/5;
		}
		
		System.out.println(cnt);		
	}
}
