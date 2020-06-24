package Model;

import java.awt.Dimension;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JTable;

public class TableDAO {
	private Connection conn; // 전역변수로 설정
	private PreparedStatement pst; // 레퍼런스 변수들은 필드로 넣게되면 기본값으로 null값
	private ResultSet rs;
	private Member_LibraryVo user;
	private Member_LibraryVo loginUser;
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

	}private void close() {
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
	public JTable getTable() {
		getConnection();
		JTable table = null;
		
		
		try {
			String sql = "select BOOK_NAME from DELI_INFO where name like ? ";
			pst = conn.prepareStatement(sql);
			pst.setString(1, loginUser.getName());
			rs = pst.executeQuery();
			if(rs.next()) {
			String []title = {"책 제목", "반납기한"};
			String [][]data = {{"어떻게 잠을 잘까요", "야부우치 마사유키"},
	        		{"1日 1茶 : 매일 마셔도 좋은 건강 약차", "신혜정"},
	        		{"할머니가 남긴 선물", "마거릿 와이즈 브라운"},
	        		{"우리끼리 가자", "윤구병"},
	        		{"카라마조프가의 형제들 1", "도스토예프스키"},
	        		{"오셀로", "윌리엄 셰익스피어 원작"},
	        		{"나르치스와 골드문트", "헤르만 헤세"}
					
					};
			table = new JTable(data, title);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
	return table;
}

}

