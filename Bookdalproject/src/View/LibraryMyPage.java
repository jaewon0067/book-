package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import Controller.LibraryManagementSystem;
import Model.Member_LibraryVo;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class LibraryMyPage {

	private JFrame frame;
	private JLabel lblForName;
	private JLabel lblForAge;
	private JLabel lblForGender;
	private JLabel lblForPhone;
	private JLabel lblForAddress;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JButton btnNewButton;

	
	public LibraryMyPage(Member_LibraryVo user) {
		initialize(user);
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(Member_LibraryVo user) {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 347, 534);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblForName = new JLabel("New label");
		lblForName.setBounds(186, 10, 107, 15);
		frame.getContentPane().add(lblForName);
		lblForName.setText(user.getName());
		
		lblForAge = new JLabel("New label");
		lblForAge.setBounds(186, 35, 107, 15);
		frame.getContentPane().add(lblForAge);
		lblForAge.setText(user.getAge());
		
		lblForGender = new JLabel("New label");
		lblForGender.setBounds(186, 55, 107, 15);
		frame.getContentPane().add(lblForGender);
		lblForGender.setText(user.getGender());
		
		lblForPhone = new JLabel("New label");
		lblForPhone.setBounds(186, 80, 107, 15);
		frame.getContentPane().add(lblForPhone);
		lblForPhone.setText(user.getPhone());
		
		lblForAddress = new JLabel("New label");
		lblForAddress.setBounds(186, 105, 107, 15);
		frame.getContentPane().add(lblForAddress);
		lblForAddress.setText(user.getAddr());
		
		lblNewLabel = new JLabel("\uC774\uB984");
		lblNewLabel.setBounds(101, 10, 57, 15);
		frame.getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("\uB098\uC774");
		lblNewLabel_1.setBounds(101, 35, 57, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("\uC131\uBCC4");
		lblNewLabel_2.setBounds(101, 55, 57, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("\uC804\uD654\uBC88\uD638");
		lblNewLabel_3.setBounds(101, 80, 57, 15);
		frame.getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("\uC8FC\uC18C");
		lblNewLabel_4.setBounds(101, 105, 57, 15);
		frame.getContentPane().add(lblNewLabel_4);
		
		btnNewButton = new JButton("\uB3C5\uC11C\uB0B4\uC5ED\uBCF4\uAE30");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LibraryMyPage2 myPage2 = new LibraryMyPage2();
			}
		});
		btnNewButton.setBounds(196, 433, 123, 23);
		frame.getContentPane().add(btnNewButton);
		
	}
}
