package Model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Read_CSV {

	public ArrayList<ChartVO> getList(){
		
		ArrayList<ChartVO> list = new ArrayList<ChartVO>();
		
		File csv = new File("C:\\Users\\smhrd\\Desktop\\data");
		
		try {
			Scanner sc = new Scanner(csv);
			sc.nextLine();
			while(sc.hasNext() == true) {
				String line = sc.nextLine();
				String []value =line.split(","); 
				String id = value[0];
				String bookName = value[1];
				String age = value[2];
				String gender = value[3];
				String borrow_date = value[4];
				ChartVO vo = new ChartVO(id, bookName, age, gender, borrow_date);
				list.add(vo);
			
			}
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		return list;
		
	}
}
