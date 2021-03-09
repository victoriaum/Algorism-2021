package bookrental;


import java.util.*;


public class TotalController {

	interLibrarianDAO ldao = new librarianDAO();
	interUserDAO udao = new userDAO();
	interBookDAO bdao = new bookDAO();
	
	String menuNo;
	String menuNo2;
	
// menu_Start
	public void menu_Start(Scanner sc) {
		
		do {	
			System.out.println("===> 도서대여 프로그램 <===");
			System.out.println("1. 사서 전용메뉴     2. 일반회원 전용메뉴     3. 프로그램종료");
			System.out.print("=> 메뉴번호선택 : ");
			menuNo = sc.nextLine();	
			
			switch (menuNo) {
			case "1":
				librarianMenu(sc);
				break;
			case "2":
				userMenu(sc);
				break;
			default:
				System.out.println(">> 메뉴에 없는 번호입니다. 다시 입력하세요.\n");
				break;
			}   
		} while(!("3".equals(menuNo)));
	
	}

	


// librarianMenu
	private void librarianMenu(Scanner sc) {
		
		librarianDTO ldto = null;
		
		do {
			String loginId = (ldto == null)?" ":"["+ ldto.getAdminid() +"로 로그인 중..]"; 
			String addMenu = (ldto == null)?"4. 나가기":"4. 도서정보등록     5. 개별도서등록\n"
									                 + "6. 도서대여해주기      7. 대여중인도서조회     8. 도서반납해주기        9. 나가기"; 
	        
	        System.out.println("\n===> 사서 전용 메뉴 "+loginId+"<===");
			System.out.println("1. 사서가입      2. 로그인      3. 로그아웃     "+addMenu);
			System.out.print("=> 메뉴번호선택 : ");
			
			
			// 로그인 안되어 있을 때
			if(ldto == null) {
				menuNo = sc.nextLine();
				
				switch (menuNo) {
				case "1":
					librarianRegister(sc); // 사서 가입하기
					break;
				case "2":
					ldto=login(sc); // 로그인
					break;
				case "3":
					ldto=logout(); // 로그아웃
					break;				
				case "4":
					System.out.println("\n");
					break;	
				default:
					System.out.println(">> 메뉴에 없는 번호입니다. 다시 입력하세요.\n");
					break;
				}
			
				
			// 로그인 되어 있을 때
			} else {
				menuNo2 = sc.nextLine();
				
				switch (menuNo2) {
				case "1":
					librarianRegister(sc); // 사서 가입하기
					break;
				case "2":
					ldto=login(sc); // 로그인
					break;
				case "3":
					ldto=logout(); // 로그아웃
					break;				
				case "4":
					bookInfoInput(sc); // 도서정보등록
					break;
				case "5":
					bookDetailNo(sc); // 개별도서등록
					break;
				case "6":
					checkOut(sc); // 도서대여해주기
					break;
				case "7":
					checkOutInfo(); // 대여중인도서조회
					break;
				case "8":
					returnBook(sc); //도서반납하기
					break;
				case "9":
					System.out.println("\n");
					break;
				
				default:
					System.out.println(">> 메뉴에 없는 번호입니다. 다시 입력하세요.\n");
					break;
				}
			}
			
		} while(!("4".equals(menuNo) || "9".equals(menuNo2)));
	}

	



// userMenu
	private void userMenu(Scanner sc) {
        
         userDTO udto = null;

        
         do {
        	 String loginName = (udto == null)?"":"["+ udto.getUsername() +"로 로그인 중..]"; 
        	 String addMenu = (udto == null)?"4. 나가기":"4.도서검색하기   5.나의대여현황보기   6.나가기\n";
        	 
             System.out.println("\n===> 일반회원 전용메뉴 "+loginName+"<===");
             System.out.println("1.일반회원가입      2. 로그인     3. 로그아웃   "+addMenu);
             System.out.print("=> 메뉴번호선택 : ");
            
             // 회원이 로그인 안 되어 있을 때
             if(udto == null) {
 				 menuNo = sc.nextLine();
 				 
		         switch (menuNo) {
		         case "1":   //일반회원가입
		            memberRegister(sc);		            
		            break;
		         case "2":   //로그인
		        	 udto=userLogin(sc);		         
		            break;
		         case "3":   //로그아웃
		        	 udto=userLogout();		            
		            break;
		         case "4": 
		        	 System.out.println("\n");	            
		            break;
		   
		         default:
		            System.out.println(">> 메뉴에 없는 번호입니다. 다시 입력하세요.\n");
		            break;
		         }
		         
		         
		      // 회원이 로그인 되어 있을 때
             } else {
 				 menuNo2 = sc.nextLine();

		         switch (menuNo2) {
		         case "1":   //일반회원가입
		            memberRegister(sc);		            
		            break;
		         case "2":   //로그인
		        	 udto=userLogin(sc);		         
		            break;
		         case "3":   //로그아웃
		        	 udto=userLogout();		            
		            break;
		         case "4":   //도서검색하기
		            bookSearch(sc);		            
		            break;
		         case "5":   //나의대여현황보기
		            rentalStatus();		            
		            break;
		         case "6": 
		        	 System.out.println("\n");            
		            break;
		         
		         default:
		            System.out.println(">> 메뉴에 없는 번호입니다. 다시 입력하세요.\n");
		            break;
		         }
             }
	         
	       } while(!("4".equals(menuNo) || "6".equals(menuNo2)));
  	}
	

	
	
