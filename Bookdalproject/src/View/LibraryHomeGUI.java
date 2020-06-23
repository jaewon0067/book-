package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.print.DocFlavor.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import Controller.LibraryManagementSystem;
import Model.Member_LibraryVo;
<<<<<<< HEAD
import java.awt.GridLayout;
=======
import Model.TableDAO;
import Model.TableVo;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JSeparator;
>>>>>>> branch 'master' of https://github.com/jaewon0067/book-.git

public class LibraryHomeGUI {

	private JFrame frame;
	private JButton btn_Lib;
<<<<<<< HEAD
	private JButton btn_BuyThis;
=======
	private JButton btn_Lib_1;
	private JButton btn_Lib_2;
>>>>>>> branch 'master' of https://github.com/jaewon0067/book-.git
	private JTable table;

	public static LibraryManagementSystem controller = new LibraryManagementSystem();
	private JLabel lbl_forName;
	private JLabel loginUser;
	private JLabel lblNewLabel_1;
	private JSeparator separator;
<<<<<<< HEAD
	private JLabel lblNewLabel_2;
	private JSeparator separator_2;
	private JLabel lblNewLabel_3;
	private JLabel back;
	private JButton btnNewButton;
	private JPanel panel_2;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JLabel back_1;
	private JButton btn_1;
	private JButton btn_2;
	private JButton btn_3;
	private JButton btn_4;
	private JButton btn_5;

=======
	private JSeparator separator_1;
	private JButton btnNewButton;
	private JPanel panel_2;
	
	
>>>>>>> branch 'master' of https://github.com/jaewon0067/book-.git
	public LibraryHomeGUI(Member_LibraryVo user) {
		initialize(user);

		JPanel panel = new JPanel();
<<<<<<< HEAD
		panel.setBackground(new Color(245, 245, 245));
		panel.setBounds(29, 26, 314, 57);
=======
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(24, 10, 358, 61);
>>>>>>> branch 'master' of https://github.com/jaewon0067/book-.git
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		lblNewLabel_1 = new JLabel("\uB2D8 \uD658\uC601\uD569\uB2C8\uB2E4");
		lblNewLabel_1.setFont(new Font("HY중고딕", Font.BOLD, 20));
		lblNewLabel_1.setBounds(136, 11, 148, 30);
		panel.add(lblNewLabel_1);
<<<<<<< HEAD
		loginUser.setText(user.getName());

		loginUser = new JLabel("\uAE30\uAD00\uCC28");
		loginUser.setFont(new Font("함초롬돋움", Font.BOLD, 16));
		loginUser.setBounds(78, 8, 55, 36);
=======
		
		
		loginUser = new JLabel("New label");
		loginUser.setText(user.getName());
		loginUser.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		loginUser.setBounds(114, 10, 78, 36);
>>>>>>> branch 'master' of https://github.com/jaewon0067/book-.git
		panel.add(loginUser);
<<<<<<< HEAD

		String path6 = "C:\\Users\\smhrd\\Desktop\\icon\\hello.png";
		Image image6 = new ImageIcon(path6).getImage();

		JLabel lblNewLabel = new JLabel(new ImageIcon(image6.getScaledInstance(50, 50, image6.SCALE_SMOOTH)));
		lblNewLabel.setBounds(0, 0, 66, 61);
		panel.add(lblNewLabel);

		String path5 = "C:\\Users\\smhrd\\Desktop\\icon\\user2.png";
=======
		
		btnNewButton = new JButton("\uB300\uCD9C\uBAA9\uB85D \uBCF4\uB294 \uBC84\uD2BC\u3147");
		btnNewButton.setBounds(5, 19, 97, 23);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TableDAO dao = new TableDAO();
				JTable table = dao.getTable();
			
				System.out.println(table.getRowCount());
				panel_2.add(new JScrollPane(table));
				frame.getContentPane().add(panel_2);
				frame.setVisible(true);
			}
		});
		
		String path5 = "C:\\Users\\smhrd\\Desktop\\user2.png";
