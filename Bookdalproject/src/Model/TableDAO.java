package Model;

import java.awt.Dimension;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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
	public DefaultTableModel  getTable(Member_LibraryVo user) {
		
		getConnection();
		JTable table;
		String []title = {"ID", "�ݳ�����", "å ����", "���� ������"};
		/*
		 * JFrame frame = new JFrame("���� ����");
		 * 
		 * JPanel panel_3 = new JPanel(); panel_3.setBounds(29, 104, 357, 213);
		 * frame.getContentPane().add(panel_3);
		 */
		
		DefaultTableModel model = new DefaultTableModel(title, 0); 
		table = new JTable(model);
		String arr[] = {"ID", "�ݳ�����", "å ����", "���� ������"};
		String a = "ID";
		String b = "�ݳ� ����";
		String c = "å ����";
		String d = "���� ������";
	
		
		try {
			String sql = "select ID, BORROW_DATE+15, BOOK_NAME, LIB_NAME  from DELI_INFO where id = ?  and RETURN_day is null ";
			pst = conn.prepareStatement(sql);
			pst.setString(1, user.getId());
			rs = pst.executeQuery();
			while(rs.next()) {
				
				String id = rs.getString("ID");
				String Borrow_date = rs.getString("BORROW_DATE+15");
				String Book_name = rs.getString("BOOK_NAME");
				String Lib_name = rs.getString("LIB_NAME");
				
				model.addRow(new Object[] {id, Borrow_date, Book_name, Lib_name});
			
				
			}
			table.setVisible(true);
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
		
	return model;
}

}