 //[사서 메서드]  ////////////////////////////////////////////////////////////////////////////////////////////////////
      
	
	
         
	// 사서 가입하기
	private void librarianRegister(Scanner sc) {
		int n = 0;
	
		do {
			System.out.println("\n=== 사서 가입하기 ===");
			System.out.print("▶ 사서ID: ");
			String adminid = sc.nextLine();
			System.out.print("▶ 암호: ");
			String passwd = sc.nextLine();
			
			librarianDTO ldto = new librarianDTO();
			ldto.setAdminid(adminid);
			ldto.setPasswd(passwd);
			
			n = ldao.librarianRegister(ldto, sc);
			
			
			 if(n == 0) {
		         System.out.println("\n >> 회원가입을 취소하셨습니다. ");
		      }
		      if(n == 1) {
		         System.out.println("\n >> 회원등록 성공! ");
		      }
		      if(n == -1) {
		         System.out.println("\n >> "+adminid+"가 이미 사용중이므로 다른 아이디를 입력하세요. ");
		      }
		      if(n == -2) {
		         System.out.println("\n >> SQL 구문에 오류가 발생함 ");
		      }
		} while (!(n == 0||n == 1));
    
	}
	
	
	
	
	// 로그인
	private librarianDTO login(Scanner sc) {
		
		librarianDTO ldto = null;
		
		System.out.println("\n=== 로그인하기 ===");
		System.out.print("▶ 사서ID: ");
		String adminid = sc.nextLine();
		System.out.print("▶ 암호: ");
		String passwd = sc.nextLine();
		
	      
	      Map<String, String> paraMap = new HashMap<>();
	      paraMap.put("adminid", adminid);
	      paraMap.put("passwd", passwd);
	      
	      ldto = ldao.login(ldto,paraMap);
	      
	      if(ldto != null) {
	         System.out.println("\n>>  로그인 성공   <<\n");
	      }
	      else {
	         System.out.println("\n>>  로그인 실패  <<\n");
	      }
	      
	      return ldto;
	}
	
	
	
	
	// 로그아웃
	private librarianDTO logout() {	
		librarianDTO ldto = null;
		System.out.println(">> 로그아웃 되었습니다. <<");
		
		return ldto;		
	}

	
	
	
	// 도서정보등록
	private void bookInfoInput(Scanner sc) {
		System.out.println("=== 도서정보 등록하기 ===");
		System.out.print("▶ 국제표준도서번호(ISBN): ");
		String isbm = sc.nextLine();
		System.out.print("▶ 도서분류카테고리: ");
		String bookctg = sc.nextLine();
		System.out.print("▶ 도서명: ");
		String bookname = sc.nextLine();
		System.out.print("▶ 작가명: ");
		String authorname = sc.nextLine();
		System.out.print("▶ 출판사: ");
		String publishcom = sc.nextLine();
		System.out.print("▶ 가격: ");
		String price = sc.nextLine();
		
		bdao.bookInfoInput(isbm, bookctg, bookname, authorname, publishcom, price);
	}
	
	
	
	
	// 개별도서정보등록
	private void bookDetailNo(Scanner sc) {
		System.out.println("=== 도서정보 등록하기 ===");
		System.out.print("▶ 국제표준도서번호(ISBN): ");
		String bookisbm = sc.nextLine();
		System.out.print("▶ 도서아이디: ");
		String bookid = sc.nextLine();
		
		bdao.bookInfoInput(bookisbm, bookid);
	}
	
	
	// 도서대여하기
	private void checkOut(Scanner sc) {
		librarianDTO ldto = new librarianDTO();
		bookDTO bdto = new bookDTO();
		
		System.out.println("\n=== 도서 대여하기 ===");
		System.out.print("▶ 회원ID: ");
		String userid  = sc.nextLine();
		ldto.setAdminid(userid);
		if(ldto.getAdminid().equals(userid)) {
			boolean b = false;
					
			System.out.print("▶ 총대여권수: ");
			String no = sc.nextLine();
			for (int i=0; i<Integer.parseInt(no); i++) {
				System.out.print("▶ 도서ID: ");
				String bookid = sc.nextLine();
				b = bdao.checkOut(bookid,bdto);
			}
			
			if(b==true) {
				System.out.println(">>> 대여등록 성공! <<<");
				System.out.println(">>> 대여도서 비치중에서 대여중으로 변경함");
			}
		} else
			System.out.println("~~~ 등록된 회원ID가 아닙니다 ~~~");
			
	}
	
	
	
	
	// 대여중인 도서정보 조회
	private void checkOutInfo() {
		System.out.println("===============================================================");
		System.out.println("도서ID            ISBN              도서명        작가명       출판사         회원ID     회원명       연락처           대여일자          반납예정일");
		System.out.println("===============================================================");
		List<bookDTO> checkoutList = bdao.checkOutInfo();
		
		if(checkoutList.size()>0) {
			for(bookDTO bdto : checkoutList) {
				System.out.println(bdto.getBookid()+"   "+bdto.getBookisbn()+"   "+bdto.getBooktitle()+"   "+bdto.getAuthorname()
							+"   "+bdto.getPublishcom()+"   "+bdto.getUser().getUserid()+"   "+bdto.getUser().getUsername()+"   "+bdto.getUser().getMobile()
							+"   "+bdto.getRentday()+"   "+bdto.getRentday());		
			}
		} 
			
	}
	
	
	
	
	//도서반납하기
	private void returnBook(Scanner sc) {
		System.out.println(">>> 도서반납하기 <<<");
		System.out.print("▶ 총반납권수: ");
		String returnno  = sc.nextLine();
		///**** 수정필요 ****
		for (int i=0; i<Integer.parseInt(returnno); i++) {
			System.out.print("▶ 반납도서ID: ");
			String bookid = sc.nextLine();
		}		
	}

	
	
