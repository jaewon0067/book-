package Model;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JLabel;

public class Testmain {

	public static void main(String[] args) {
		SimpleDateFormat format1 = new SimpleDateFormat ("yyyy-MM-dd");
		String today = format1.format(System.currentTimeMillis());
		long retd = System.currentTimeMillis()+1296000000;
		String returndate = format1.format(retd);
		System.out.println(returndate);
		System.out.println(today);
		long gap = (retd-System.currentTimeMillis())/86400000;
		System.out.println(gap);
	}

}
