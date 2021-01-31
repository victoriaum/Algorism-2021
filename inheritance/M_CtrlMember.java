package inheritance;

import java.util.Scanner;

public class M_CtrlMember {
	
	M_Company co = new M_Company();
	M_Employee em = new M_Employee();
	
	public void signInEmloyee(Scanner sc, M_Employee[] emArr) {
		for (int i=0; i<emArr.length; i++) {
			if(emArr[i]==null) {
				em.signEmployee(sc);
				emArr[i]=em;
				System.out.println("\n회원가입에 성공하셨습니다!!");
				break;
			}
		}
	}
	
	public void signInCompany(Scanner sc, M_Company[] coArr) {
		for (int i=0; i<coArr.length; i++) {
			if(coArr[i]==null)
				coArr[i]=co;
		}
	}
	
	public void printEmloyee(M_Employee[] emArr) {
		for (int i=0; i<em.ecount; i++) {
			emArr[i].showAll();
		}
	}
	
	public void printCompany(M_Company[] coArr) {
		for (int i=0; i<co.ccount; i++) {
			coArr[i].showAll();
		}
	}

}
