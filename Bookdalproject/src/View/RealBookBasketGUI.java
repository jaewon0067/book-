package View;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.text.SimpleDateFormat;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import java.awt.FlowLayout;

public class RealBookBasketGUI {

	private JFrame frame;

	public RealBookBasketGUI() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 412, 638);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame = new JFrame();
		frame.setBounds(100, 100, 412, 638);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 394, 599);
		frame.getContentPane().add(panel);
		
		URL url__1 = this.getClass().getResource("../icon/back2.PNG");
		
		  SimpleDateFormat format1 = new SimpleDateFormat ("yyyy-MM-dd");
	      String today = format1.format(System.currentTimeMillis());
	      long retd = System.currentTimeMillis()+1296000000;
	      String returndate = format1.format(retd);
	      long gap = (retd-System.currentTimeMillis())/86400000;
				panel.setLayout(null);
				
				JPanel panel_1 = new JPanel();
				panel_1.setBounds(24, 20, 347, 62);
				panel.add(panel_1);
				panel_1.setLayout(new GridLayout(1, 0, 0, 0));
				
				JLabel lblNewLabel_2 = new JLabel("\uBD81\uBC14\uAD6C\uB2C8 \uC0AC\uC9C4 \uB123\uC5B4\uC8FC\uC138\uC694");
				panel_1.add(lblNewLabel_2);
				
				JButton btnNewButton_5 = new JButton("(\uBC30\uB2EC\uBE44 2000\uC6D0) \uB300\uCD9C\uD558\uAE30");
				btnNewButton_5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						//�Ϲٱ��� DB���� BookcartbookVO ��ü�� �޾ƿ��� ����.
						//�װ��� userid�� ���� ���� �α��� ���̵��ΰ� ã�Ƽ� �˻� ���� ��(������) DeliDB���ٰ� �߰��ؼ� �־��ִ� ����
						//�׸����� �Ϲٱ���DB������ ����. -���Կ����װŶ� ����ϳ� 
						//Deli_info�� (ordernumber, userID, book_name, addr ,age, gender, charge, nowlocation, returnday, lib_name, borrowdate)
						//BookcartbookVO(String member_ID, String member_Name, String book_Name, String book_ID, String author,
						//String publisher, String library, String status)
					}
				});
				btnNewButton_5.setFont(new Font("����ǹ��� �־�", Font.PLAIN, 14));
				btnNewButton_5.setBounds(98, 470, 191, 47);
				panel.add(btnNewButton_5);
				
				JPanel panel_2 = new JPanel();
				panel_2.setBounds(24, 415, 347, 45);
				panel.add(panel_2);
				panel_2.setLayout(new GridLayout(1, 0, 0, 0));
				
				JLabel lblNewLabel_1 = new JLabel("= \uCD1D ?????\uAD8C \uB300\uCD9C");
				lblNewLabel_1.setFont(new Font("����ǹ��� �־�", Font.PLAIN, 20));
				lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
				panel_2.add(lblNewLabel_1);
				

				JPanel sangrokbasket = new JPanel();
				sangrokbasket.setBounds(22, 113, 345, 295);
				frame.getContentPane().add(sangrokbasket);
				sangrokbasket.setLayout(null);
				
				JScrollPane scrollPane = new JScrollPane(sangrokbasket);
				scrollPane.setBounds(24, 113, 347, 300);
				frame.getContentPane().add(scrollPane);
				
				JLabel lblNewLabel = new JLabel("\uC0C1\uB85D\uB3C4\uC11C\uAD00");
				lblNewLabel.setFont(new Font("����ǹ��� �־�", Font.PLAIN, 18));
				lblNewLabel.setBounds(34, 86, 246, 25);
				panel.add(lblNewLabel);
				
				JPanel panel_4 = new JPanel();
				panel_4.setBounds(0, 537, 394, 62);
				panel_4.setBackground(new Color(255, 0,0,0));
				panel_4.setOpaque(false);
				panel.add(panel_4);
				panel_4.setLayout(new GridLayout(0, 5, 0, 0));
				
				JButton Ȩ���� = new JButton("");
				Ȩ����.setBorderPainted(false);
				Ȩ����.setContentAreaFilled(false);
				Ȩ����.setFocusPainted(false);
				Ȩ����.setOpaque(false);
				Ȩ����.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
				//		LibraryHomeGUI home = new LibraryHomeGUI(); //�� ��������?
					}
				});
				panel_4.add(Ȩ����);
				
				JButton ������������ = new JButton("");
				������������.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				������������.setBorderPainted(false);
				������������.setContentAreaFilled(false);
				������������.setFocusPainted(false);
				������������.setOpaque(false);
				panel_4.add(������������);
				
				JButton �Ϲٱ��Ϸ� = new JButton("");
				�Ϲٱ��Ϸ�.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				�Ϲٱ��Ϸ�.setBorderPainted(false);
				�Ϲٱ��Ϸ�.setContentAreaFilled(false);
				�Ϲٱ��Ϸ�.setFocusPainted(false);
				�Ϲٱ��Ϸ�.setOpaque(false);
				panel_4.add(�Ϲٱ��Ϸ�);
				
				JButton ������������ = new JButton("");
				������������.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					//	LibraryMyPage mypage = new LibraryMyPage();
					}
				});
				������������.setBorderPainted(false);
				������������.setContentAreaFilled(false);
				������������.setFocusPainted(false);
				������������.setOpaque(false);
				panel_4.add(������������);
				
				JButton btnNewButton_4 = new JButton("");
				btnNewButton_4.setBorderPainted(false);
				btnNewButton_4.setContentAreaFilled(false);
				btnNewButton_4.setFocusPainted(false);
				btnNewButton_4.setOpaque(false);
				panel_4.add(btnNewButton_4);
		
				JLabel back = new JLabel(new ImageIcon(url__1.getPath()));
				back.setBounds(0, 0, 394, 593);
				panel.add(back);
	}
}
