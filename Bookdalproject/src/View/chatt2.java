package View;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class chatt2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					chatt2 window = new chatt2();
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
	public chatt2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		DefaultCategoryDataset dataset1 = new DefaultCategoryDataset();

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
//		plot1.getDomainAxis().setTickLabelFont(f);

		plot2.getRangeAxis().setLabelFont(f);
		plot2.getRangeAxis().setTickLabelFont(f);
		plot1.getRangeAxis().setLabelFont(f); // y축
		plot1.getRangeAxis().setTickLabelFont(f);

		ChartPanel chartPanel = new ChartPanel(barChart);
		ChartPanel chartPanel2 = new ChartPanel(linechart);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		// ChartPanel chartPanel = new ChartPanel(pieChart);

		// 크기지정
		chartPanel.setPreferredSize(new java.awt.Dimension(100, 100));

		panel.add(chartPanel);
		// panel.add(chartPanel2);
		// ----------------------------

		// ---------------20대여성이 많이 읽은 도서
	}

}
