/*
 	Introduction
 	1. Member를 조상클래스로 받고 private 속성 하나(jubun)를 또 추가한다
 	2. getter와 setter를 이용하기 
 	// 추가 속성값 주번은 null이나 공백값이 아니여야 하며, 주민등록번호 앞 7자리가 입력될 수 있도록 정규표현식을 이용한다
 		
 */

package inheritance;

import java.util.*;
import java.util.regex.*;

public class M_Employee extends M_Member {
	
	
	private String jubun;

	public String getJubun() {
		return jubun;
	}

	public void setJubun(String jubun) {
		if(jubun!=null && jubun.trim().isEmpty()) 
			System.out.println("주민등록번호를 바르게 입력해주세요!!\n"
					+ "주민등록번호는 앞에서부터 7자리만 입력해주세요!!");

		Pattern p = Pattern.compile("^[1-9][0-9][0-1][0-9][0-3][0-9][1-4]$");
		Matcher m = p.matcher(jubun);
		boolean b = m.matches();
		if(b) 
			this.jubun = jubun;
		else
			System.out.println("주민등록번호를 바르게 입력해주세요!!\n"
					+ "주민등록번호는 앞에서부터 7자리만 입력해주세요!!");
	}
	
	@Override
	public void showAll() {
		System.out.println("\n1. 아이디 : "+getId()+"\n"
				          +"2. 암호 : "+getPasswd()+"\n"
					      +"3. 성명 : "+getName()+"\n"
					      +"4. 주민등록번호 앞 7자리 : "+getJubun());
	}
}
