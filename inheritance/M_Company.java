package inheritance;

import java.util.Scanner;

public class M_Company extends M_Member {

	String jobType;
	String seedMoney;
	
	public String getJobType() {
		return jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	public String getSeedMoney() {
		return seedMoney;
	}

	public void setSeedMoney(String seedMoney) {
		this.seedMoney = seedMoney;
	}

	public void signIn(Scanner sc) {
		System.out.print("\n** 구직자 회원가입 **\n"
				+ "1. 아이디 : ");
		setId(sc.nextLine());
		System.out.print("2. 비밀번호 : ");
		setPasswd(sc.nextLine());
		System.out.print("3. 회사명 : ");
		setName(sc.nextLine());
		System.out.print("4. 업종 : ");
		setJobType(sc.nextLine());
		System.out.print("5. 자본금 : ");
		setSeedMoney(sc.nextLine());
		
	}
	
}
