package Mar29;

import java.util.Scanner;

public class codinginteview_5585 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int returnMoney = sc.nextInt();
		sc.nextLine();
		int cnt = 0;
		int payMoney = 1000-returnMoney;

		cnt = payMoney/500+(payMoney%500/100)+(payMoney%500%100/50)+(payMoney%500%100%50/10)
			+(payMoney%500%100%50%10/5)+(payMoney%500%100%50%10%5/1);
		
		System.out.println(cnt);
		sc.close(); 
	}
}
