package View;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.text.SimpleDateFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import Model.Member_LibraryVo;
import Model.TableDAO;

public class LibraryWhat_i_Read {
	 private TableDAO dao = new TableDAO();
	private JFrame frame;
	 private JTable table;


	public LibraryWhat_i_Read(Member_LibraryVo user) {
		initialize(user);
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(Member_LibraryVo user) {
		frame = new JFrame();
		frame.setBounds(100, 100, 412, 638);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame = new JFrame();
		frame.setBounds(100, 100, 892, 638);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 882, 599);
		frame.getContentPane().add(panel);
		
		URL url__1 = this.getClass().getResource("../icon/back2.PNG");
		
		  SimpleDateFormat format1 = new SimpleDateFormat ("yyyy-MM-dd");
	      String today = format1.format(System.currentTimeMillis());
	      long retd = System.currentTimeMillis()+1296000000;
	      String returndate = format1.format(retd);
	      long gap = (retd-System.currentTimeMillis())/86400000;
				panel.setLayout(null);
				
				JPanel panel_3 = new JPanel();
				panel_3.setBounds(24, 111, 824, 414);
				panel.add(panel_3);
				panel_3.setLayout(new GridLayout(1, 0, 0, 0));
				
				JScrollPane scrollPane = new JScrollPane();
			      scrollPane.setBounds(0, 0, 357, 213);
			      String []title = {"반납 날짜", "책 제목", "소장 도서관"};
			      DefaultTableModel model_deli = new DefaultTableModel(title, 0);
			      model_deli = dao.DeliTable(user);
			      table = new JTable(model_deli);
			      scrollPane.setViewportView(table);
			      panel_3.add(scrollPane);
				
				JPanel panel_1 = new JPanel();
				panel_1.setBounds(24, 20, 824, 62);
				panel.add(panel_1);
				panel_1.setLayout(new GridLayout(1, 0, 0, 0));
				
				JLabel lblNewLabel_2 = new JLabel("\uB3C5\uC11C \uB0B4\uC5ED \uC0AC\uC9C4 \uB123\uC5B4\uC8FC\uC138\uC694");
				panel_1.add(lblNewLabel_2);
				
				JLabel lblNewLabel = new JLabel("\uC804\uCCB4 \uBAA9\uB85D");
				lblNewLabel.setFont(new Font("배달의민족 주아", Font.PLAIN, 18));
				lblNewLabel.setBounds(34, 86, 246, 25);
				panel.add(lblNewLabel);
				
				JPanel panel_4 = new JPanel();
				panel_4.setBounds(0, 537, 1222, 62);
				panel_4.setBackground(new Color(255, 0,0,0));
				panel_4.setOpaque(false);
				panel.add(panel_4);
				panel_4.setLayout(new GridLayout(0, 5, 0, 0));
				
				JButton 홈으로 = new JButton("");
				홈으로.setBorderPainted(false);
				홈으로.setContentAreaFilled(false);
				홈으로.setFocusPainted(false);
				홈으로.setOpaque(false);
				홈으로.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
				//		LibraryHomeGUI home = new LibraryHomeGUI(); //왜 에러뜨지?
					}
				});
				panel_4.add(홈으로);
				
				JButton 독서내역으로 = new JButton("");
				독서내역으로.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				독서내역으로.setBorderPainted(false);
				독서내역으로.setContentAreaFilled(false);
				독서내역으로.setFocusPainted(false);
				독서내역으로.setOpaque(false);
				panel_4.add(독서내역으로);
				
				JButton 북바구니로 = new JButton("");
				북바구니로.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				북바구니로.setBorderPainted(false);
				북바구니로.setContentAreaFilled(false);
				북바구니로.setFocusPainted(false);
				북바구니로.setOpaque(false);
				panel_4.add(북바구니로);
				
				JButton 마이페이지로 = new JButton("");
				마이페이지로.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					//	LibraryMyPage mypage = new LibraryMyPage();
					}
				});
				마이페이지로.setBorderPainted(false);
				마이페이지로.setContentAreaFilled(false);
				마이페이지로.setFocusPainted(false);
				마이페이지로.setOpaque(false);
				panel_4.add(마이페이지로);
				
				JButton btnNewButton_4 = new JButton("");
				btnNewButton_4.setBorderPainted(false);
				btnNewButton_4.setContentAreaFilled(false);
				btnNewButton_4.setFocusPainted(false);
				btnNewButton_4.setOpaque(false);
				panel_4.add(btnNewButton_4);
	}
}
