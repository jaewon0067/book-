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

		// �׷����� �׷��ִ� ��ü dataset�� �־��ش�
		// 1.�׷�������(���) 2.x�� ���� 3.y������ 4.�׷��� ������ 5.�׷��� ����/���� �Ұ��� 6~8.�׷����� ���
		JFreeChart barChart = ChartFactory.createBarChart("��ü ����� ������", "��", "������", dataset1, PlotOrientation.VERTICAL,
				true, // HORIZONTAL
				true, true);

		JFreeChart linechart = ChartFactory.createLineChart("��ü ����� ������", "��", "������", dataset1,
				PlotOrientation.VERTICAL, false, false, false);

		// �ѱ��� �����ϱ� ���� Font ��ü ����
		// 1.��Ʈ���� 2.��ƮŸ�� 3.ũ��
		Font f = new Font("gulim", Font.BOLD, 14);
		barChart.getTitle().setFont(f);
		linechart.getTitle().setFont(f);

		CategoryPlot plot1 = barChart.getCategoryPlot();
		CategoryPlot plot2 = linechart.getCategoryPlot();

		plot2.getDomainAxis().setLabelFont(f);
		plot1.getDomainAxis().setLabelFont(f); // x��
//		plot1.getDomainAxis().setTickLabelFont(f);

		plot2.getRangeAxis().setLabelFont(f);
		plot2.getRangeAxis().setTickLabelFont(f);
		plot1.getRangeAxis().setLabelFont(f); // y��
		plot1.getRangeAxis().setTickLabelFont(f);

		ChartPanel chartPanel = new ChartPanel(barChart);
		ChartPanel chartPanel2 = new ChartPanel(linechart);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		// ChartPanel chartPanel = new ChartPanel(pieChart);

		// ũ������
		chartPanel.setPreferredSize(new java.awt.Dimension(100, 100));

		panel.add(chartPanel);
		// panel.add(chartPanel2);
		// ----------------------------

		// ---------------20�뿩���� ���� ���� ����
	}

}
