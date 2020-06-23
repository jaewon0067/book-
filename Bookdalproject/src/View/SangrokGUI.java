package View;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import Controller.BookVO;
import Controller.LibraryManagementSystem;
import java.awt.CardLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.BorderLayout;

public class SangrokGUI {

	private JFrame frame;
	private JTextField search;
	private LibraryManagementSystem controller = new LibraryManagementSystem();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SangrokGUI window = new SangrokGUI();
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
	public SangrokGUI() {
		initialize();
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
		
		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 54, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, 364, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		search = new JTextField();
		search.setBounds(0, 0, 305, 34);
		panel.add(search);
		search.setColumns(10);
		
		JButton btn_search = new JButton("\u261E");
		btn_search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String searchbook = search.getText();
				ArrayList<BookVO> searchresult = controller.getSearchBook(searchbook);
				for (int j = 0; j < searchresult.size(); j++) {
					System.out.println(searchresult.get(j).getBook_name());
					
				}
			
			}
		});
		btn_search.setBounds(305, 0, 49, 34);
		btn_search.setFont(new Font("±¼¸²", Font.PLAIN, 16));
		panel.add(btn_search);
		
		
		JScrollBar scrollBar = new JScrollBar();
		springLayout.putConstraint(SpringLayout.NORTH, scrollBar, 6, SpringLayout.SOUTH, panel);
		springLayout.putConstraint(SpringLayout.SOUTH, scrollBar, 497, SpringLayout.SOUTH, panel);
		springLayout.putConstraint(SpringLayout.EAST, scrollBar, 0, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(scrollBar);
		
		JPanel bookrecommend = new JPanel();
		springLayout.putConstraint(SpringLayout.WEST, bookrecommend, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, bookrecommend, -10, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, bookrecommend, -16, SpringLayout.WEST, scrollBar);
		frame.getContentPane().add(bookrecommend);
		
		JPanel libinfo = new JPanel();
		springLayout.putConstraint(SpringLayout.WEST, libinfo, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, libinfo, -16, SpringLayout.WEST, scrollBar);
		springLayout.putConstraint(SpringLayout.NORTH, bookrecommend, 32, SpringLayout.SOUTH, libinfo);
		springLayout.putConstraint(SpringLayout.SOUTH, libinfo, 158, SpringLayout.SOUTH, panel);
		springLayout.putConstraint(SpringLayout.NORTH, libinfo, 6, SpringLayout.SOUTH, panel);
		frame.getContentPane().add(libinfo);
		
	
		
		JLabel lblNewLabel = new JLabel("Librarian's PICK");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 6, SpringLayout.SOUTH, libinfo);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 0, SpringLayout.WEST, panel);
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel, -6, SpringLayout.NORTH, bookrecommend);
		
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, -20, SpringLayout.EAST, libinfo);
		bookrecommend.setLayout(new GridLayout(3, 0, 0, 0));
		
		URL url = this.getClass().getResource("../icon/book1.PNG");
		JButton btnbook1 = new JButton(new ImageIcon(url.getPath()));
		btnbook1.setBorderPainted(false);
		btnbook1.setContentAreaFilled(false);
		btnbook1.setFocusPainted(false);
		btnbook1.setOpaque(false);
		btnbook1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		bookrecommend.add(btnbook1);
	
		
				
		URL url4 = this.getClass().getResource("../icon/book2.PNG");
		JButton btnbook2 = new JButton(new ImageIcon(url4.getPath()));
		btnbook2.setBorderPainted(false);
		btnbook2.setContentAreaFilled(false);
		btnbook2.setFocusPainted(false);
		btnbook2.setOpaque(false);
		btnbook2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		bookrecommend.add(btnbook2);
		
		URL url1 = this.getClass().getResource("../icon/book3.PNG"); 
		JButton btnbook3 = new JButton(new ImageIcon(url1.getPath()));
		btnbook3.setBorderPainted(false);
		btnbook3.setContentAreaFilled(false);
		btnbook3.setFocusPainted(false);
		btnbook3.setOpaque(false);
		btnbook3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		bookrecommend.add(btnbook3);
		
		libinfo.setLayout(new GridLayout(1, 0, 0, 0));
		
		URL url5 = this.getClass().getResource("../icon/sangrok.PNG"); 
		JLabel lib_info = new JLabel(new ImageIcon(url5.getPath()));
		libinfo.add(lib_info);
		
		lblNewLabel.setFont(new Font("Ink Free", Font.BOLD, 22));
		frame.getContentPane().add(lblNewLabel);
	}
}
