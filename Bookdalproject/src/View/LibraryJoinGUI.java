package View;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Controller.LibraryManagementSystem;

import Model.Member_LibraryVo;
import javax.swing.JPanel;



public class LibraryJoinGUI {

	;private JFrame frame;
	private JTextField txt_forID;
	private JTextField txt_forPW;
	private JTextField txt_forName;
	private JButton btn_join;

	private JLabel lbl_join_title;
	private JButton btn_join_1;
	private JLabel lbl_join_name;
	private JLabel lbl_join_pw;
	private JLabel lbl_join_id;
	private LibraryManagementSystem controller = LibraryLoginGUI.controller;
	private JTextField txt_forAge;
	private JTextField txt_forSex;
	private JTextField txt_forPhone;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField txt_forAddr;
	private JLabel lblNewLabel_3;

	
	public LibraryJoinGUI() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibraryJoinGUI window = new LibraryJoinGUI();
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


	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 580, 451);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // 회원가입 창만 닫게 하기
		frame.getContentPane().setLayout(null);
		
		lbl_join_id = new JLabel("ID");
		lbl_join_id.setBounds(156, 100, 57, 15);
		frame.getContentPane().add(lbl_join_id);
		
		lbl_join_pw = new JLabel("PW");
		lbl_join_pw.setBounds(156, 142, 57, 15);
		frame.getContentPane().add(lbl_join_pw);
		
		lbl_join_name = new JLabel("Name");
		lbl_join_name.setBounds(156, 190, 57, 15);
		frame.getContentPane().add(lbl_join_name);
		
		txt_forID = new JTextField();
		txt_forID.setBounds(259, 97, 116, 21);
		frame.getContentPane().add(txt_forID);
		txt_forID.setColumns(10);
		
		txt_forPW = new JTextField();
		txt_forPW.setBounds(259, 139, 116, 21);
		frame.getContentPane().add(txt_forPW);
		txt_forPW.setColumns(10);
		
		txt_forName = new JTextField();
		txt_forName.setBounds(259, 187, 116, 21);
		frame.getContentPane().add(txt_forName);
		txt_forName.setColumns(10);
		lbl_join_title = new JLabel("Join");
		lbl_join_title.setBounds(249, 42, 57, 15);
		frame.getContentPane().add(lbl_join_title);
		
		txt_forAge = new JTextField();
		txt_forAge.setBounds(259, 218, 116, 21);
		frame.getContentPane().add(txt_forAge);
		txt_forAge.setColumns(10);
		
		txt_forSex = new JTextField();
		txt_forSex.setBounds(259, 249, 116, 21);
		frame.getContentPane().add(txt_forSex);
		txt_forSex.setColumns(10);
		
		txt_forPhone = new JTextField();
		txt_forPhone.setBounds(259, 280, 116, 21);
		frame.getContentPane().add(txt_forPhone);
		txt_forPhone.setColumns(10);
		
		lblNewLabel = new JLabel("age");
		lblNewLabel.setBounds(156, 215, 57, 15);
		frame.getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("sex");
		lblNewLabel_1.setBounds(156, 252, 57, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("phone");
		lblNewLabel_2.setBounds(156, 283, 57, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		btn_join_1 = new JButton("\uD68C\uC6D0\uAC00\uC785");
		btn_join_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = txt_forID.getText();
				String pw = txt_forPW.getText();
				String name = txt_forName.getText();
				String age = txt_forAge.getText();
				String gender = txt_forSex.getText();
				String phone = txt_forPhone.getText();
				String addr = txt_forAddr.getText();
				Member_LibraryVo joinUser = new Member_LibraryVo(id,pw,name,age,gender,phone,addr);
				int cnt = controller.join(joinUser);
				if(cnt == 0) {
					System.out.println("회원가입 실패");
					JOptionPane.showMessageDialog(frame,
						    "회원가입 실패",
						    "회원가입 결과 ",
						    JOptionPane.ERROR_MESSAGE);
					
				}else {
					System.out.println("회원가입 성공");
					JOptionPane.showMessageDialog(frame,
						    "회원가입 성공",
						    "회원가입 결과",
						    JOptionPane.INFORMATION_MESSAGE);
					frame.setVisible(false);
					
				}
					
			}
		});
		btn_join_1.setBounds(233, 342, 97, 23);
		frame.getContentPane().add(btn_join_1);
		
		txt_forAddr = new JTextField();
		txt_forAddr.setBounds(259, 311, 116, 21);
		frame.getContentPane().add(txt_forAddr);
		txt_forAddr.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Address");
		lblNewLabel_3.setBounds(156, 314, 57, 15);
		frame.getContentPane().add(lblNewLabel_3);
		
		
	}
}
