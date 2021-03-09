package bookrental;

import java.util.*;


public interface interUserDAO {

	   // 회원가입(insert) 메소드
	   int memberRegister(userDTO user, Scanner sc);
	   
	   // 로그인처리(select) 메소드
	   userDTO login(userDTO udto, Map<String, String> paraMap);
	   
	   
	}