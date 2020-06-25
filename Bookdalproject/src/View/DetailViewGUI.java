package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Model.Member_LibraryVo;
import Model.TableDAO;
import java.awt.CardLayout;

public class DetailViewGUI {

	private JFrame frame;

	private JPanel panel_3;
	   private JTable put_table;
	   private TableDAO dao = new TableDAO();
	   private JTable table_1;
	
	public DetailViewGUI(Member_LibraryVo user) {
		initialize(user);
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(Member_LibraryVo user) {
		frame = new JFrame();
		frame.setBounds(100, 100, 845, 541);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 805, 406);
		frame.getContentPane().add(panel);
		
		
		JScrollPane scrollPane = new JScrollPane();
	      scrollPane.setBounds(0, 0, 600, 600);
	      String []title = {"ID", "반납기한", "책 제목", "소장 도서관"};
	      DefaultTableModel model = new DefaultTableModel(title, 0);
	      model = dao.getTable(user);
	      panel.setLayout(new CardLayout(0, 0));
	      table_1 = new JTable(model);
	      scrollPane.setViewportView(table_1);
	      
		panel.add(scrollPane, "name_871067057798100");
	}

}
