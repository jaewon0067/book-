package View;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import Model.Member_LibraryVo;

import javax.swing.JScrollBar;
import java.awt.ScrollPane;
import java.awt.CardLayout;

public class snagrok {

	private JFrame frame;
	private JTextField search;

//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					snagrok window = new snagrok();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	public snagrok(Member_LibraryVo user) {
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


		String path = "../icon/theme.png";

		URL book_info1 = this.getClass().getResource(path);
		Image originImg = new ImageIcon(book_info1.getPath()).getImage();
		originImg = originImg.getScaledInstance(374, 561, Image.SCALE_SMOOTH);
		ImageIcon Icon = new ImageIcon(originImg);

		JPanel panel = new JPanel();
		panel.setBounds(23, 27, 326, 33);
		frame.getContentPane().add(panel);
		panel.setLayout(null);


     
		search = new JTextField();
		search.setBounds(0, 0, 255, 23);
		panel.add(search);
		search.setColumns(10);

		JButton btn_search = new JButton("\u261E");
		btn_search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String searchbook = search.getText();
				LibrarySearchGUI l = new LibrarySearchGUI(searchbook, user);
			}
		}); // 버튼눌러서 넘기기
		btn_search.setBounds(253, 0, 80, 23);
		panel.add(btn_search);


		JPanel panel_1 = new JPanel();
		panel_1.setBounds(23, 47, 326, 174);
		frame.getContentPane().add(panel_1);

		JPanel libinfo = new JPanel();
		libinfo.setBounds(23, 59, 326, 118);


		libinfo.setLayout(null);
		panel_1.setLayout(null);
		JLabel lib_info = new JLabel(new ImageIcon(snagrok.class.getResource("/icon/sangrok22.png")));
		lib_info.setBounds(-36, 0, 417, 174);
		panel_1.add(lib_info);


		JLabel lblNewLabel = new JLabel("Librarian's PICK");
		lblNewLabel.setFont(new Font("Ink Free", Font.BOLD, 22));
		lblNewLabel.setBounds(23, 216, 351, 33);
		frame.getContentPane().add(lblNewLabel);

		JPanel bookrecommend = new JPanel();
		bookrecommend.setBounds(22, 246, 331, 248);
		frame.getContentPane().add(bookrecommend);
		bookrecommend.setLayout(null);

		URL url = this.getClass().getResource("../icon/book1.PNG");

      // -----------------1할머니

		// <이미지 사이즈 수정하기>
		Image originImg2 = new ImageIcon(url.getPath()).getImage();
		originImg2 = originImg2.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		ImageIcon Icon2 = new ImageIcon(originImg2);
		JButton btnbook1 = new JButton(new ImageIcon(url.getPath()));
		btnbook1.setBounds(0, 0, 330, 81);
		btnbook1.setBorderPainted(false);
		btnbook1.setContentAreaFilled(false);
		btnbook1.setFocusPainted(false);
		btnbook1.setOpaque(false);
		btnbook1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				book1GUI book1gui = new book1GUI();
				frame.setVisible(true);
				book1gui.setNum(2);
			}
		});
		bookrecommend.setLayout(null);
		bookrecommend.add(btnbook1);
		// -----------------1할머니


      URL url4 = this.getClass().getResource("../icon/book2.PNG");
      JButton btnbook2 = new JButton(new ImageIcon(url4.getPath()));
      btnbook2.setBounds(0, 153, 330, 102);
      btnbook2.setBorderPainted(false);
      btnbook2.setContentAreaFilled(false);
      btnbook2.setFocusPainted(false);
      btnbook2.setOpaque(false);
      btnbook2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            book1GUI book1gui = new book1GUI();
            book1gui.setNum(8);
            frame.setVisible(true);


         }
      });
      bookrecommend.add(btnbook2);
      // ----------우리끼리 가자

      URL url1 = this.getClass().getResource("../icon/book3.PNG");
      JButton btnbook3 = new JButton(new ImageIcon(url1.getPath()));
      btnbook3.setBounds(0, 80, 315, 74);
      btnbook3.setBorderPainted(false);
      btnbook3.setContentAreaFilled(false);
      btnbook3.setFocusPainted(false);
      btnbook3.setOpaque(false);
      btnbook3.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            book1GUI book1gui = new book1GUI();
            book1gui.setNum(5);
            frame.setVisible(true);
         }
      });
      bookrecommend.add(btnbook3);
      // ---------형제들


		URL urlcha = this.getClass().getResource("../icon/book4.PNG");
		JButton btnbook4 = new JButton(new ImageIcon(urlcha.getPath()));
		btnbook4.setBounds(0, 186, 355, 57);
		btnbook4.setBorderPainted(false);
		btnbook4.setContentAreaFilled(false);
		btnbook4.setFocusPainted(false);
		btnbook4.setOpaque(false);
		btnbook4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				book1GUI book1gui = new book1GUI();
				frame.setVisible(true);
				book1gui.setNum(1);
			}
		});
		bookrecommend.add(btnbook4);

		JScrollPane scrollPane = new JScrollPane(bookrecommend);
		scrollPane.setBounds(23, 241, 337, 255);
		frame.getContentPane().add(scrollPane);


		Dimension size = new Dimension();// 사이즈를 지정하기 위한 객체 생성
		bookrecommend.setPreferredSize(size);
		size.setSize(300, 330);// 객체의 사이즈를 지정

		JLabel theme_label = new JLabel(Icon);
		theme_label.setBounds(0, 0, 374, 564);
		frame.getContentPane().add(theme_label);

		libinfo.setLayout(null);

	}
}