package Model;

import java.awt.Color;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import org.jfree.data.general.DefaultPieDataset;

public class JavaChart {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaChart window = new JavaChart();
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
	public JavaChart() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		springLayout.putConstraint(SpringLayout.NORTH, panel, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 492, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, 990, SpringLayout.WEST, frame.getContentPane());

		frame.getContentPane().add(panel);
		Read_CSV readcsv = new Read_CSV();
		ArrayList<ChartVO> list = readcsv.getList();
		
		//그래프를 그릴 때 그래프를 정의하는 객체
		DefaultPieDataset dataset1 = new DefaultPieDataset();
		
//		private String id;
//		private String bookName;
//		private String age;
//		private String gender;
//		private String borrow_date;
		
		for (int i = 0; i < list.size(); i++) {
			dataset1.addValue(list.get(i).getId(), list.get(i).getBookName(), list.get(i).getAge(), list.get(i).getGender(), list.get(i).getBorrow_date());
		}
	}

}
