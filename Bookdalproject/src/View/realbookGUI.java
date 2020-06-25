package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.text.SimpleDateFormat;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import Controller.LibraryManagementSystem;
import Model.Member_LibraryVo;

public class realbookGUI {

	private JFrame frame;
	private LibraryManagementSystem controller = new LibraryManagementSystem();
	private Controller.BookVO vo = null;

	/**
	 * Create the application.
	 * 
	 * @param searchcode
	 */
	public realbookGUI(String searchcode, Member_LibraryVo user) {
		vo = controller.getSearchcode(searchcode);
		System.out.println(vo.getAuthor());
		initialize(user);
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(Member_LibraryVo user) {
		frame = new JFrame();
		frame.setBounds(100, 100, 412, 638);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 394, 599);
		frame.getContentPane().add(panel);

		URL url__1 = this.getClass().getResource("../icon/back2.PNG");
		panel.setLayout(null);

		JPanel panel_4 = new JPanel();
		panel_4.setBounds(0, 537, 394, 62);
		panel_4.setBackground(new Color(255, 0, 0, 0));
		panel_4.setOpaque(false);
		panel.add(panel_4);
		panel_4.setLayout(new GridLayout(0, 5, 0, 0));

		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBorderPainted(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setOpaque(false);
		panel_4.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setOpaque(false);
		panel_4.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setFocusPainted(false);
		btnNewButton_2.setOpaque(false);
		panel_4.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBorderPainted(false);
		btnNewButton_3.setContentAreaFilled(false);
		btnNewButton_3.setFocusPainted(false);
		btnNewButton_3.setOpaque(false);
		panel_4.add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setBorderPainted(false);
		btnNewButton_4.setContentAreaFilled(false);
		btnNewButton_4.setFocusPainted(false);
		btnNewButton_4.setOpaque(false);
		panel_4.add(btnNewButton_4);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(31, 105, 334, 253);
		panel.add(panel_2);
		panel_2.setLayout(new GridLayout(5, 0, 0, 0));

		JLabel liblocation_label = new JLabel("\uBCF4\uC720 \uB3C4\uC11C\uAD00 : " + vo.getLib_location());
		liblocation_label.setFont(new Font("배달의민족 주아", Font.PLAIN, 16));
		panel_2.add(liblocation_label);

		JLabel author_label = new JLabel("\uC800\uC790 : " + vo.getAuthor());
		author_label.setFont(new Font("배달의민족 주아", Font.PLAIN, 16));
		panel_2.add(author_label);

		JLabel publisher_label = new JLabel("\uCD9C\uD310\uC0AC : " + vo.getPublisher());
		publisher_label.setFont(new Font("배달의민족 주아", Font.PLAIN, 16));
		panel_2.add(publisher_label);

		JLabel bookintroduce_label = new JLabel("\uCC45 \uC18C\uAC1C : " + vo.getOriginal() + " , " + vo.getSidebook());
		bookintroduce_label.setFont(new Font("배달의민족 주아", Font.PLAIN, 16));
		panel_2.add(bookintroduce_label);

		JLabel status_label = new JLabel("\uB300\uCD9C \uC0C1\uD669 :" + vo.getStatus());
		status_label.setFont(new Font("배달의민족 주아", Font.PLAIN, 16));
		panel_2.add(status_label);

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(31, 368, 334, 95);
		panel.add(panel_3);
		panel_3.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel lblNewLabel_3 = new JLabel("\uB300\uCD9C \uAC00\uB2A5 \uC77C \uC218 : 15\uC77C");
		lblNewLabel_3.setFont(new Font("배달의민족 주아", Font.PLAIN, 16));
		panel_3.add(lblNewLabel_3);// 대출가능일수 15일

		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
		String today = format1.format(System.currentTimeMillis());
		long retd = System.currentTimeMillis() + 1296000000;
		String returndate = format1.format(retd);
		long gap = (retd - System.currentTimeMillis()) / 86400000;

		JLabel sysdate_label = new JLabel("\uB300\uCD9C\uC77C : " + today);
		sysdate_label.setFont(new Font("배달의민족 주아", Font.PLAIN, 16));
		sysdate_label.setToolTipText("");
		panel_3.add(sysdate_label);

		JLabel shouldreturnlabel = new JLabel("\uBC18\uB0A9\uC77C : " + returndate);
		shouldreturnlabel.setFont(new Font("배달의민족 주아", Font.PLAIN, 16));
		panel_3.add(shouldreturnlabel);

		JButton btn_puttobookcart = new JButton("\uBD81\uBC14\uAD6C\uB2C8\uC5D0 \uB2F4\uAE30");
		btn_puttobookcart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				boolean isSuccess = controller.bookcartin(vo, user);

				if (isSuccess != true) {
					System.out.println("북바구니에 담겼습니다.");
					JOptionPane.showMessageDialog(frame, "북바구니에 담겼습니다.", "북바구니 전송", JOptionPane.INFORMATION_MESSAGE);
				} else {
					System.out.println("북바구니에 담기지 않았습니다.ㅠㅠ T^T");
					JOptionPane.showMessageDialog(frame, "북바구니에 담기지 않았습니다.ㅠㅠ T^T", "북바구니 전송",
							JOptionPane.ERROR_MESSAGE);
				}
				// 지금 받은 vo를 북카트table로 넘겨야함.
			}
		});
		btn_puttobookcart.setBounds(31, 473, 276, 41);
		panel.add(btn_puttobookcart);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(31, 22, 334, 73);
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(2, 0, 0, 0));

		JLabel bookname_label = new JLabel("\uC774\uB984 : " + vo.getBook_name());
		bookname_label.setHorizontalAlignment(SwingConstants.CENTER);
		bookname_label.setFont(new Font("배달의민족 주아", Font.PLAIN, 17));
		panel_1.add(bookname_label);

		JLabel Book_idlabel = new JLabel("\uCC45 ID : " + vo.getBook_id());
		Book_idlabel.setFont(new Font("배달의민족 주아", Font.PLAIN, 15));
		Book_idlabel.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1.add(Book_idlabel);

		JLabel back = new JLabel(new ImageIcon(url__1.getPath()));
		back.setBounds(0, 0, 394, 593);
		panel.add(back);
	}
}
