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
import javax.swing.JOptionPane;

public class book1GUI {

	public JFrame frame;

	private int num;
	String path = null;
	

	public void setNum(int num) {
		this.num = num;
		System.out.println(num);

		if (num == 1) {
			path = "../icon/bookinfo1.png";
		} else if (num == 2) {
			path = "../icon/bookinfo2.png";
		} else if (num == 3) {
			path = "../icon/bookinfo3.png";
		} else if (num == 4) {
			path = "../icon/bookinfo4.png";
		} else if (num == 5) {
			path = "../icon/bookinfo5.png";
		} else if (num == 6) {
			path = "../icon/bookinfo6.png";
		} else if (num == 7) {
			path = "../icon/bookinf7.png";
		} else if (num == 8) {
			path = "../icon/bookinfo8.png";
		}

		URL book_info1 = this.getClass().getResource(path);
		Image originImg = new ImageIcon(book_info1.getPath()).getImage();
		originImg = originImg.getScaledInstance(374, 561, Image.SCALE_SMOOTH);
		ImageIcon Icon = new ImageIcon(originImg);

		JLabel bookInfo_label = new JLabel(Icon);
		bookInfo_label.setBounds(0, 0, 374, 561);
		frame.getContentPane().add(bookInfo_label);
		frame.setVisible(true);

	}

	public book1GUI() {
		initialize();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.setBounds(100, 100, 390, 600);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton rental_btn = new JButton("");
		rental_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "북바구니에 성공적으로 담겼습니다!! q:^)", "북바구니",
						JOptionPane.INFORMATION_MESSAGE);
				
				
				
				
			}
		});
		rental_btn.setBounds(63, 504, 256, 23);
		frame.getContentPane().add(rental_btn);

		// 대출하기 버튼 안보이게
		rental_btn.setContentAreaFilled(false);
		rental_btn.setFocusPainted(false);
		rental_btn.setBorderPainted(false);
		rental_btn.setBounds(65, 504, 257, 23);
		frame.getContentPane().add(rental_btn);

	}
}
