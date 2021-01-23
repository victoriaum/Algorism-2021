/*
 	Introduction
 	1. Member Å¬·¡½º¸¦ ºÎ¸ğÅ¬·¡½º·Î ÇÏ°í Empolyee¿Í Company¸¦ ÀÚ¼ÕÅ¬·¡½º·Î ÇÏ´Â method Å¬·¡½º¸¦ »ı¼ºÇÑ´Ù
 	2. getter¿Í setter¸¦ ÀÌ¿ëÇÏ±â
 	3. ¸ğµç ¼Ó¼ºÀº private Á¢±ÙÁ¦¾îÀÚ·Î »ı¼º
 	4. °¢ ¼Ó¼º°ªÀÇ Á¶°ÇÀ» Ãß°¡ÇØ¼­ ÀÔ·Â°ª Á¦¾îÇÏ±â
 	// ¼º¸íÀº ÇÑ±Û¸¸ °¡´É(Á¤±ÔÇ¥Çö½ÄÀÇ È°¿ë)
 	// ºñ¹Ğ¹øÈ£´Â 8~15±ÛÀÚÀÇ ´ë¼Ò¹®ÀÚ, Æ¯¼ö±âÈ£, ¼ıÀÚÀÇ È¥ÇÕ
 	// ¾ÆÀÌµğ, ºñ¹Ğ¹øÈ£, ¼º¸íÀº ¸ğµÎ null, °ø¹éÀÌ ¾Æ´Ï¿©¾ß ÇÑ´Ù.
 */

package inheritance;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class M_Member {

	private String id;
	private String passwd;
	private String name;

	public void getId(String id) {
		if(id!=null && !id.trim().isEmpty())
			// °ø¹éÀÌ µé¾î¿ÔÀ» ¶§ÀÇ °ªÀ» ¹èÁ¦ÇÏ±â À§ÇØ¼­ trim()À¸·Î ¾ÕµÚ °ø¹éÀ» Á¦°ÅÇÏ°í isEmpth()·Î °ø¹é¿©ºÎ¸¦ ÆÇ´Ü°¡´É
			this.id = id;
		else
			System.out.println("¾ÆÀÌµğ¸¦ ´Ù½Ã ÀÔ·ÂÇØÁÖ¼¼¿ä!!");	
	} 
		
	public void getPasswd(String passwd) {
		if(passwd.checkPwd())
		this.passwd = passwd;
	}
	
	public void getName(String name) {
		if(name!=null && !name.trim().isEmpty()) {
			Pattern p = Pattern.compile("^[°¡-ÆR]{2,5}$");
			Matcher m = p.matcher(name);
			boolean b = m.matches();
			if(b)	this.name = name;
		} else
			System.out.println("¼º¸íÀ» ´Ù½Ã ÀÔ·ÂÇØÁÖ¼¼¿ä!!");	
	}
	
}
