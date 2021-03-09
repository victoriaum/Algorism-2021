package bookrental;

import java.sql.*;
import java.util.*;


public class bookDAO implements interBookDAO {
	
	// field, attribute, property, 속성 
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	
	// === 자원반납 메소드  === //
	private void close() {
		try {
			 if(rs != null)    rs.close();
			 if(pstmt != null) pstmt.close();
			 
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}// end of private void close()----------------	

	
	@Override
	public bookDTO bookInfoInput(String isbm, String bookctg, String bookname, String authorname, String publishcom,
			String price) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int bookInfoInput(String bookisbm, String bookid) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	// 도서 대여여부 확인하는 메서드
	@Override
	public boolean checkOut(String bookid, bookDTO bdto) {
		  boolean b = false;
		  
		  try {
			  conn = ProjectDBConnection.getConn(); // conn 은 수동commit 으로 되어져 있다.
			  
			  String sql = " select status from book_list where bookid=? ";
			  
			  pstmt = conn.prepareStatement(sql);
			  pstmt.setString(1, bookid);
			  
			  rs = pstmt.executeQuery();
			  			  
			  if(rs.next()) {
				  bdto.setStatus(rs.getString(1));
			  		if(bdto.getStatus()=="0") {
			  			sql = " update book_list set status=1 where bookid=? ";
			  			pstmt = conn.prepareStatement(sql);
						pstmt.setString(1, bookid);
					    int n = pstmt.executeUpdate();
					    b=true;	// 대여성공  
			  		}
			  } else
				System.out.println("존재하지 않는 도서ID 입니다. 다시 입력하세요!!");	  
		  } catch(SQLException e) {
			  System.out.println("SQL 구문 오류입니다");
		  } finally {
				close();
		  }
		
		return b;
	}
	
	
	
	// 대여중 도서목록
	@Override
	public List<bookDTO> checkOutInfo() {
		List<bookDTO> checkoutList = new ArrayList();
		
		try {
			  conn = ProjectDBConnection.getConn(); // conn 은 수동commit 으로 되어져 있다.
			  
			  String sql = "select l.bookid, l.bookisbn, l.booktitle, l.authorname, l.publishcom\n"+
						  "     , m.userid, m.name, m.mobile, r.rentday, r.returnday\n"+
						  "from book_list L JOIN book_rent R\n"+
						  "ON L.status = R.rentstatus\n"+
						  "JOIN lib_member M\n"+
						  "ON R.userseq = M.userseq;";
			  
			  pstmt = conn.prepareStatement(sql);
			  rs = pstmt.executeQuery();
			  			  
			  while(rs.next()) {
				  bookDTO bdto = new bookDTO();
				  
				  bdto.setBookid(rs.getString(1));
				  bdto.setBookisbn(rs.getString(2));
				  bdto.setBooktitle(rs.getString(3));
				  bdto.setAuthorname(rs.getString(4));
				  bdto.setPublishcom(rs.getString(5));
				  
				  userDTO udto = new userDTO();
				  udto.setUserid(rs.getString(6));
				  udto.setUsername(rs.getString(7));
				  udto.setMobile(rs.getString(8));

				  bdto.setUser(udto);
				  
				  bdto.setRentday(rs.getString(9));
				  bdto.setReturnday(rs.getString(10));
				  
				  checkoutList.add(bdto);
			  }	
			   
		  } catch(SQLException e) {
			  System.out.println("SQL 구문 오류입니다");
		  } finally {
				close();
		  }
		return checkoutList;
	}

		

}
