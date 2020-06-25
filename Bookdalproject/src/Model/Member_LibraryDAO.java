package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Controller.BookVO;

public class Member_LibraryDAO {
	
	
	
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
	
	
	
	
	
	public Member_LibraryVo selectOne(Member_LibraryVo user) { // �α���
		Member_LibraryVo loginUser = null;
		getConnection();
		
		try {
			String sql = "SELECT * from MEMBER_Library where id = ? and pw = ?";
			pst = conn.prepareStatement(sql);
			pst.setString(1, user.getId());
			pst.setString(2, user.getPw());
			rs = pst.executeQuery();
			if(rs.next()) {
				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String name = rs.getString("name");
				String age = rs.getString("age");
				String phone = rs.getString("Phone");
				String gender = rs.getString("gender");
				String addr = rs.getString("addr");
				loginUser = new Member_LibraryVo(id,pw,name,age,phone,gender,addr); // Ȩȭ�鿡�� �̸� �����
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
		return loginUser;
	}
	
	
	
	
	
	
	
	
	
	
	public int insert(Member_LibraryVo joinUser) {
		getConnection();
		int row = 0;
		
		String sql = "insert into MEMBER_library values(?, ?, ?, ?, ?, ?, ?)"; // ȸ������
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
		}catch(Exception e){
			
		}finally {
			close();
		}
		return row;
	}
	public BookcartbookVO intobookcart(BookVO vo) {
		
		BookcartbookVO Bookcartbook = null;
		
		getConnection();
		
		String sql = "INSERT INTO BOOKCART VALUES(?,?,?,?,?,?,?,?)";
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, vo.getBook_name()); //�ӽù���
			pst.setString(2, vo.getBook_name());//�ӽù���
//			pst.setString(1, member_ID); //��� ���̵�� ��� ��������?
//			pst.setString(2, member_Name); //��� �̸��� ��� ��������?
			pst.setString(3, vo.getBook_name());
			pst.setString(4, vo.getBook_id());
			pst.setString(5, vo.getAuthor());
			pst.setString(6, vo.getPublisher());
			pst.setString(7, vo.getLib_location());
			pst.setString(8, vo.getStatus());
			rs = pst.executeQuery();
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			close();
		}

//		BookcartbookVO(String member_ID, String member_Name, String book_Name, String book_ID, String author,
//				String publisher, String library, String status)
		
		return Bookcartbook;
	}
	


}
