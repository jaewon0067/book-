package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JEditorPane;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JPanel;

import oracle.net.aso.f;

import java.awt.CardLayout;
import javax.swing.JLabel;

public class LibraryBook_Set {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibraryBook_Set window = new LibraryBook_Set();
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
	public LibraryBook_Set() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 390, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 350, 82);
		frame.getContentPane().add(panel);
		panel.setLayout(new CardLayout(0, 0));
		
		JEditorPane editorPane = new JEditorPane();
		panel.add(editorPane, "name_1000719071087900");
		editorPane.setBackground(SystemColor.inactiveCaptionBorder);
	}
}
