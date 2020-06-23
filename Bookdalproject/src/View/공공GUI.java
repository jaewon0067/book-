package View;

import java.awt.EventQueue;
import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 공공GUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					공공GUI window = new 공공GUI();
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
	public 공공GUI() {
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
		
		URL path1 = this.getClass().getResource("../icon/bookWind1.jpg");		
		Image originImg = new ImageIcon(path1.getPath()).getImage(); 
		originImg= originImg.getScaledInstance(70, 90, Image.SCALE_SMOOTH );
		ImageIcon Icon = new ImageIcon(originImg);



		JLabel img_label1 = new JLabel(Icon);
		img_label1.setBounds(12, 130, 81, 92);
		frame.getContentPane().add(img_label1);
	}
}
