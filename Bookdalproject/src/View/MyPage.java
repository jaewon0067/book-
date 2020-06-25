package View;

import java.awt.EventQueue;
import Model.Member_LibraryDAO;
import Model.Member_LibraryVo;
import Model.TableDAO;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;

import Controller.LibraryManagementSystem;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import java.awt.GridLayout;
import javax.swing.JButton;

public class MyPage{
	
	
	
	private JFrame frame;
	public static LibraryManagementSystem controller = new LibraryManagementSystem();
	private JLabel lbl_address;
	private JLabel lbl_phone;
	private JLabel lbl_gender;
	private JLabel lbl_age;
	private JLabel lbl_name;
	private JTable put_table;
	private JTable table;
	private TableDAO dao = new TableDAO();
	
	
	public MyPage(Member_LibraryVo user) {
		initialize(user);
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(Member_LibraryVo user) {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 388, 600);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		String path = "../icon/mypageback.PNG";

		URL back = this.getClass().getResource(path);
		Image originImg = new ImageIcon(back.getPath()).getImage();
		originImg = originImg.getScaledInstance(374, 561, Image.SCALE_SMOOTH);
		ImageIcon Icon = new ImageIcon(originImg);
		
		lbl_name = new JLabel("New label");
		lbl_name.setBounds(203, 84, 57, 15);
		frame.getContentPane().add(lbl_name);
		lbl_name.setText(user.getName());
		
		lbl_age = new JLabel("New label");
		lbl_age.setBounds(192, 109, 57, 15);
		frame.getContentPane().add(lbl_age);
		lbl_age.setText(user.getAge());
		
		lbl_gender = new JLabel("New label");
		lbl_gender.setBounds(214, 134, 57, 15);
		frame.getContentPane().add(lbl_gender);
		lbl_gender.setText(user.getGender());
		
		lbl_phone = new JLabel("New label");
		lbl_phone.setBounds(203, 160, 57, 15);
		frame.getContentPane().add(lbl_phone);
		lbl_phone.setText(user.getPhone());
		
		lbl_address = new JLabel("New label");
		lbl_address.setBounds(224, 185, 57, 15);
		frame.getContentPane().add(lbl_address);
		lbl_address.setText(user.getAddr());
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 504, 372, 57);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(0, 5, 0, 0));

		URL home_1 = this.getClass().getResource("../icon/hohome.PNG");
		JButton home = new JButton(new ImageIcon(home_1.getPath()));
		home.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(home);

		URL list_1 = this.getClass().getResource("../icon/list.PNG");
		JButton list = new JButton(new ImageIcon(list_1.getPath()));
		list.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(list);

		URL cart_1 = this.getClass().getResource("../icon/cart.PNG");
		JButton cart = new JButton(new ImageIcon(cart_1.getPath()));
		cart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		panel.add(cart);

		URL mypage_1 = this.getClass().getResource("../icon/mypage.PNG");
		JButton mypage = new JButton(new ImageIcon(mypage_1.getPath()));
		mypage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(mypage);

		URL delivery_1 = this.getClass().getResource("../icon/de.PNG");
		JButton delivery = new JButton(new ImageIcon(delivery_1.getPath()));
		delivery.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(delivery);

		JLabel back_label = new JLabel(Icon);
		back_label.setBounds(0, 0, 374, 564);
		frame.getContentPane().add(back_label);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(30, 244, 315, 195);
		frame.getContentPane().add(panel_1);
		
//	put_table = new JTable();
//		put_table=dao.getTable(user);
//		panel_1.add(table);
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
