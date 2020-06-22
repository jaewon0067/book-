package View;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;

import javax.swing.JFrame;

import Controller.LibraryManagementSystem;
import Model.Member_LibraryVo;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JScrollBar;

public class LibraryHomeGUI {

	private JFrame frame;


	private JButton btn_GoHome;
	private JButton btn_WhatRead;
	private JButton btn_MyPage;
	private JButton btn_Return;
	private JButton btn_Lib;
	private JButton btn_Lib_1;
	private JButton btn_Lib_2;
	private JButton btn_BuyThis;
	private JTable table;
	
	public static LibraryManagementSystem controller = new LibraryManagementSystem();
	private JLabel lbl_forName;
	private JLabel loginUser;
	private JLabel lblNewLabel_1;
	private JPanel panel_1;
	
	
	public LibraryHomeGUI(Member_LibraryVo user) {
		initialize(user);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(12, 10, 358, 61);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		lblNewLabel_1 = new JLabel("\uB2D8 \uD658\uC601\uD569\uB2C8\uB2E4");
		lblNewLabel_1.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		lblNewLabel_1.setBounds(198, 11, 148, 30);
		panel.add(lblNewLabel_1);
		loginUser.setText(user.getName());
		
		loginUser = new JLabel("New label");
		loginUser.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 15));
		loginUser.setBounds(114, 10, 78, 36);
		panel.add(loginUser);
		
		String path5 = "C:\\Users\\smhrd\\Desktop\\user2.png";
		Image image5 = new ImageIcon(path5).getImage();
		

		
		panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.scrollbar);
		panel_1.setBounds(0, 404, 382, 70);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		String path = "C:\\Users\\smhrd\\Desktop\\home.png";
		Image image = new ImageIcon(path).getImage();
		
		
		btn_GoHome = new JButton(new ImageIcon(image.getScaledInstance(30, 30, image.SCALE_SMOOTH)));
		btn_GoHome.setText("\uD648");
		btn_GoHome.setBounds(12, 10, 61, 50);
		panel_1.add(btn_GoHome);
		
		String path2 = "C:\\Users\\smhrd\\Desktop\\list.png";
		Image image2 = new ImageIcon(path2).getImage();
		
		btn_WhatRead = new JButton(new ImageIcon(image2.getScaledInstance(30, 30, image2.SCALE_SMOOTH)));
		btn_WhatRead.setText("\uBC30\uC1A1\uC815\uBCF4");
		btn_WhatRead.setBounds(172, 10, 54, 50);
		panel_1.add(btn_WhatRead);
		
		String path3 = "C:\\Users\\smhrd\\Desktop\\user1.png";
		Image image3 = new ImageIcon(path3).getImage();
		
		btn_MyPage = new JButton(new ImageIcon(image3.getScaledInstance(30, 30, image3.SCALE_SMOOTH)));
		btn_MyPage.setText("\uB9C8\uC774\uD398\uC774\uC9C0");
		btn_MyPage.setBounds(244, 10, 61, 50);
		panel_1.add(btn_MyPage);
		
		String path4 = "C:\\Users\\smhrd\\Desktop\\shipping-and-delivery.png";
		Image image4 = new ImageIcon(path4).getImage();
		
		btn_Return = new JButton(new ImageIcon(image4.getScaledInstance(30, 30, image4.SCALE_SMOOTH)));
		btn_Return.setText("\uBC18\uB0A9");
		btn_Return.setBounds(314, 10, 54, 50);
		panel_1.add(btn_Return);
	
		String path1 = "C:\\Users\\smhrd\\Desktop\\cart.png";
		Image image1 = new ImageIcon(path1).getImage();
		
		JButton btn_bookbasket = new JButton(new ImageIcon(image1.getScaledInstance(30, 30, image1.SCALE_SMOOTH)));
		btn_bookbasket.setText("\uBD81\uBC14\uAD6C\uB2C8");
		btn_bookbasket.setBounds(93, 10, 54, 50);
		panel_1.add(btn_bookbasket);
		btn_Return.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_MyPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LibraryMyPage myPage = new LibraryMyPage();
			}
		});
		btn_WhatRead.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_GoHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 * @param user 
	 */
	private void initialize(Member_LibraryVo user) {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 398, 513);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btn_Lib = new JButton("\uB098\uBB34\uB3C4\uC11C\uAD00");
		btn_Lib.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_Lib.setBounds(27, 282, 97, 89);
		frame.getContentPane().add(btn_Lib);
		
		btn_Lib_1 = new JButton("\uAC00\uC871\uB3C4\uC11C\uAD00");
		btn_Lib_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_Lib_1.setBounds(136, 282, 97, 89);
		frame.getContentPane().add(btn_Lib_1);
		
		btn_Lib_2 = new JButton("\uC218\uC9C0\uB3C4\uC11C\uAD00");
		btn_Lib_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_Lib_2.setBounds(245, 282, 104, 89);
		frame.getContentPane().add(btn_Lib_2);
		
		btn_BuyThis = new JButton("\uC7A5\uBC14\uAD6C\uB2C8");
		btn_BuyThis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_BuyThis.setBounds(944, 48, 97, 23);
		frame.getContentPane().add(btn_BuyThis);
		
		table = new JTable();
		table.setBounds(31, 118, 318, 140);
		frame.getContentPane().add(table);
		
	
		
		
	}
}

