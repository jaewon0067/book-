package View;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Controller.LibraryManagementSystem;
import Model.Member_LibraryVo;
import javax.swing.JSeparator;
import java.awt.Font;

public class LibraryLoginGUI {
	private JFrame frame; // 현재 창을 나타내는 객체
	private JTextField Input_id;
	private JPasswordField Input_pw;
	private JButton btn_Login;
	private JButton btn_cancel;

	public static LibraryManagementSystem controller = new LibraryManagementSystem();
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JPanel panel_1;
	private JLabel lbl_title_1;
	private JLabel lbl_title_2;
	private JLabel lbl_title_3;
	private JLabel lbl_title_4;

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
		frame.setBounds(100, 100, 331, 467);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		btn_Login = new JButton("\uB85C\uADF8\uC778");
		btn_Login.setBackground(new Color(192, 192, 192));
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
					System.out.println(user.getName());
					// LibraryMainGUI maingui = new LibraryMainGUI();
					LibraryHomeGUI homeGUI = new LibraryHomeGUI(loginUSer);

					frame.setVisible(false); // 로그인 성공 시 창 닫음

				} else {
					System.out.println("로그인 실패");
					JOptionPane.showMessageDialog(frame, "로그인 실패", "Inane error", JOptionPane.ERROR_MESSAGE);
				}
			}

		});
		String path1 = "C:\\Users\\smhrd\\Desktop\\refresh.png";
		Image image1 = new ImageIcon(path1).getImage();
		
		JLabel lblNewLabel_2 = new JLabel(new ImageIcon(image1.getScaledInstance(90, 90, image1.SCALE_SMOOTH)));
		lblNewLabel_2.setBounds(90, 82, 125, 119);
		frame.getContentPane().add(lblNewLabel_2);
		btn_Login.setBounds(45, 318, 97, 31);
		frame.getContentPane().add(btn_Login);

		btn_cancel = new JButton("\uD68C\uC6D0\uAC00\uC785");
		btn_cancel.setBackground(new Color(192, 192, 192));
		btn_cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 회원가입 버튼 클릭 시
				LibraryJoinGUI join = new LibraryJoinGUI();
			}
		});
		btn_cancel.setBounds(169, 318, 97, 31);
		frame.getContentPane().add(btn_cancel);

		JLabel lbl_id = new JLabel("ID");
		lbl_id.setBounds(45, 186, 57, 15);
		frame.getContentPane().add(lbl_id);

		JLabel lbl_pw = new JLabel("PW");
		lbl_pw.setBounds(45, 252, 57, 15);
		frame.getContentPane().add(lbl_pw);

		Input_id = new JTextField();
		Input_id.setBounds(45, 211, 221, 31);
		frame.getContentPane().add(Input_id);
		Input_id.setColumns(10);

		Input_pw = new JPasswordField();
		Input_pw.setBounds(45, 277, 221, 31);
		frame.getContentPane().add(Input_pw);

		String path = "C:\\Users\\smhrd\\Desktop\\book.png";
		Image image = new ImageIcon(path).getImage();

		JLabel img_label = new JLabel(new ImageIcon(image.getScaledInstance(50, 50, image.SCALE_SMOOTH)));
		img_label.setBounds(101, 94, 108, 105);
		frame.getContentPane().add(img_label);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(12, 13, 291, 65);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lbl_title = new JLabel("\uB2F9\uC2E0\uC758   ");
		lbl_title.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lbl_title.setBounds(12, 0, 54, 31);
		panel.add(lbl_title);

		lblNewLabel_1 = new JLabel("\uBC14\uAFB8\uC5B4\uC904 \uB180\uB77C\uC6B4 \uD504\uB85C\uADF8\uB7A8");
		lblNewLabel_1.setBounds(135, 31, 208, 31);
		panel.add(lblNewLabel_1);
		
		lbl_title_1 = new JLabel("\uB3C5\uC11C");
		lbl_title_1.setFont(new Font("맑은 고딕", Font.BOLD, 17));
		lbl_title_1.setBounds(58, -1, 48, 31);
		panel.add(lbl_title_1);
		
		lbl_title_2 = new JLabel("\uB97C");
		lbl_title_2.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lbl_title_2.setBounds(95, 0, 27, 31);
		panel.add(lbl_title_2);
		
		lbl_title_3 = new JLabel("\uB2A5\uB3D9\uC801");
		lbl_title_3.setFont(new Font("맑은 고딕", Font.BOLD, 17));
		lbl_title_3.setBounds(118, 0, 63, 31);
		panel.add(lbl_title_3);
		
		lbl_title_4 = new JLabel("\uC73C\uB85C");
		lbl_title_4.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lbl_title_4.setBounds(173, 0, 54, 31);
		panel.add(lbl_title_4);
		
		panel_1 = new JPanel();
		panel_1.setBounds(30, 146, 254, 223);
		frame.getContentPane().add(panel_1);
		


	}
}

