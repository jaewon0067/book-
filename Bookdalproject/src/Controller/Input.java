package Controller;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Input {
	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;

	private void getConnection() {
		// 1. JDBC ����̹� �����ε�
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";
			// 2. DB����
			conn = DriverManager.getConnection(url, user, password);
			// db�� ���� ���ܴ� sql exception���� �� �����ϴ�. try catch�� ������ �װ� ���Ұ�.
		} catch (ClassNotFoundException e) {
			// �ش�Ǵ� ���ܰ� �߻��ϸ� �����.
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	 private void close() {
		 //6.DB��������
	  	 try {
	  		if(rs != null) { //null�϶� �ݾ��ָ� nullpoint exception error �߻�
	  			rs.close();
	  		}
	  		if(pst != null) {
	  			//������ ��� �Ǿ�������...
	  			pst.close();
	  		}if(conn != null) {
	  			conn.close();
	  		}
	  	 }catch (SQLException e) {
	           e.printStackTrace();
	       } 
	   }
//	 public ArrayList<BookVO> getList(){
//			//������ ������ ��Ʈ�� �ݿ� �޼ҵ带 ����, vo�� ���͵��� ��Ʈ�� �ֱ�
//			
//			ArrayList<BookVO> list = new ArrayList<BookVO>();
//			
//			//1.������ ������ ������ �ִ� ��ü ����(��ġ)
//			File csv = new File ("C:\\Users\\smhrd\\Desktop\\���ֱ�����_����_����_20190906.csv");
//			//2.������ �о���̴� Input ��Ʈ�� ��ü ����
//			
//			try {
//				Scanner sc = new Scanner(csv);
//				sc.nextLine();
//				while(sc.hasNext()) {
//				String line = sc.nextLine();
//				//�������� ���ڿ��� �߶󳻼���.
//				//�Ǽ� 11112 1~4
//				String[] value = line.split(",");
//				String book_index  = value[0];
//				String lib_location = value[1];
//				String status = value[2];
//				String restriction = value[3];
//				String book_id = value[4];
//				String book_name = value[5];
//				String author = value[6];
//				String publisher = value[7];
//				String publishedin = value[8];
//				String published_place = value[9];
//				String original = value[10];
//				String price = value[11];
//				String sidebook = value[12];
//				System.out.println(value[11]);
//				
//				BookVO vo = new BookVO(book_index, lib_location, status, restriction, book_id, book_name, author, publisher, publishedin, published_place, original, price, sidebook);
//				list.add(vo);
//				}
//			} catch (FileNotFoundException e) {
//				e.printStackTrace();
//			}
//			return list;
	}

