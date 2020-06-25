package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import Controller.BookVO;

public class Member_LibraryDAO {

	private Connection conn; // 전역변수로 설정
	private PreparedStatement pst; // 레퍼런스 변수들은 필드로 넣게되면 기본값으로 null값
	private ResultSet rs;
	private Member_LibraryVo user;
	private Member_LibraryVo loginName;

	private void getConnection() {
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		// 2. DB연결
		catch (SQLException e) { // DB에 대한 예외처리

			e.printStackTrace();
		}

	}

	private void close() {
		try { // 5. DB연결 종료
			if (rs != null) {
				rs.close();
			}
			if (pst != null) {
				pst.close();

			}
			if (conn != null) {
				conn.close();

			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public Member_LibraryVo selectOne(Member_LibraryVo user) { // 로그인
		Member_LibraryVo loginUser = null;
		getConnection();

		try {
			String sql = "SELECT * from MEMBER_Library where id = ? and pw = ?";
			pst = conn.prepareStatement(sql);
			pst.setString(1, user.getId());
			pst.setString(2, user.getPw());
			rs = pst.executeQuery();
			if (rs.next()) {
				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String name = rs.getString("name");
				String age = rs.getString("age");
				String phone = rs.getString("Phone");
				String gender = rs.getString("gender");
				String addr = rs.getString("addr");
				loginUser = new Member_LibraryVo(id, pw, name, age, phone, gender, addr); // 홈화면에서 이름 띄워줌
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return loginUser;
	}

	public int insert(Member_LibraryVo joinUser) {
		getConnection();
		int row = 0;

		String sql = "insert into MEMBER_library values(?, ?, ?, ?, ?, ?, ?)"; // 회원가입
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, joinUser.getId());
			pst.setString(2, joinUser.getPw());
			pst.setString(3, joinUser.getName());
			pst.setString(4, joinUser.getAge());
			pst.setString(5, joinUser.getGender());
			pst.setString(6, joinUser.getPhone());
			pst.setString(7, joinUser.getAddr());
			System.out.println(joinUser.getId());
			row = pst.executeUpdate();
			System.out.println(row);
		} catch (Exception e) {

		} finally {
			close();
		}
		return row;
	}

	public BookcartbookVO intobookcart(String id, String name, BookVO vo) {

		BookcartbookVO Bookcartbook = null;

		getConnection();

		String sql = "INSERT INTO BOOKCART VALUES(?,?,?,?,?,?,?)";
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, id); // 멤버 아이디는 어디서 가져오지?
			pst.setString(2, name); // 멤버 이름은 어디서 가져오지?
			pst.setString(3, vo.getBook_name());
			pst.setString(4, vo.getBook_id());
			pst.setString(5, vo.getAuthor());
			pst.setString(6, vo.getPublisher());
			pst.setString(7, vo.getLib_location());
			int cnt = pst.executeUpdate();
			System.out.println(cnt);
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			close();
		}

		return Bookcartbook;
	}

	public int booknumber(Member_LibraryVo user) {
		int num = 0;

		getConnection();
		try {
			String sql = "select BOOK_NAME, CODE, WRITER, PUBLISHER, LIB_NAME from BOOKCART where ID = ? ";
			pst = conn.prepareStatement(sql);
			pst.setString(1, user.getId());
			rs = pst.executeQuery();
			while (rs.next()) {
				num++;
			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			close();
		}
		return num;
	}

//	public BookcartbookVO MovetoDeli(Member_LibraryVo user) {
//		BookcartbookVO Bookcartbook_1 = null;
//		getConnection();
//		try {
//			String sql = "INSERT INTO DELI_INFO VALUES(order_number1.nextval, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
//			pst = conn.prepareStatement(sql);
//			pst.setString(1,);
//			pst.setString(2);
//			pst.setString(3);
//			pst.setString(4);
//			pst.setString(5);
//			pst.setString(6);
//			pst.setString(7);
//			pst.setString(8);
//			pst.setString(9);
//			pst.setString(10);
//		} catch (SQLException e) {
//
//			e.printStackTrace();
//		} finally {
//			close();
//		}

//	}

	public int removeOne(String table_values, Member_LibraryVo user) {
		int cnt =0;
		getConnection();
		try {
			String sql = "DELETE from BOOKCART where ID = ? and CODE = ? ";
			pst = conn.prepareStatement(sql);
			pst.setString(1, user.getId());
			pst.setString(2, table_values);
			cnt = pst.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
		
	}

	public int updatedeli(String deletebookcode, Member_LibraryVo user2, String deletebooklib) {
		int cnt = 0;
		getConnection();
		SimpleDateFormat format1 = new SimpleDateFormat ("yyyy-MM-dd");
		String today = format1.format(System.currentTimeMillis());
		long retd = System.currentTimeMillis()+1296000000;
		String returndate = format1.format(retd);

		try {
			String sql = "INSERT INTO DELI_INFO VALUES(order_number1.nextval, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			pst = conn.prepareStatement(sql);
			pst.setString(1, user2.getId());
			pst.setString(2, deletebookcode);
			pst.setString(3, user2.getAddr());
			pst.setInt(4, Integer.parseInt(user2.getAge()));
			if(user2.getGender()=="F") {
				pst.setInt(5,0);
			}else {
				pst.setInt(5, 1);
			}
			pst.setInt(6, 2000);
			pst.setString(7, "대출중");
			pst.setString(8, null);
			pst.setString(9, deletebooklib);
			pst.setString(10, today);
			cnt = pst.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}

	public int emptycart(Member_LibraryVo user2) {
		int cnt =0;
		getConnection();
		try {
			String sql = "DELETE from BOOKCART where ID = ?";
			pst = conn.prepareStatement(sql);
			pst.setString(1, user2.getId());
			cnt = pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}
}
