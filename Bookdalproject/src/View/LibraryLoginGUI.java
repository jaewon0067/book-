package View;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Controller.LibraryManagementSystem;
import Model.Member_LibraryVo;

public class LibraryLoginGUI {
	private JFrame frame; // ���� â�� ��Ÿ���� ��ü
	private JTextField Input_id;
	private JPasswordField Input_pw;
	private JButton btn_Login;
	private JButton btn_cancel;
	
	
	public static LibraryManagementSystem controller = new LibraryManagementSystem();
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
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 865, 488);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btn_Login = new JButton("\uB85C\uADF8\uC778");
		btn_Login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Ȯ�ι�ư Ŭ��
				// 1. id�� pw�� ������Ʈ���� ��������
				// 2. DB���� �ش� id,pw�� ��ȸ�ϱ�
				String id = Input_id.getText();
				String pw = String.valueOf(Input_pw.getPassword());
				System.out.println(id);
				System.out.println(pw);
				Member_LibraryVo user = new Member_LibraryVo(id, pw);
				Member_LibraryVo loginUser = controller.login(user);
				
				
				
				if(loginUser != null) {
					System.out.println("�α��� ����");
					JOptionPane.showMessageDialog(frame,
						    "ȯ���մϴ�.");
					System.out.println(user.getName());
				//	LibraryMainGUI maingui  = new LibraryMainGUI();
					LibraryHomeGUI homeGUI = new LibraryHomeGUI(loginUser);
					
					
					frame.setVisible(false); // �α��� ���� �� â ����
					
					
					
					
				}else {
					System.out.println("�α��� ����");
					JOptionPane.showMessageDialog(frame,
						    "�α��� ����",
						    "Inane error",
						    JOptionPane.ERROR_MESSAGE);
				}
			}

			
		});
		btn_Login.setBounds(230, 274, 97, 23);
		frame.getContentPane().add(btn_Login);
		
		btn_cancel = new JButton("\uD68C\uC6D0\uAC00\uC785");
		btn_cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//ȸ������ ��ư Ŭ�� ��
				LibraryJoinGUI join = new LibraryJoinGUI();
			}
		});
		btn_cancel.setBounds(620, 274, 97, 23);
		frame.getContentPane().add(btn_cancel);
		
		JLabel lbl_title = new JLabel("Login");
		lbl_title.setBounds(365, 41, 199, 60);
		frame.getContentPane().add(lbl_title);
		
		JLabel lbl_id = new JLabel("ID");
		lbl_id.setBounds(273, 143, 57, 15);
		frame.getContentPane().add(lbl_id);
		
		JLabel lbl_pw = new JLabel("PW");
		lbl_pw.setBounds(273, 183, 57, 15);
		frame.getContentPane().add(lbl_pw);
		
		Input_id = new JTextField();
		Input_id.setBounds(398, 140, 116, 21);
		frame.getContentPane().add(Input_id);
		Input_id.setColumns(10);
		
		Input_pw = new JPasswordField();
		Input_pw.setBounds(398, 180, 116, 21);
		frame.getContentPane().add(Input_pw);
	}

}