  //[일반회원 메서드]     ////////////////////////////////////////////////////////////////////////////////////////////////////

	
	// ----- *** 일반회원가입 *** -----
    private void memberRegister(Scanner sc) {
    	int n = 0;
		
    	do {
	    	System.out.println("\n >> ======== 일반회원가입 ======== <<");
	        
	        System.out.print("▶  아이디 : ");
	        String userid= sc.nextLine();
	        
	        System.out.print("▶ 암호: ");
	        String passwd = sc.nextLine();
	        
	        System.out.print("▶  성명 : ");
	        String username = sc.nextLine();
	        
	        System.out.print("▶ 연락처(휴대폰) : ");
	        String mobile = sc.nextLine();
	         
	        userDTO udto = new userDTO();
	        udto.setUserid(userid);
	        udto.setPasswd(passwd);
	        udto.setUsername(username);
	        udto.setMobile(mobile);
	        
	        n = udao.memberRegister(udto, sc);
	        
	        if(n == 0) {
	           System.out.println("\n >> 회원가입을 취소하셨습니다. ");
	        } else if(n == 1) {
	           System.out.println("\n >> 회원등록 성공! ");
	        } else if(n == -1) {
	           System.out.println("\n >> "+userid+"가 이미 사용중이므로 다른 아이디를 입력하세요. ");
	        } else if(n == -2) {
	           System.out.println("\n >> SQL 구문에 오류가 발생함 ");
	        }
    	} while (!(n == 0||n == 1));
        
      
   }
    
    
    
   
   // ----- *** 일반회원 로그인 *** ----- 
    private userDTO userLogin(Scanner sc) {
       
    	userDTO udto = null;
        System.out.println("\n >>> --- 로그인 하기 --- <<<");
        
        System.out.print("▷ 아이디 : ");
        String userid = sc.nextLine();
        System.out.print("▷ 비밀번호 : ");
        String passwd = sc.nextLine();
        
        Map<String, String> paraMap = new HashMap<>();
        paraMap.put("userid", userid);
        paraMap.put("passwd", passwd);
        
        udto= udao.login(udto, paraMap);
        
        if(udto != null) {
           System.out.println("\n>>  로그인 성공   <<\n");
        }
        else {
           System.out.println("\n>>  로그인 실패  <<\n");
        }
        
        return udto;
           
         
   }//end of private userDTO userLogin(Scanner sc)--------
   
    
    
    
    
    
   // ----- *** 일반회원 로그아웃 *** -----
    private userDTO userLogout() {
    	userDTO udto = null;
	    System.out.println("\n >> 로그아웃 되었습니다. <<");
	    
	    return udto;
	} //end of private void userLogout(userDTO user) --------------------
       
    
    
    
   
   // ----- *** 일반회원 도서검색 *** -----
    private void bookSearch(Scanner sc) {

       
       System.out.println(">>> 도서 검색하기 <<<\n"
                     + "[주의사항] 검색어를 입력하지 않고 엔터를 하면 검색대상에서 제외됩니다.");
       System.out.print("▶ 도서분류 카테고리(Programming, DataBase 등): ");
       String category = sc.nextLine();
       
       System.out.print("▶ 도서명 :");
       String bookName = sc.nextLine();
      
       System.out.print("▶  작가명 :");
       String authorName = sc.nextLine();
       
       System.out.print("▶ 출판사명 :");
       String publisherName = sc.nextLine();
       
       
       
   }
    
    
   // ----- *** 일반회원 도서대여현황 *** -----
   private void rentalStatus() {
      
      System.out.println("============================================================");
      System.out.println("도서ID\t\t\t\tISBN\t\t도서명\t\t작가명\t출판사\t회원ID\t대여일자\t\t반납예정일");
      System.out.println("============================================================");
      
      
      
      
      
      
   }
	
}
