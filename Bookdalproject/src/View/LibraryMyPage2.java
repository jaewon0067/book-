package View;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class LibraryMyPage2 {

	private JFrame frame;

	
	public LibraryMyPage2() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 653, 504);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	}

}
