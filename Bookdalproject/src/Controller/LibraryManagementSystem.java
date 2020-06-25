package Controller;

import java.util.ArrayList;

import Model.BookcartbookVO;

import Model.Member_LibraryDAO;
import Model.Member_LibraryVo;
import Model.getbookName_dateVO;

public class LibraryManagementSystem {

	private Member_LibraryDAO dao = new Member_LibraryDAO();
	private Member_LibraryVo loginUser;
	private ArrayList<BookVO> booklist = new ArrayList<BookVO>();
	private ExcelRead excelRead = new ExcelRead();
	private BookcartbookVO Bookcartbook = null; // 새로운 vo 생성 필요할 수도 있어서 일단 만듬

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

	public boolean bookcartin(BookVO vo, Member_LibraryVo member) {
		System.out.println(vo.getAuthor());
		System.out.println(member.getId());
		Bookcartbook = dao.intobookcart(member.getId(), member.getName(), vo);
		if (Bookcartbook == null) {
			return false;
		} else {
			return true;
		}
	}
<<<<<<< HEAD
	
	public ArrayList<getbookName_dateVO> getbookName_date(){
		return null;
		
	}
	

=======
>>>>>>> branch 'master' of https://github.com/jaewon0067/book-.git

}
