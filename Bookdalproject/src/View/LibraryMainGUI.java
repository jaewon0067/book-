package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import Controller.LibraryManagementSystem;

public class LibraryMainGUI {
	private LibraryManagementSystem controller = LibraryLoginGUI.controller;
	private JFrame frame;
	private JLabel loginUser;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibraryMainGUI window = new LibraryMainGUI();
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
	public LibraryMainGUI() {
		initialize();
		frame.setVisible(true);
		loginUser.setText(controller.getLoginUser().getName());
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 795, 479);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		loginUser = new JLabel("\uD64D\uAE38\uB3D9");
		loginUser.setBounds(589, 10, 57, 15);
		frame.getContentPane().add(loginUser);
		
		JLabel lblNewLabel_1 = new JLabel("\uB2D8 \uD658\uC601\uD569\uB2C8\uB2E4");
		lblNewLabel_1.setBounds(642, 10, 125, 15);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
