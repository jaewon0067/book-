package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Member_LibraryDAO {
	
	
	
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
	
	
	
	
	
	public Member_LibraryVo selectOne(Member_LibraryVo user) { // 로그인
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
				loginUser = new Member_LibraryVo(id,pw,name); // 홈화면에서 이름 띄워줌
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
		
		String sql = "insert into Member_Library values(?, ?, ?, ?, ?, ?)"; // 회원가입
		try {
		pst = conn.prepareStatement(sql);
		pst.setString(1, joinUser.getId());
		pst.setString(2, joinUser.getPw());
		pst.setString(3, joinUser.getName());
		pst.setString(4, joinUser.getAge());
		pst.setString(5, joinUser.getSex());
		pst.setString(6, joinUser.getPhone());
		
		row = pst.executeUpdate();
		}catch(Exception e){
			
		}finally {
			close();
		}
		return row;
	}


}