>>>>>>> branch 'master' of https://github.com/jaewon0067/book-.git
		Image image5 = new ImageIcon(path5).getImage();

		String path = "C:\\Users\\smhrd\\Desktop\\icon\\home.png";
		Image image = new ImageIcon(path).getImage();

		String path2 = "C:\\Users\\smhrd\\Desktop\\icon\\checklist.png";
		Image image2 = new ImageIcon(path2).getImage();

		String path3 = "C:\\Users\\smhrd\\Desktop\\icon\\user1.png";
		Image image3 = new ImageIcon(path3).getImage();

		String path4 = "C:\\Users\\smhrd\\Desktop\\icon\\shipping-and-delivery.png";
		Image image4 = new ImageIcon(path4).getImage();

		String path1 = "C:\\Users\\smhrd\\Desktop\\icon\\cart.png";
		Image image1 = new ImageIcon(path1).getImage();
<<<<<<< HEAD

=======
		
		JButton btn_bookbasket = new JButton(new ImageIcon(image1.getScaledInstance(30, 30, image1.SCALE_SMOOTH)));
		btn_bookbasket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LibraryBookBasket bookbasket = new LibraryBookBasket();
			}
		});
		btn_bookbasket.setBounds(93, 10, 54, 50);
		panel_1.add(btn_bookbasket);
		
		separator_1 = new JSeparator();
		separator_1.setBackground(new Color(153, 153, 153));
		separator_1.setBounds(12, 0, 358, 2);
		panel_1.add(separator_1);
		
>>>>>>> branch 'master' of https://github.com/jaewon0067/book-.git
		separator = new JSeparator();
		separator.setBackground(UIManager.getColor("Button.light"));
		separator.setBounds(29, 115, 314, 1);
		frame.getContentPane().add(separator);
<<<<<<< HEAD


		lblNewLabel_2 = new JLabel("\uB300\uCD9C\uBAA9\uB85D");
		lblNewLabel_2.setFont(new Font("HY목각파임B", Font.BOLD, 15));
		lblNewLabel_2.setBounds(29, 82, 88, 23);
		frame.getContentPane().add(lblNewLabel_2);

		separator_2 = new JSeparator();
		separator_2.setBackground(SystemColor.controlHighlight);
		separator_2.setBounds(28, 371, 334, -3);
		frame.getContentPane().add(separator_2);

		lblNewLabel_3 = new JLabel("\uB098\uC758 \uB3C4\uC11C\uAD00");
		lblNewLabel_3.setFont(new Font("HY헤드라인M", Font.BOLD, 15));
		lblNewLabel_3.setBounds(29, 333, 88, 23);
		frame.getContentPane().add(lblNewLabel_3);

		String path8 = "C:\\Users\\smhrd\\Desktop\\icon\\배애경.PNG";
		Image image8 = new ImageIcon(path8).getImage();

		back = new JLabel(new ImageIcon(image8.getScaledInstance(374, 499, image8.SCALE_SMOOTH)));
		back.setBounds(0, 0, 374, 499);
		frame.getContentPane().add(back);
		

		String path7 = "C:\\Users\\smhrd\\Desktop\\icon\\1.PNG";
		Image image7 = new ImageIcon(path7).getImage();
		
		back_1 = new JLabel(new ImageIcon(image7.getScaledInstance(374, 64, image7.SCALE_SMOOTH)));
		back_1.setBounds(0, 497, 374, 64);
		frame.getContentPane().add(back_1);

	
=======
		
		panel_2 = new JPanel();
		panel_2.setBounds(27, 105, 536, 179);
		frame.getContentPane().add(panel_2);
		
		
		btn_Return.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LibraryReturnBook goBook = new LibraryReturnBook();
			}
		});
		btn_MyPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LibraryMyPage myPage = new LibraryMyPage();
			}
		});
		btn_WhatRead.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LibraryWhat_i_Read WhatRead = new LibraryWhat_i_Read();
			}
		});
		btn_GoHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LibraryReturnHome goHome = new LibraryReturnHome();
				
			}
		});
		frame.setVisible(true);
