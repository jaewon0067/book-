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
		// 1. JDBC 드라이버 동적로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";
			// 2. DB연결
			conn = DriverManager.getConnection(url, user, password);
			// db에 대한 예외는 sql exception으로 다 가능하다. try catch도 되지만 그게 편할걸.
		} catch (ClassNotFoundException e) {
			// 해당되는 예외가 발생하면 잡아줌.
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	 private void close() {
		 //6.DB연결종료
	  	 try {
	  		if(rs != null) { //null일때 닫아주면 nullpoint exception error 발생
	  			rs.close();
	  		}
	  		if(pst != null) {
	  			//연결이 계속 되어있으면...
	  			pst.close();
	  		}if(conn != null) {
	  			conn.close();
	  		}
	  	 }catch (SQLException e) {
	           e.printStackTrace();
	       } 
	   }
//	 public ArrayList<BookVO> getList(){
//			//각행의 정보를 차트에 반영 메소드를 만들어서, vo에 담긴것들을 차트에 넣기
//			
//			ArrayList<BookVO> list = new ArrayList<BookVO>();
//			
//			//1.파일의 정보를 가지고 있는 객체 생성(위치)
//			File csv = new File ("C:\\Users\\smhrd\\Desktop\\광주광역시_서구_도서_20190906.csv");
//			//2.파일을 읽어들이는 Input 스트링 객체 생성
//			
//			try {
//				Scanner sc = new Scanner(csv);
//				sc.nextLine();
//				while(sc.hasNext()) {
//				String line = sc.nextLine();
//				//기준으로 문자열을 잘라내세요.
//				//건설 11112 1~4
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

