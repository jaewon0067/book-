package View;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.XYDataset;

import Model.ChartDAO;
import Model.testVO;
import java.awt.GridLayout;

public class MyJavaChart {

	private JFrame frame;
	 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyJavaChart window = new MyJavaChart();
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
	public MyJavaChart() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	/*
	 * public void createChartPanel () { JPanel jpanel = new JPanel() { Jpanel =
	 * createChartPanel(); String chartTitle = "Objects Movement Chart"; String
	 * xAxisLabel = "X"; String yAxisLabel = "Y";
	 * 
	 * XYDataset dataset = createDataset();
	 * 
	 * JFreeChart chart = ChartFactory.createXYLineChart(chartTitle, xAxisLabel,
	 * yAxisLabel, dataset);
	 * 
	 * return new ChartPanel(chart); } }
	 */
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 605, 567);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);

		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.WEST, panel, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 500, SpringLayout.NORTH, frame.getContentPane());
		panel.setBackground(Color.WHITE);
		springLayout.putConstraint(SpringLayout.NORTH, panel, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, 500, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel);

		// ���� å������ ��� ���
	
		
		ArrayList<testVO> listChart = new ArrayList<testVO>();
		
		
		ChartDAO dao = new ChartDAO();
		ArrayList<String> borrosList = dao.getBorrowList();

		ArrayList<Integer> months = new ArrayList<Integer>();
		ArrayList<Integer> cnts = new ArrayList<Integer>();

		for (int i = 0; i < borrosList.size(); i++) {
			boolean isCheck = true;
			for (int j = 0; j < months.size(); j++) {
				if (Integer.parseInt(borrosList.get(i)) == months.get(j)) {
					// ��ġ�ϴ°� �ִ�
					int cnt = cnts.get(j);
					cnt++;
					cnts.remove(j);
					cnts.add(j, cnt);
					isCheck = false;
					break;
				}
			}
			if (isCheck) {
				months.add(Integer.parseInt(borrosList.get(i)));
				cnts.add(1);
			}
			
			
		}

		// �� months.get(i) ���� cnts.get(i)
//		for(int i = 0; i < months.size(); i++) {
//			System.out.print(months.get(i)+"�� : ");
//			System.out.println(cnts.get(i)+"��");
//		}

		for (int i = 0; i < months.size(); i++) {
			listChart.add(new testVO(months.get(i), cnts.get(i)));		
		}
		
		System.out.println(months);
		Collections.sort(months);
		System.out.println(months);
	//------------------����� ������	
		
		DefaultCategoryDataset dataset1 = new DefaultCategoryDataset();

		// �׷����� ���� �߰��ϴ� �ڵ�
		// 1.�׷��� ũ�� 2.���� 3.x�� �̸�
		for (int i = 0; i < months.size(); i++) {
			dataset1.addValue(listChart.get(i).getCnts()/4, "1~6", listChart.get(i).getMonths()+"");
		}
		
		// �׷����� �׷��ִ� ��ü dataset�� �־��ش�
		// 1.�׷�������(���) 2.x�� ���� 3.y������ 4.�׷��� ������ 5.�׷��� ����/���� �Ұ��� 6~8.�׷����� ���
		JFreeChart barChart = ChartFactory.createBarChart("��ü ����� ������", "��", "������", dataset1, PlotOrientation.VERTICAL,
				true, // HORIZONTAL
				true, true);
		
		JFreeChart linechart = ChartFactory.createLineChart("��ü ����� ������", "��", "������", dataset1, PlotOrientation.VERTICAL, false, false, false);

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
		//panel.add(chartPanel2);
		//----------------------------
		
		//---------------20�뿩���� ���� ���� ����
		


	}

}