>>>>>>> branch 'master' of https://github.com/jaewon0067/book-.git
	}

	/**
	 * Initialize the contents of the frame.
	 * 
	 * @param user
	 */
	private void initialize(Member_LibraryVo user) {

		frame = new JFrame();
		frame.setBackground(new Color(230, 230, 250));
		frame.getContentPane().setBackground(new Color(255, 255, 255));
<<<<<<< HEAD
		frame.setBounds(100, 100, 390, 600);
=======

		frame.setBounds(100, 100, 644, 513);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		frame.setBounds(100, 100, 401, 516);
>>>>>>> branch 'master' of https://github.com/jaewon0067/book-.git
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().setLayout(null);

		String path8 = "C:\\Users\\smhrd\\Desktop\\icon\\library.png";
		Image image8 = new ImageIcon(path8).getImage();
		
<<<<<<< HEAD
		btn_5 = new JButton("");
		btn_5.setIcon(new ImageIcon("C:\\Users\\smhrd\\Desktop\\icon\\\uBC18\uB0A9.PNG"));
		btn_5.setBounds(308, 504, 54, 47);
		frame.getContentPane().add(btn_5);
		
		btn_4 = new JButton("");
		btn_4.setIcon(new ImageIcon("C:\\Users\\smhrd\\Desktop\\icon\\\uB9C8\uC774\uD398\uC774\uC9C0.PNG"));
		btn_4.setBounds(234, 504, 62, 57);
		frame.getContentPane().add(btn_4);
		
		btn_2 = new JButton("");
		btn_2.setIcon(new ImageIcon("C:\\Users\\smhrd\\Desktop\\icon\\\uBC30\uC1A1\uC815\uBCF4.PNG"));
		btn_2.setBounds(85, 504, 54, 47);
		frame.getContentPane().add(btn_2);
		
		btn_3 = new JButton("");
		btn_3.setIcon(new ImageIcon("C:\\Users\\smhrd\\Desktop\\icon\\\uBD81\uBC14\uAD6C\uB2C8.PNG"));
		btn_3.setBounds(155, 504, 54, 47);
		frame.getContentPane().add(btn_3);
		
		btn_1 = new JButton("");
		btn_1.setIcon(new ImageIcon("C:\\Users\\smhrd\\Desktop\\icon\\\uD648.PNG"));
		btn_1.setBounds(10, 504, 54, 47);
		frame.getContentPane().add(btn_1);
		
		panel_2 = new JPanel();
		panel_2.setBounds(39, 371, 271, 70);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(new GridLayout(0, 3, 10, 0));
		
	
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\smhrd\\Desktop\\icon\\\uB3C4\uC11C\uAD001.PNG"));
		
	//	btnNewButton_1 = new JButton(new ImageIcon(url__1.getPath()));
		//btnNewButton_1.setBorderPainted(false);
		//btnNewButton_1.setFocusPainted(false);
	//	btnNewButton_1.setContentAreaFilled(false);
	//	btnNewButton_1.setOpaque(false);
	      
		btnNewButton_1.addActionListener(new ActionListener() {
=======
		btn_Lib = new JButton("\uC0C1\uB85D\uB3C4\uC11C\uAD00");
		btn_Lib.addActionListener(new ActionListener() {
>>>>>>> branch 'master' of https://github.com/jaewon0067/book-.git
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_2.add(btnNewButton_1);
		
<<<<<<< HEAD
		btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
=======
		btn_Lib_1 = new JButton("\uC0DD\uD0DC\uB3C4\uC11C\uAD00");
		btn_Lib_1.addActionListener(new ActionListener() {
>>>>>>> branch 'master' of https://github.com/jaewon0067/book-.git
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\smhrd\\Desktop\\icon\\\uB3C4\uC11C\uAD002.PNG"));
		panel_2.add(btnNewButton_2);
		
<<<<<<< HEAD
		btnNewButton_3 = new JButton("");
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\smhrd\\Desktop\\icon\\\uB3C4\uC11C\uAD003.PNG"));
		panel_2.add(btnNewButton_3);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(SystemColor.controlHighlight);
		separator_1.setBounds(29, 355, 314, 1);
		frame.getContentPane().add(separator_1);

		btn_BuyThis = new JButton("\uC7A5\uBC14\uAD6C\uB2C8");
		btn_BuyThis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_BuyThis.setBounds(944, 48, 97, 23);
		frame.getContentPane().add(btn_BuyThis);

=======
		btn_Lib_2 = new JButton("\uC218\uC9C0\uB3C4\uC11C\uAD00");
		btn_Lib_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_Lib_2.setBounds(245, 294, 104, 77);
		frame.getContentPane().add(btn_Lib_2);
		

		
>>>>>>> branch 'master' of https://github.com/jaewon0067/book-.git
		table = new JTable();
		table.setBackground(SystemColor.controlLtHighlight);
		table.setBounds(29, 124, 295, 199);
		frame.getContentPane().add(table);
<<<<<<< HEAD

=======

		
	
		
		
>>>>>>> branch 'master' of https://github.com/jaewon0067/book-.git
	}
}
