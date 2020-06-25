package View;

import java.awt.Button;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;

import Controller.BookVO;
import Controller.LibraryManagementSystem;
import Model.Member_LibraryVo;

public class LibrarySearchGUI {

	private JFrame frame;
	private LibraryManagementSystem controller = new LibraryManagementSystem();
	private JPanel panel;
	private JTextField textField;
	// private final Action action = new SwingAction();
	ArrayList<BookVO> searchlist = new ArrayList();
	private JPanel panel_2 = new JPanel();
	int j;
	String[] sp;
	public JButton lblNewButton_j;
	private Member_LibraryVo user;

	public LibrarySearchGUI(String searchbook, Member_LibraryVo user) {
		this.user = user;

		searchlist = controller.getSearchBook(searchbook);
		for (j = 0; j < searchlist.size(); j++) {
			lblNewButton_j = new JButton();
			// lblNewButton_j.addActionListener(this);
			lblNewButton_j.setText(searchlist.get(j).getBook_id() + ":" + searchlist.get(j).getBook_name() + ","
					+ searchlist.get(j).getLib_location());
			lblNewButton_j.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// 액션 리스너 재정의
					String value = ((JButton) e.getSource()).getText();
					String[] values = value.split(":");
					System.out.println(values[0]);
					realbookGUI realgui = new realbookGUI(values[0], user);
				}
			});
			panel_2.add(lblNewButton_j);

		}

		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.setBounds(100, 100, 390, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);

		JPanel panel_1 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_1, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel_1, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_1, 54, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_1, 364, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		springLayout.putConstraint(SpringLayout.NORTH, panel_2, 6, SpringLayout.SOUTH, panel_1);
		springLayout.putConstraint(SpringLayout.WEST, panel_2, 0, SpringLayout.WEST, panel_1);
		springLayout.putConstraint(SpringLayout.SOUTH, panel_2, 497, SpringLayout.SOUTH, panel_1);
		springLayout.putConstraint(SpringLayout.EAST, panel_2, 0, SpringLayout.EAST, panel_1);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));

		JButton btnNewButton = new JButton("\uB4A4\uB85C\uAC00\uAE30");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "뒤로 이동합니다.", "뒤로가기", JOptionPane.PLAIN_MESSAGE);
				frame.setVisible(false);
				SangrokGUI back = new SangrokGUI(user);
			}

		});
		// btnNewButton.setAction(action);

		JLabel lblNewLabel = new JLabel(
				"\uB4A4\uB85C \uB3CC\uC544\uAC00\uC11C \uC791\uAC00\uC640 \uCC45 \uC774\uB984\uC73C\uB85C \uAC80\uC0C9\uD558\uC138\uC694~");
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 3, 260, 34);
		panel_1.add(lblNewLabel);

		btnNewButton.setFont(new Font("배달의민족 주아", Font.PLAIN, 17));
		btnNewButton.setBounds(257, 6, 97, 28);
		panel_1.add(btnNewButton);

	}

//	private class SwingAction extends AbstractAction {
//		public SwingAction() {
//			putValue(NAME, "SwingAction");
//			putValue(SHORT_DESCRIPTION, "Some short description");
//		}
//
//		public void actionPerformed(ActionEvent e) {
//		}
//	}

}
