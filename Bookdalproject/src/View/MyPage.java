package View;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import Model.Member_LibraryDAO;
import Model.Member_LibraryVo;
import Model.TableDAO;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import Model.ChartDAO;
import Model.getbookName_dateVO;
import Model.testVO;
import javax.swing.JTable;

import Controller.LibraryManagementSystem;

import java.awt.GridLayout;
import javax.swing.JButton;

public class MyPage {

	private JFrame frame;
	public static LibraryManagementSystem controller = new LibraryManagementSystem();
	private JLabel lbl_address;
	private JLabel lbl_phone;
	private JLabel lbl_gender;
	private JLabel lbl_age;
	private JLabel lbl_name;
	private JTable put_table;
	private JTable table;
	private TableDAO dao = new TableDAO();

	public MyPage(Member_LibraryVo user) {
		initialize(user);
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(Member_LibraryVo user) {

		frame = new JFrame();
		frame.setBounds(100, 100, 388, 600);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		SpringLayout springLayout = new SpringLayout();

		String path = "../icon/mypageback.PNG";

		URL back = this.getClass().getResource(path);
		Image originImg = new ImageIcon(back.getPath()).getImage();
		originImg = originImg.getScaledInstance(374, 561, Image.SCALE_SMOOTH);
		ImageIcon Icon = new ImageIcon(originImg);
//<<<<<<< HEAD

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

//=======

		lbl_name = new JLabel("New label");
		lbl_name.setBounds(203, 84, 57, 15);
		frame.getContentPane().add(lbl_name);
		lbl_name.setText(user.getName());

		lbl_age = new JLabel("New label");
		lbl_age.setBounds(192, 109, 57, 15);
		frame.getContentPane().add(lbl_age);
		lbl_age.setText(user.getAge());

		lbl_gender = new JLabel("New label");
		lbl_gender.setBounds(214, 134, 57, 15);
		frame.getContentPane().add(lbl_gender);
		lbl_gender.setText(user.getGender());

		lbl_phone = new JLabel("New label");
		lbl_phone.setBounds(203, 160, 57, 15);
		frame.getContentPane().add(lbl_phone);
		lbl_phone.setText(user.getPhone());

		lbl_address = new JLabel("New label");
		lbl_address.setBounds(224, 185, 57, 15);
		frame.getContentPane().add(lbl_address);
		lbl_address.setText(user.getAddr());

//>>>>>>> branch 'master' of https://github.com/jaewon0067/book-.git
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

//<<<<<<< HEAD
		JPanel readingState_panel = new JPanel();
		readingState_panel.setBounds(26, 246, 320, 176);
		springLayout.putConstraint(SpringLayout.WEST, readingState_panel, 10, SpringLayout.WEST,
				frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, readingState_panel, 500, SpringLayout.NORTH,
				frame.getContentPane());
		readingState_panel.setBackground(Color.WHITE);
		springLayout.putConstraint(SpringLayout.NORTH, readingState_panel, 10, SpringLayout.NORTH,
				frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, readingState_panel, 500, SpringLayout.WEST,
				frame.getContentPane());
		frame.getContentPane().add(readingState_panel);
		readingState_panel.setLayout(null);

		ArrayList<testVO> listChart = new ArrayList<testVO>();

		ChartDAO dao = new ChartDAO();
		ArrayList<String> borrowList = dao.getBorrowList();

		ArrayList<Integer> months = new ArrayList<Integer>();
		ArrayList<Integer> cnts = new ArrayList<Integer>();

		for (int i = 0; i < borrowList.size(); i++) {
			boolean isCheck = true;
			for (int j = 0; j < months.size(); j++) {
				if (Integer.parseInt(borrowList.get(i)) == months.get(j)) {
					// 일치하는게 있다
					int cnt = cnts.get(j);
					cnt++;
					cnts.remove(j);
					cnts.add(j, cnt);
					isCheck = false;
					break;
				}
			}
			if (isCheck) {
				months.add(Integer.parseInt(borrowList.get(i)));
				cnts.add(1);
			}

		}

		// 월 months.get(i) 갯수 cnts.get(i)
//				for(int i = 0; i < months.size(); i++) {
//					System.out.print(months.get(i)+"월 : ");
//					System.out.println(cnts.get(i)+"개");
//				}

		for (int i = 0; i < months.size(); i++) {
			listChart.add(new testVO(months.get(i), cnts.get(i)));
		}

		System.out.println(months);
		Collections.sort(months);
		System.out.println(months);
		// ------------------월평균 독서량

		DefaultCategoryDataset dataset1 = new DefaultCategoryDataset();

		// 그래프에 값을 추가하는 코드
		// 1.그래프 크기 2.범례 3.x축 이름
		for (int i = 0; i < months.size(); i++) {
			dataset1.addValue(listChart.get(i).getCnts() / 4, "1~6", listChart.get(i).getMonths() + "");
		}

		// 그래프를 그려주는 객체 dataset을 넣어준다
		// 1.그래프제목(상단) 2.x축 제목 3.y축제목 4.그래프 데이터 5.그래프 가로/세로 할건지 6~8.그래프의 기능
		JFreeChart barChart = ChartFactory.createBarChart("전체 월평균 독서량", "월", "독서량", dataset1, PlotOrientation.VERTICAL,
				true, // HORIZONTAL
				true, true);

		JFreeChart linechart = ChartFactory.createLineChart("전체 월평균 독서량", "월", "독서량", dataset1,
				PlotOrientation.VERTICAL, false, false, false);

		// 한글을 적용하기 위한 Font 객체 생성
		// 1.폰트종류 2.폰트타입 3.크기
		Font f = new Font("gulim", Font.BOLD, 14);
		barChart.getTitle().setFont(f);
		linechart.getTitle().setFont(f);

		CategoryPlot plot1 = barChart.getCategoryPlot();
		CategoryPlot plot2 = linechart.getCategoryPlot();

		plot2.getDomainAxis().setLabelFont(f);
		plot1.getDomainAxis().setLabelFont(f); // x축

		plot2.getRangeAxis().setLabelFont(f);
		plot2.getRangeAxis().setTickLabelFont(f);
		plot1.getRangeAxis().setLabelFont(f); // y축
		plot1.getRangeAxis().setTickLabelFont(f);

		ChartPanel chartPanel = new ChartPanel(barChart);
		ChartPanel chartPanel2 = new ChartPanel(linechart);
		readingState_panel.setLayout(new GridLayout(0, 1, 0, 0));

		readingState_panel.add(chartPanel);

		JButton recommand_btn = new JButton("\uB098\uC5D0\uAC8C \uB9DE\uB294 \uB3C4\uC11C \uCD94\uCC9C\uBC1B\uAE30");
		recommand_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MyJavaChart.main(null);

			}
		});
		recommand_btn.setFont(new Font("배달의민족 주아", Font.PLAIN, 18));
		recommand_btn.setBounds(66, 442, 234, 23);
		frame.getContentPane().add(recommand_btn);

		JLabel back_label = new JLabel(Icon);
		back_label.setBounds(0, 0, 374, 564);
		frame.getContentPane().add(back_label);

		// ChartDAO dao = new ChartDAO();

//		for (int i = 1; i <= 6; i++) {
//			ArrayList<getbookName_dateVO> list1 = dao.getbookName_date1(i);
//			int cnt = list1.size()+1;
//			System.out.println(cnt);
//		}

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(30, 244, 315, 195);
		frame.getContentPane().add(panel_1);

//	put_table = new JTable();
//		put_table=dao.getTable(user);
//		panel_1.add(table);
//		

	}
}
