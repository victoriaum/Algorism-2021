package inheritance;

import java.util.*;

public class Ex_1MemberMain {

	public static void main(String[] args) {
		
		M_Company co = new M_Company();
		M_Employee em = new M_Employee();
		M_Member me = new M_Member();
		
		Scanner sc = new Scanner(System.in);
		
		
		
		do {
			System.out.println("======  >>  메인메뉴  <<  ======== \n" + 
								"1. 구직자 회원가입    2. 구인회사 회원가입 \n"+ 
								"3. 구직자 로그인       4. 구인회사 로그인 \n" + 
								"5. 모든 구직자 출력   6. 모든 구인회사 출력 \n"+ 
								"7. 로그아웃              8. 프로그램 종료\n");
			System.out.print("▷ 메뉴를 선택해주세요 => ");
			String choice = sc.nextLine();
			switch (choice) {
			case "1":
				
				break;

			default:
				break;
			}
		} while (true);
		
		
	}

}
