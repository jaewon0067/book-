package Controller;

import java.util.ArrayList;


import Model.BookcartbookVO;

import Model.Member_LibraryDAO;
import Model.Member_LibraryVo;

public class LibraryManagementSystem {
	
	private Member_LibraryDAO dao = new Member_LibraryDAO();
	private Member_LibraryVo loginUser;
	private ArrayList<BookVO> booklist = new ArrayList<BookVO>();
	private ExcelRead excelRead = new ExcelRead();
	private BookcartbookVO Bookcartbook = null; //새로운 vo 생성 필요할 수도 있어서 일단 만듬


	public ArrayList<BookVO> getSearchBook(String searchbook) {
		ArrayList<BookVO> list = excelRead.getBookList();
		ArrayList<BookVO> searchresult = new ArrayList();
		BookVO vo = null;
		for (BookVO my : list) {
			if (my.book_name.contains(searchbook)) {
				searchresult.add(my);
			} else if (my.author.equals(searchbook)) {
				searchresult.add(my);
			}
		}
		return searchresult;
	}


	public BookVO getSearchcode(String searchcode) {
		ArrayList<BookVO> list = excelRead.getBookList();
		BookVO vo = null;
		for (BookVO my : list) {
			if (my.book_id.equals(searchcode)) {
				vo = my;
			}
		}
		return vo;
	}


	public Member_LibraryVo getLoginUser() {
		return loginUser;
	}

	public Member_LibraryVo login(Member_LibraryVo user) {
		loginUser = dao.selectOne(user);
		if (loginUser == null) {
			return loginUser;
		} else {
			return loginUser;
		}

	}

	public int join(Member_LibraryVo joinUser) {
		int cnt = dao.insert(joinUser);

		return cnt;
	}


	public boolean bookcartin(BookVO vo) {
		
//		Bookcartbook = dao.intobookcart(getLoginUser(), name, vo);
		if (Bookcartbook == null) {
			return false;
		} else {
			return true;
		}
	}


}
