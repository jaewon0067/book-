package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ChartDAO {

	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;
	private String borrow_date;
	private Member_LibraryVo user;
	private Member_LibraryVo loginUser;

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

//	public ArrayList<getbookName_dateVO> getbookName_date1(int i) {
//
//		getConnection();
//
//		getbookName_dateVO vo = null;
//
//		ArrayList<getbookName_dateVO> list1 = new ArrayList<getbookName_dateVO>();
//
//		String sql = "select book_name, borrow_Date from DELI_INFO where borrow_date like '2020-0?%'";
//
//		try {
//			pst = conn.prepareStatement(sql);
//			String month = i + "";
//			pst.setString(1, month);
//			rs = pst.executeQuery();
//
//			if (rs.next()) {
//				String book_name = rs.getString("book_name");
//				String borrow_date = rs.getString("borrow_date");
//
//				vo = new getbookName_dateVO(book_name, borrow_date);
//
//				list1.add(vo);
//
//			}
//
//		} catch (SQLException e) {
//
//			e.printStackTrace();
//		} finally {
//			close();
//		}
//		return list1;
//
//	}

	public ArrayList<String> getBorrowList() {
		ArrayList<String> list = new ArrayList<String>();
		getConnection();
		String sql = "SELECT BORROW_DATE FROM DELI_INFO";
		try {
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				String value = rs.getString(1);
				value = value.substring(5, 7); //월
				list.add(value);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {
			close();
		}

		return list;
	}
	
	/*
	 * public ArrayList<Read_UserVO> read_User(){
	 * 
	 * getConnection(); // JTable table; // String []title = {"ID", "반납기한", "책 제목",
	 * "소장 도서관"}; // JFrame frame = new JFrame("독서 내역"); // DefaultTableModel model
	 * = new DefaultTableModel(title, 0); // table = new JTable(model); // String
	 * arr[] = {"ID", "반납기한", "책 제목", "소장 도서관"};
	 * 
	 * Member_LibraryVo loginUser = null; Read_UserVO vo = null;
	 * 
	 * ArrayList<String> list = new ArrayList<String>();
	 * 
	 * try { String sql = "SELECT ID, BORROW_DATE FROM DELI_INFO WHERE ID=?"; pst =
	 * conn.prepareStatement(sql); pst.setString(1, user.getId()); rs =
	 * pst.executeQuery(); while(rs.next()) {
	 * 
	 * String mem_id = rs.getString("id"); String Borrow_date =
	 * rs.getString("Borrow_date");
	 * 
	 * vo = new Read_UserVO(mem_id, Borrow_date); //list.add(vo); }
	 * 
	 * 
	 * } catch (SQLException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); }finally { close(); }
	 * 
	 * return list; } }
	 */

}
