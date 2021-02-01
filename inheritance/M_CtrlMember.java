package inheritance;

import java.util.*;

public class M_CtrlMember {
	
	M_Employee em = new M_Employee();
	M_Company co = new M_Company();
	
	
	public void signInEmloyee(Scanner sc, M_Employee[] emArr) {
		
		System.out.println("\n** 구직자 회원가입 **\n");
		
		outId:
		do {
			System.out.print("1. 아이디 : ");
			String id = sc.nextLine();
						
			for (int i=0; i<em.ecount; i++) {
				if(!id.equals(emArr[i].getId())) {
					em.setId(id);
					id = em.getId();
					if(id==null) continue outId;
				} else {
					System.out.println("입력된 아이디는 이미 등록된 아이디입니다. 다른 아이디를 입력해주세요!");
					continue outId;	
				}
			}
			break;
		} while(true);
		
		
		do {
			System.out.print("2. 비밀번호 : ");
			String passwd = sc.nextLine();
			em.setPasswd(passwd);
			passwd = em.getPasswd();
			if(passwd==null) continue;
			break;
		} while(true);

		
		do {
			System.out.print("3. 성명 : ");
			String name = sc.nextLine();
			em.setName(name);
			name = em.getName();
			if(name==null) continue;
			break;
		} while(true);
		
		
		do {
			System.out.print("4. 주민등록번호 앞  7자리 : ");
			String jubun = sc.nextLine();
			em.setJubun(jubun);
			jubun = em.getJubun();
			if(jubun==null) continue;
			break;
		} while(true);
		
		emArr[em.ecount] = em;
			
	}
	
	
	public void signInCompany(Scanner sc, M_Company[] coArr) {
		
		System.out.println("\n** 구인회사 회원가입 **\n");
		
		outId:
		do {
			System.out.print("1. 아이디 : ");
			String id = sc.nextLine();
						
			for (int i=0; i<co.ccount; i++) {
				if(!id.equals(coArr[i].getId())) {
					co.setId(id);
					id = co.getId();
					if(id==null) continue outId;
				} else {
					System.out.println("입력된 아이디는 이미 등록된 아이디입니다. 다른 아이디를 입력해주세요!");
					continue outId;	
				}
			}
			break;
		} while(true);
		
		
		do {
			System.out.print("2. 비밀번호 : ");
			String passwd = sc.nextLine();
			co.setPasswd(passwd);
			passwd = co.getPasswd();
			if(passwd==null) continue;
			break;
		} while(true);

		
		do {
			System.out.print("3. 회사명 : ");
			String name = sc.nextLine();
			co.setName(name);
			name = co.getName();
			if(name==null) continue;
			break;
		} while(true);
		
		
		do {
			System.out.print("4. 직종 : ");
			String jobType = sc.nextLine();
			co.setJobType(jobType);
			jobType = co.getJobType();
			if(jobType==null) continue;
			break;
		} while(true);
		
		
		do {
			System.out.print("5. 자본금 : ");
			String seedMoney = sc.nextLine();
			co.setSeedMoney(Long.parseLong(seedMoney));
			seedMoney = co.getSeedMoney();
			if(seedMoney==null) continue;
			break;
		} while(true);
		
		 coArr[co.ccount] = co;
			
	}
	
	
	public void printEmloyee(M_Employee[] emArr) {
		System.out.println("\n총 구직자 수 : "+em.ecount);
		for (int i=0; i<em.ecount; i++) {
			emArr[i].showAll();
		}
	}
	
	
	public void printCompany(M_Company[] coArr) {
		System.out.println("\n총 구인회사 수 : "+co.ccount);
		for (int i=0; i<co.ccount; i++) {
			coArr[i].showAll();
		}
	}
	
	M_Employee emDB = null;
	M_Company coDB = null;
	
	public M_Employee loginEmployee(Scanner sc, M_Employee[] emArr) {
		
		System.out.println("\n** 구직자 로그인 **\n");

		do {
		System.out.print("1. 아이디 : ");
		String id = sc.nextLine();
		System.out.print("2. 암호 : ");
		String passwd = sc.nextLine();
					
		for (int i=0; i<em.ecount; i++) {
			if(id.equals(emArr[i].getId())) {
				if(passwd.equals(emArr[i].getPasswd())) {
						System.out.println("\n"+emArr[i].getName()+" 님으로 로그인되었습니다!");
						emArr[i].showAll();
						return emDB = emArr[i];
				} else
					System.out.println("암호가 잘못되었습니다. 다시 입력해주세요!");
			} else 
				System.out.println("입력된 아이디를 가진 구직자는 없습니다. 다시 입력해주세요!");
		}
		} while(true);
	}
	
	
	public M_Company loginCompany(Scanner sc, M_Company[] coArr) {
		
		System.out.println("\n** 구인회사 로그인 **\n");

		do {
		System.out.print("1. 아이디 : ");
		String id = sc.nextLine();
		System.out.print("2. 암호 : ");
		String passwd = sc.nextLine();
					
		for (int i=0; i<co.ccount; i++) {
			if(id.equals(coArr[i].getId())) {
				if(passwd.equals(coArr[i].getPasswd())) {
						System.out.println("\n"+coArr[i].getName()+" 님으로 로그인되었습니다!");
						coArr[i].showAll();
						return coDB = coArr[i];
				} else
					System.out.println("암호가 잘못되었습니다. 다시 입력해주세요!");
			} else 
				System.out.println("입력된 아이디를 가진 구인회사는 없습니다. 다시 입력해주세요!");
		}
		} while(true);
	}
	
	
	public void logout(M_Employee[] emArr, M_Company[] coArr) {
		if(emDB!=null) {
			System.out.println(emDB.getName()+"님이 로그아웃 되었습니다.");
			emDB = null;
		} else {
			System.out.println(coDB.getName()+"로그아웃 되었습니다.");
			coDB = null;
		}
	}
}
