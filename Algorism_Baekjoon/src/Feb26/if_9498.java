package Feb26;

// if문 9498
/*
- 시험성적 9498
시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
*/

import java.util.Scanner;

public class if_9498 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		if(90<=x && x<=100) System.out.println("A");
		else if(80<=x) System.out.println("B");
		else if(70<=x) System.out.println("C");
		else if(60<=x) System.out.println("D");
		else System.out.println("F");
		
		sc.close();
	}
	
}
