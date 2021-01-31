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
		
		M_Employee[] emArr = new M_Employee[5];
		M_Company[] coArr = new M_Company[5];
		M_CtrlMember ctrl = new M_CtrlMember();
		
		
		M_Employee em = new M_Employee();	
		em.setId("abc");
		em.setPasswd("123qerAW---");
		em.setName("고구마");
		em.setJubun("9712121");
		emArr[0] = em;
		em.ecount++;
		
		M_Employee em2 = new M_Employee();
		em2.setId("def");
		em2.setPasswd("54qerW///");
		em2.setName("감자");
		em2.setJubun("8712121");
		emArr[1] = em2;
		em2.ecount++;
		
		M_Company co = new M_Company();
		co.setId("CJE&M");
		co.setPasswd("q3weAD8+8");
		co.setName("CJ");
		co.setJobType("방송통신업");
		co.setSeedMoney(1000000000);
		coArr[0] = co;
		co.ccount++;
		
		M_Company co2 = new M_Company();
		co2.setId("Microsoft");
		co2.setPasswd("q3wefgA+8");
		co2.setName("Microsoft");
		co2.setJobType("IT");
		co2.setSeedMoney(8000000);
		coArr[1] = co2;
		co2.ccount++;

		String choice = "";
				
		do {
			System.out.println("\n=====  >>  메인메뉴  <<  ======== \n" + 
								"1. 구직자 회원가입    2. 구인회사 회원가입 \n"+ 
								"3. 구직자 로그인       4. 구인회사 로그인 \n" + 
								"5. 모든 구직자 출력   6. 모든 구인회사 출력 \n"+ 
								"7. 로그아웃              8. 프로그램 종료\n");
			System.out.print("▷ 메뉴를 선택해주세요 => ");
			choice = sc.nextLine();
			
			switch (choice) {
			case "1":
				ctrl.signInEmloyee(sc, emArr);
				em.ecount++;
				System.out.println("구직자 회원가입 성공!!");
				break;
				
			case "2":
				ctrl.signInCompany(sc, coArr);
				co.ccount++;
				System.out.println("구인회사 회원가입 성공!!");
				break;
				
			case "3":
				ctrl.loginEmployee(sc, emArr);
				break;
				
			case "4":
				ctrl.loginCompany(sc, coArr);
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
		} while (choice.equals("8"));
		
		
	}

}
