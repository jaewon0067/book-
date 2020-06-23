package Controller;




import java.util.ArrayList;

import Model.Member_LibraryDAO;
import Model.Member_LibraryVo;

public class LibraryManagementSystem {
	private Member_LibraryDAO dao = new Member_LibraryDAO();
	private Member_LibraryVo loginUser;
	private ExcelRead excelRead = new ExcelRead();
	
	public ArrayList<BookVO> getSearchBook(String searchbook) {
		ArrayList<BookVO> list = excelRead.getBookList();
		ArrayList<BookVO> searchresult = new ArrayList();
		BookVO vo = null;
		for(BookVO my : list) {
			if(my.book_name.contains(searchbook)) {
				searchresult.add(my);
			}else if (my.author.equals(searchbook)) {
				searchresult.add(my);
		}}
		return searchresult;
	}
	
	
	
	
	
	
	public Member_LibraryVo getLoginUser() {
		return loginUser;
	}
	public Member_LibraryVo login(Member_LibraryVo user) {
		loginUser = dao.selectOne(user);
	if(loginUser == null) {
		return loginUser;
	}else {
		return loginUser;
	}
	
	}
	public int join(Member_LibraryVo joinUser) {
		int cnt = dao.insert(joinUser);
		
		return cnt;
	}
	
	
	
	
}
