package bookrental;

import java.util.List;

public interface interBookDAO {

	// 도서목록출력
	bookDTO bookInfoInput(String isbm, String bookctg, String bookname, String authorname, String publishcom, String price);

	// 개별도서정보입력
	int bookInfoInput(String bookisbm, String bookid);

	// 대여중 도서목록
	List<bookDTO> checkOutInfo();

	// 도서 대여여부 확인하기
	boolean checkOut(String bookid, bookDTO bdto);

}
