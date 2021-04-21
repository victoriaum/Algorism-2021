package April21;

import java.util.Scanner;

public class Math_2920 {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String asc = "1 2 3 4 5 6 7 8";
		String desc = "8 7 6 5 4 3 2 1";
		
		if(asc.equals(str)) System.out.println("ascending");
		else if(desc.equals(str)) System.out.println("descending");
		else System.out.println("mixed");
	}
}