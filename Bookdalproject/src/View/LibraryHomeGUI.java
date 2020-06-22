package View;

import java.awt.EventQueue;

import javax.swing.JFrame;

import Controller.LibraryManagementSystem;
import Model.Member_LibraryVo;

import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JList;
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
	
	
	public LibraryHomeGUI(Member_LibraryVo user) {
		initialize(user);
		loginUser.setText(user.getName());
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 * @param user 
	 */
	private void initialize(Member_LibraryVo user) {
		frame = new JFrame();
		frame.setBounds(100, 100, 1093, 577);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btn_GoHome = new JButton("\uD648");
		btn_GoHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LibraryReturnHome returnHome = new LibraryReturnHome();
				frame.setVisible(false);
			}
		});
		btn_GoHome.setBounds(28, 480, 97, 23);
		frame.getContentPane().add(btn_GoHome);
		
		btn_WhatRead = new JButton("\uB3C5\uC11C\uB0B4\uC5ED");
		btn_WhatRead.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LibraryWhat_i_Read read = new LibraryWhat_i_Read();
			}
		});
		btn_WhatRead.setBounds(370, 480, 97, 23);
		frame.getContentPane().add(btn_WhatRead);
		
		btn_MyPage = new JButton("\uB9C8\uC774\uD398\uC774\uC9C0");
		btn_MyPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				LibraryMyPage myPage = new LibraryMyPage();
			}
		});
		btn_MyPage.setBounds(560, 480, 97, 23);
		frame.getContentPane().add(btn_MyPage);
		
		btn_Return = new JButton("\uBC18\uB0A9");
		btn_Return.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LibraryReturnBook returnBook = new LibraryReturnBook();
			}
		});
		btn_Return.setBounds(771, 480, 97, 23);
		frame.getContentPane().add(btn_Return);
		
		btn_Lib = new JButton("\uB3C4\uC11C\uAD001");
		btn_Lib.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_Lib.setBounds(133, 348, 97, 23);
		frame.getContentPane().add(btn_Lib);
		
		btn_Lib_1 = new JButton("\uB3C4\uC11C\uAD002");
		btn_Lib_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_Lib_1.setBounds(415, 348, 97, 23);
		frame.getContentPane().add(btn_Lib_1);
		
		btn_Lib_2 = new JButton("\uB3C4\uC11C\uAD003");
		btn_Lib_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_Lib_2.setBounds(646, 348, 97, 23);
		frame.getContentPane().add(btn_Lib_2);
		
		btn_BuyThis = new JButton("\uC7A5\uBC14\uAD6C\uB2C8");
		btn_BuyThis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_BuyThis.setBounds(944, 48, 97, 23);
		frame.getContentPane().add(btn_BuyThis);
		
		table = new JTable();
		table.setBounds(107, 48, 699, 255);
		frame.getContentPane().add(table);
		
		loginUser = new JLabel("New label");
		loginUser.setBounds(68, 10, 57, 15);
		frame.getContentPane().add(loginUser);
		
		lblNewLabel_1 = new JLabel("\uB2D8 \uD658\uC601\uD569\uB2C8\uB2E4");
		lblNewLabel_1.setBounds(129, 10, 57, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
	}
}
