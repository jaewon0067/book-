package Controller;




import java.util.ArrayList;

import javax.swing.JTable;

import Model.BookVO;
import Model.Member_LibraryDAO;
import Model.Member_LibraryVo;

public class LibraryManagementSystem {
	private Member_LibraryDAO dao = new Member_LibraryDAO();
	private Member_LibraryVo loginUser;
	private BookVO vo;
	private ArrayList<BookVO> booklist = new ArrayList<BookVO>();
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