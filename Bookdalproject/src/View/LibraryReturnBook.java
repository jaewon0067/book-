package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.net.URL;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.GridLayout;

public class LibraryReturnBook {

	private JFrame frame;
	private JButton btn_forReturn;
	private JButton btn_forReturn1;
	private JLabel back;
	private JLabel book1;
	private JLabel book2;
	private JButton list;
	private JButton cart;
	private JButton mypage;
	private JButton delivery;
	private JButton home;

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
		frame.setBounds(100, 100, 410, 647);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(22, 103, 343, 107);
		frame.getContentPane().add(panel);
		
		btn_forReturn = new JButton("\uBC18\uB0A9\uC2E0\uCCAD");
		btn_forReturn.setBackground(SystemColor.controlHighlight);
		btn_forReturn.setBounds(238, 63, 93, 23);
		btn_forReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton btn_forReturn = (JButton)e.getSource();
				if(btn_forReturn.getText().equals("π›≥≥Ω≈√ª")) {
					btn_forReturn.setText("π›≥≥øœ∑·");
				}else {
					btn_forReturn.setText("π›≥≥Ω≈√ª");
				}
			}
		});
		panel.setLayout(null);
		panel.add(btn_forReturn);
		
		java.net.URL book_1 = this.getClass().getResource("../icon/grandma.PNG");
		JLabel book1 = new JLabel(new ImageIcon(book_1.getPath()));
		book1.setBounds(0, 0, 343, 100);
		panel.add(book1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(28, 226, 337, 107);
		frame.getContentPane().add(panel_1);
		
		btn_forReturn1 = new JButton("\uBC18\uB0A9\uC2E0\uCCAD");
		btn_forReturn1.setBackground(SystemColor.controlHighlight);
		btn_forReturn1.setBounds(231, 62, 94, 23);
		btn_forReturn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton btn_forReturn1 = (JButton)e.getSource();
				if(btn_forReturn1.getText().equals("π›≥≥Ω≈√ª")) {
					btn_forReturn1.setText("π›≥≥øœ∑·");
				}else {
					btn_forReturn1.setText("π›≥≥Ω≈√ª");
				}
			}
		});
		panel_1.setLayout(null);
		panel_1.add(btn_forReturn1);
		
		java.net.URL book_2 = this.getClass().getResource("../icon/nania.PNG");
		JLabel book2 = new JLabel(new ImageIcon(book_2.getPath()));
		book2.setBounds(0, 0, 336, 107);
		panel_1.add(book2);
		
		java.net.URL url__1 = this.getClass().getResource("../icon/deliveryback.PNG");
		JLabel back = new JLabel(new ImageIcon(url__1.getPath()));
		back.setBounds(0, 0, 395, 609);
		frame.getContentPane().add(back);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 549, 394, 59);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(new GridLayout(0, 5, 0, 0));
		
		URL home_1 = this.getClass().getResource("../icon/hohome.PNG");
		home = new JButton(new ImageIcon(home_1.getPath()));
		home.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
			
			}
		});
		panel_2.add(home);

		URL list_1 = this.getClass().getResource("../icon/list.PNG");
		list = new JButton(new ImageIcon(list_1.getPath()));
		list.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_2.add(list);

		URL cart_1 = this.getClass().getResource("../icon/cart.PNG");
		cart = new JButton(new ImageIcon(cart_1.getPath()));
		cart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		panel_2.add(cart);

		URL mypage_1 = this.getClass().getResource("../icon/mypage.PNG");
		mypage = new JButton(new ImageIcon(mypage_1.getPath()));
		mypage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_2.add(mypage);

		URL delivery_1 = this.getClass().getResource("../icon/de.PNG");
		delivery = new JButton(new ImageIcon(delivery_1.getPath()));
		delivery.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_2.add(delivery);
	}

}
