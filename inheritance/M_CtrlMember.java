package inheritance;

import java.util.Scanner;

public class M_CtrlMember {
	
	M_Company co = new M_Company();
	M_Employee em = new M_Employee();
	
	public void getSignIn(Scanner sc) {
		em.signIn(sc);
	}

}
