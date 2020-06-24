package Model;

import java.awt.Dimension;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JTable;

public class TableDAO {
	private Connection conn; // ���������� ����
	private PreparedStatement pst; // ���۷��� �������� �ʵ�� �ְԵǸ� �⺻������ null��
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
		// 2. DB����
		catch (SQLException e) { // DB�� ���� ����ó��

			e.printStackTrace();
		}

	}private void close() {
		try { // 5. DB���� ����
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
			String []title = {"å ����", "�ݳ�����"};
			String [][]data = {{"��� ���� �߱��", "�ߺο�ġ ������Ű"},
	        		{"1�� 1� : ���� ���ŵ� ���� �ǰ� ����", "������"},
	        		{"�ҸӴϰ� ���� ����", "���Ÿ� ������ ����"},
	        		{"�츮���� ����", "������"},
	        		{"ī���������� ������ 1", "�����俹����Ű"},
	        		{"������", "������ ���ͽ��Ǿ� ����"},
	        		{"����ġ���� ��幮Ʈ", "�츣�� �켼"}
					
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

