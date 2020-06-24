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
		
		btn_forReturn = new JButton("¹Ý³³ÇÏ±â");
		btn_forReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton btn_forReturn = (JButton)e.getSource();
				if(btn_forReturn.getText().equals("¹Ý³³ÇÏ±â")) {
					btn_forReturn.setText("¹Ý³³¿Ï·á");
				}else {
					btn_forReturn.setText("¹Ý³³ÇÏ±â");
				}
			}
		});
		panel.add(btn_forReturn);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(49, 165, 432, 128);
		frame.getContentPane().add(panel_1);
		
		btn_forReturn1 = new JButton("¹Ý³³ÇÏ±â");
		btn_forReturn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton btn_forReturn1 = (JButton)e.getSource();
				if(btn_forReturn1.getText().equals("¹Ý³³ÇÏ±â")) {
					btn_forReturn1.setText("¹Ý³³¿Ï·á");
				}else {
					btn_forReturn1.setText("¹Ý³³ÇÏ±â");
				}
			}
		});
		panel_1.add(btn_forReturn1);
	}

}
