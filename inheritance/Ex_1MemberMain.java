/*
 	Introduction
 	
 	======  >>  메인메뉴  <<  ======== 
	1. 구직자 회원가입    2. 구인회사 회원가입 
	3. 구직자 로그인       4. 구인회사 로그인 
	5. 모든 구직자 출력   6. 모든 구인회사 출력 
	7. 로그아웃              8. 프로그램 종료
	
	1. 해당 프로그램이 실행되도록 만들기
	2. 구직자와 구인회사 2개씩 배열에 미리 등록하기
 */

package inheritance;

import java.util.*;

public class Ex_1MemberMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		M_Company[] coArr = new M_Company[5];
		M_Employee[] emArr = new M_Employee[5];
		M_CtrlMember ctrl = new M_CtrlMember();
		
		M_Employee em1 = new M_Employee();
		em1.setId("abc");
		em1.setPasswd("123qerAW---");
		em1.setName("고구마");
		em1.setJubun("9712121");
		emArr[0] = em1;
		em1.ecount++;
		
		M_Employee em2 = new M_Employee();
		em2.setId("def");
		em2.setPasswd("54qerW///");
		em2.setName("감자");
		em2.setJubun("8712121");
		emArr[1] = em2;
		em2.ecount++;
		
		M_Company co1 = new M_Company();
		co1.setId("CJE&M");
		co1.setPasswd("q3weAD8+8");
		co1.setName("CJ");
		co1.setJobType("방송통신업");
		coArr[0] = co1;
		co1.ccount++;
		
		M_Company co2 = new M_Company();
		co2.setId("Microsoft");
		co2.setPasswd("q3wefgA+8");
		co2.setName("Microsoft");
		co2.setJobType("IT");
		coArr[1] = co2;
		co2.ccount++;

				
		do {
			System.out.println("\n=====  >>  메인메뉴  <<  ======== \n" + 
								"1. 구직자 회원가입    2. 구인회사 회원가입 \n"+ 
								"3. 구직자 로그인       4. 구인회사 로그인 \n" + 
								"5. 모든 구직자 출력   6. 모든 구인회사 출력 \n"+ 
								"7. 로그아웃              8. 프로그램 종료\n");
			System.out.print("▷ 메뉴를 선택해주세요 => ");
			String choice = sc.nextLine();
			switch (choice) {
			case "1":
				ctrl.signInEmloyee(sc, emArr);
				break;
				
			case "2":
				ctrl.signInCompany(sc, coArr);
				break;
				
			case "5":
				ctrl.printEmloyee(emArr);
				break;
				
			case "6":
				ctrl.printCompany(coArr);
				break;

			default:
				break;
			}
		} while (true);
		
		
	}

}
