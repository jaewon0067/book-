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

	private void getbookName_date1() {

		getConnection();

		getbookName_dateVO vo = null;

		ArrayList<getbookName_dateVO> list1 = new ArrayList<getbookName_dateVO>();

		String sql = "select book_name, borrow_Date from DELI_INFO where borrow_date like '%01%'";

		try {
			pst = conn.prepareStatement(sql);

			rs = pst.executeQuery();

			if (rs.next()) {
				String book_name = rs.getString(1);
				String borrow_date = rs.getString(2);

				vo = new getbookName_dateVO(book_name, borrow_date);

				list1.add(vo);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}
	
	

}
