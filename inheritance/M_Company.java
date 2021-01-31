package inheritance;

import java.text.DecimalFormat;
import java.util.Scanner;

public class M_Company extends M_Member {

	public static int ccount;
	
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

	public void setSeedMoney(long seedMoney) {
		try {
			DecimalFormat df = new DecimalFormat();
			this.seedMoney = df.format(seedMoney);
		} catch (NumberFormatException e) {
			System.out.println("금액을 바르게 표기해주세요!");
		}
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
		setSeedMoney(Long.parseLong(sc.nextLine()));
	}
	
	@Override
	public void showAll() {
		System.out.println("\n1. 아이디 : "+getId()+"\n"
				         +"2. 암호 : "+getPasswd()+"\n"
					     +"3. 회사명 : "+getName()+"\n"
					     +"4. 업종 : "+getJobType()+"\n"
					     +"5. 자본금 : "+getSeedMoney());
	}
	
}
