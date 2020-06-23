package View;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class book1GUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					book1GUI window = new book1GUI();
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
	public book1GUI() {
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

		URL book_info1 = this.getClass().getResource("../icon/bookinfo1.png");
		Image originImg = new ImageIcon(book_info1.getPath()).getImage();
		originImg = originImg.getScaledInstance(374, 561, Image.SCALE_SMOOTH);
		ImageIcon Icon = new ImageIcon(originImg);

		JButton rental_btn = new JButton("");
		rental_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		rental_btn.setContentAreaFilled(false);
		rental_btn.setFocusPainted(false);
		rental_btn.setBorderPainted(false);
		rental_btn.setBounds(65, 504, 257, 23);
		frame.getContentPane().add(rental_btn);
		
		JLabel bookInfo_label = new JLabel(Icon);
		
		bookInfo_label.setBounds(0, 0, 374, 561);
		frame.getContentPane().add(bookInfo_label);

//		URL url = this.getClass().getResource("../icon/book1.PNG");
//		JButton btnbook1 = new JButton(new ImageIcon(url.getPath()));
//		btnbook1.setBorderPainted(false);
//		btnbook1.setContentAreaFilled(false);
//		btnbook1.setFocusPainted(false);
//		btnbook1.setOpaque(false);
//		btnbook1.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//			}
//		});
//		bookrecommend.add(btnbook1);

	}
}
