package ashare;

public class ShareMethod {

	static boolean isCheckPwd(String passwd) {	
		char[] passArr = passwd.toCharArray();
		if(passwd.trim().isEmpty())	{
			return false;
		}
		boolean b1=false, b2=false;
		for (int i=0; i<passArr.length; i++) {
			if(Character.isUpperCase(passArr[i]) &&
			   Character.isLowerCase(passArr[i]) &&
			   Character.isDigit(passArr[i]))
				b1 = true;
			else b2 = true;
		}
		if(b1 && b2) return true;
	return false;
	}
	
}
