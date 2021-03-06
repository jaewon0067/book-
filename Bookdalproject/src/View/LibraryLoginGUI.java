package View;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Controller.LibraryManagementSystem;
import Model.Member_LibraryDAO;
import Model.Member_LibraryVo;

public class LibraryLoginGUI {
	private JFrame frame; // 현재 창을 나타내는 객체
	private JButton btn_Login;

	private JButton btn_cancel;

	public static LibraryManagementSystem controller = new LibraryManagementSystem();
	private JLabel lblNewLabel;
	private JLabel bookmoon_label;
	private JLabel bookdal_label;
	private JPanel panel_1;
	private JTextField Input_id;
	private JPasswordField Input_pw;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibraryLoginGUI window = new LibraryLoginGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LibraryLoginGUI() {
		initialize();

	}

	/**
	 * Initialize the contents of the frame.
	 */

	private void initialize() {

		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 389, 621);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		// <이미지 사이즈 수정하기>

//		URL cover = this.getClass().getResource("C:\\Users\\smhrd\\Desktop\\icon\\bookContent.png");
//		Image originImg = new ImageIcon(cover.getPath()).getImage();
//		originImg = originImg.getScaledInstance(300, 250, Image.SCALE_SMOOTH);
//		ImageIcon Icon = new ImageIcon(originImg);
//
//		// <이미지 사이즈 수정하기>
//		URL bookdal = this.getClass().getResource("../icon/bookdal.png");
//
//		Image originImg2 = new ImageIcon(bookdal.getPath()).getImage();
//
//		originImg2 = originImg2.getScaledInstance(90,80, Image.SCALE_SMOOTH);
//
//		ImageIcon Icon2 = new ImageIcon(originImg2);

		panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(0, 0, 374, 581);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		Input_pw = new JPasswordField();
		Input_pw.setBounds(65, 451, 219, 31);
		panel_1.add(Input_pw);

		Input_id = new JTextField();
		Input_id.setBounds(65, 391, 219, 31);
		panel_1.add(Input_id);
		Input_id.setColumns(10);

		JButton btn_Join = new JButton("Join");
		btn_Join.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LibraryJoinGUI JOIN = new LibraryJoinGUI();

			}
		});
		btn_Join.setFont(new Font("Dialog", Font.BOLD, 15));
		btn_Join.setBackground(new Color(222, 184, 135));
		btn_Join.setBounds(187, 501, 97, 31);
		panel_1.add(btn_Join);

		btn_Login = new JButton("Login");
		btn_Login.setBounds(64, 501, 97, 31);
		panel_1.add(btn_Login);
		btn_Login.setFont(new Font("Dialog", Font.BOLD, 15));
		btn_Login.setBackground(new Color(222, 184, 135));
		btn_Login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// 확인버튼 클릭
				// 1. id와 pw를 컴포넌트에서 꺼내오기
				// 2. DB에서 해당 id,pw를 조회하기
				String id = Input_id.getText();
				String pw = String.valueOf(Input_pw.getPassword());
				System.out.println(id);
				System.out.println(pw);
				Member_LibraryVo user = new Member_LibraryVo(id, pw);
				Member_LibraryVo loginUSer = controller.login(user);

				if (loginUSer != null) {
					System.out.println("로그인 성공");
					JOptionPane.showMessageDialog(frame, "환영합니다.");

					// LibraryMainGUI maingui = new LibraryMainGUI();
					LibraryHomeGUI homeGUI = new LibraryHomeGUI(loginUSer);

					frame.setVisible(false); // 로그인 성공 시 창 닫음

				} else {
					System.out.println("로그인 실패");
					JOptionPane.showMessageDialog(frame, "로그인 실패", "Inane error", JOptionPane.ERROR_MESSAGE);
				}
			}

//<<<<<<< HEAD
		});

		java.net.URL url__1 = this.getClass().getResource("../icon/back.PNG");
		Image originImg = new ImageIcon(url__1.getPath()).getImage();
		originImg = originImg.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		ImageIcon Icon = new ImageIcon(originImg);
//>>>>>>> branch 'master' of https://github.com/jaewon0067/book-.git
		JLabel back = new JLabel(new ImageIcon(url__1.getPath()));
		back.setBounds(0, 0, 374, 581);
		panel_1.add(back);
	}
}
