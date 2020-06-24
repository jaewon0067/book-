package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LibraryReturnBook {

	private JFrame frame;
	private JButton btn_forReturn;
	private JButton btn_forReturn1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibraryReturnBook window = new LibraryReturnBook();
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
	public LibraryReturnBook() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 967, 509);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(49, 21, 432, 107);
		frame.getContentPane().add(panel);
		
		btn_forReturn = new JButton("반납하기");
		btn_forReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton btn_forReturn = (JButton)e.getSource();
				if(btn_forReturn.getText().equals("반납하기")) {
					btn_forReturn.setText("호출중");
					
				}else if(btn_forReturn.getText().equals("호출중")){
					btn_forReturn.setText("반납완료");
				}else {
					btn_forReturn .setText("반납하기");
				}
			}
		});
		panel.add(btn_forReturn);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(49, 165, 432, 128);
		frame.getContentPane().add(panel_1);
		
		btn_forReturn1 = new JButton("반납하기");
		btn_forReturn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton btn_forReturn1 = (JButton)e.getSource();
				if(btn_forReturn1.getText().equals("반납하기")) {
					btn_forReturn1.setText("호출중");
					
				}else if(btn_forReturn1.getText().equals("호출중")){
					btn_forReturn1.setText("반납완료");
				}else {
					btn_forReturn1.setText("반납하기");
				}
			}
		});
		panel_1.add(btn_forReturn1);
	}

}
