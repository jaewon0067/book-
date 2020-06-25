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
	private BookcartbookVO Bookcartbook = null; // ���ο� vo ���� �ʿ��� ���� �־ �ϴ� ����

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

	public ArrayList<getbookName_dateVO> getbookName_date() {
		return null;

	}

	public boolean removefrombookbasket(String table_values, Member_LibraryVo user) {
		int cnt = dao.removeOne(table_values, user);
		if (cnt > 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean todeli(String deletebookcode, Member_LibraryVo user, String deletebooklib) {
		int cnt = dao.updatedeli(deletebookcode, user, deletebooklib);
		if (cnt > 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean emptybookcart(Member_LibraryVo user) {
		int cnt = dao.emptycart(user);
		if (cnt > 0) {
			return true;
		} else {
			return false;
		}
	}
}
