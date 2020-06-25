package View;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;

public class MyPage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyPage window = new MyPage();
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
	public MyPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 388, 600);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		String path = "../icon/mypageback.PNG";

		URL back = this.getClass().getResource(path);
		Image originImg = new ImageIcon(back.getPath()).getImage();
		originImg = originImg.getScaledInstance(374, 561, Image.SCALE_SMOOTH);
		ImageIcon Icon = new ImageIcon(originImg);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(203, 84, 57, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(192, 109, 57, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(214, 134, 57, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(203, 160, 57, 15);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(224, 185, 57, 15);
		frame.getContentPane().add(lblNewLabel_4);

		JPanel panel = new JPanel();
		panel.setBounds(0, 504, 372, 57);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(0, 5, 0, 0));

		URL home_1 = this.getClass().getResource("../icon/hohome.PNG");
		JButton home = new JButton(new ImageIcon(home_1.getPath()));
		home.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(home);

		URL list_1 = this.getClass().getResource("../icon/list.PNG");
		JButton list = new JButton(new ImageIcon(list_1.getPath()));
		list.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(list);

		URL cart_1 = this.getClass().getResource("../icon/cart.PNG");
		JButton cart = new JButton(new ImageIcon(cart_1.getPath()));
		cart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		panel.add(cart);

		URL mypage_1 = this.getClass().getResource("../icon/mypage.PNG");
		JButton mypage = new JButton(new ImageIcon(mypage_1.getPath()));
		mypage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(mypage);

		URL delivery_1 = this.getClass().getResource("../icon/de.PNG");
		JButton delivery = new JButton(new ImageIcon(delivery_1.getPath()));
		delivery.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(delivery);

		JLabel back_label = new JLabel(Icon);
		back_label.setBounds(0, 0, 374, 564);
		frame.getContentPane().add(back_label);

	}
}
