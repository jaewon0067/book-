package View;

import java.awt.EventQueue;
import java.awt.Image;
import java.net.URL;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LibraryBookBasket {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibraryBookBasket window = new LibraryBookBasket();
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
	public LibraryBookBasket() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 388, 600);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		String path = "../icon/bookcartgui.png";

		URL book_info1 = this.getClass().getResource(path);
		Image originImg = new ImageIcon(book_info1.getPath()).getImage();
		originImg = originImg.getScaledInstance(374, 561, Image.SCALE_SMOOTH);
		ImageIcon Icon = new ImageIcon(originImg);

		JLabel bookInfo_label = new JLabel(Icon);
		bookInfo_label.setBounds(0, 0, 374, 564);
		frame.getContentPane().add(bookInfo_label);

		JButton order_btn = new JButton("");
		order_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//주문 버튼 눌렀을 때 이동할 곳 입력
			}
		});
		// 대출하기 버튼 안보이게
		order_btn.setContentAreaFilled(false);
		order_btn.setFocusPainted(false);
		order_btn.setBorderPainted(false);
		order_btn.setBounds(65, 504, 257, 23);
		frame.getContentPane().add(order_btn);

		order_btn.setBounds(94, 452, 166, 23);
		frame.getContentPane().add(order_btn);
		frame.setVisible(true);

	}
}
