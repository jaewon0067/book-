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

	public ArrayList<String> getBorrowList() {
		ArrayList<String> list = new ArrayList<String>();
		getConnection();
		String sql = "SELECT BORROW_DATE FROM DELI_INFO";
		try {
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				String value = rs.getString(1);
				value = value.substring(5, 7); // 월
				list.add(value);
			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			close();
		}

		return list;
	}

	public ArrayList<String> recommand() {

		ArrayList<String> list = new ArrayList<String>();
		getConnection();
		String sql = "select book_name from deli_info where gender=0";
		try {
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();

			while (rs.next()) {
				String value = rs.getString("book_name");
				// value.split(",");
				list.add(value);

			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return list;
	}

	public ArrayList<String> uk() {
		ArrayList<String> list = new ArrayList<String>();
		getConnection();
		String sql = "select DISTINCT book_name from deli_info where gender=0";
		try {
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();

			while (rs.next()) {
				String value = rs.getString("book_name");
				// value.split(",");
				list.add(value);

			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return list;
	}

}
