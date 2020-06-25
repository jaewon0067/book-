package View;

import java.awt.EventQueue;

import javax.swing.JFrame;

import Model.Member_LibraryVo;

public class RealReturnBook {

	private JFrame frame;

	public RealReturnBook(Member_LibraryVo user) {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 753, 458);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}
