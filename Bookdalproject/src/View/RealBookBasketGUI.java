package View;

import java.awt.Color;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.net.URL;
import java.text.SimpleDateFormat;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import Model.Member_LibraryDAO;
import Controller.LibraryManagementSystem;
import Model.Member_LibraryVo;
import Model.TableDAO;

import javax.swing.JScrollPane;
import java.awt.FlowLayout;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;

public class RealBookBasketGUI {
	private Member_LibraryDAO dao_1 = new Member_LibraryDAO();	
	private JFrame frame;
	 private JTable table;
	   public static LibraryManagementSystem controller = new LibraryManagementSystem();
	private JTable put_table;
	   private TableDAO dao = new TableDAO();
	   private JTable table_1;
	   private String table_values;
	   private int row;

	public RealBookBasketGUI(Member_LibraryVo user) {
		initialize(user);
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(Member_LibraryVo user) {
		frame = new JFrame();
		frame.setBounds(100, 100, 412, 638);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame = new JFrame();
		frame.setBounds(100, 100, 1238, 638);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1222, 599);
		frame.getContentPane().add(panel);
		
		URL url__1 = this.getClass().getResource("../icon/back2.PNG");
		
		  SimpleDateFormat format1 = new SimpleDateFormat ("yyyy-MM-dd");
	      String today = format1.format(System.currentTimeMillis());
	      long retd = System.currentTimeMillis()+1296000000;
	      String returndate = format1.format(retd);
	      long gap = (retd-System.currentTimeMillis())/86400000;
				panel.setLayout(null);
				
				JPanel panel_3 = new JPanel();
				panel_3.setBounds(24, 111, 1186, 323);
				panel.add(panel_3);
				panel_3.setLayout(new GridLayout(1, 0, 0, 0));
				
				JScrollPane scrollPane = new JScrollPane();
			      scrollPane.setBounds(0, 0, 357, 213);
			      String []title = {"책 제목", "책 식별번호", "작가", "츨판사", "소장 도서관"};
			      DefaultTableModel model_book = new DefaultTableModel(title, 0);
			      model_book = dao.getBookTable(user);
			      table = new JTable(model_book);
			      table.addMouseListener(new MouseAdapter() {
			      	@Override
			      	
			      	public void mouseClicked(MouseEvent e) {
			      		
			    	    row = table.rowAtPoint(e.getPoint());
					    System.out.println(row+"행");
					    // 열의 위치
					    int col = table.columnAtPoint(e.getPoint());
					    System.out.println(col+"열");
					 
						table_values = (String) table.getValueAt(row, col);

			      		
			      	}
			      });
			      scrollPane.setViewportView(table);
			      panel_3.add(scrollPane);
				
				JPanel panel_1 = new JPanel();
				panel_1.setBounds(24, 20, 1186, 62);
				panel.add(panel_1);
				panel_1.setLayout(new GridLayout(1, 0, 0, 0));
				
				JLabel lblNewLabel_2 = new JLabel("\uBD81\uBC14\uAD6C\uB2C8 \uC0AC\uC9C4 \uB123\uC5B4\uC8FC\uC138\uC694");
				panel_1.add(lblNewLabel_2);
				
				JButton btnNewButton_5 = new JButton("(\uBC30\uB2EC\uBE44 2000\uC6D0) \uB300\uCD9C\uD558\uAE30");
				btnNewButton_5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						String user_id = user.getId();
						System.out.println(user_id);
						int num = ((DefaultTableModel)table.getModel()).getRowCount();
						System.out.println(num);
						for (int i = 0; i < num; i++) {
							String deletebookcode=(String)((DefaultTableModel)table.getModel()).getValueAt(0, 0);
							String deletebooklib=(String)((DefaultTableModel)table.getModel()).getValueAt(0, 4);
							boolean yes = controller.todeli(deletebookcode, user, deletebooklib);
							if( yes ) {
//								System.out.println("대출 성공");
//								JOptionPane.showMessageDialog(frame, "대출되었습니다. 라이더가 호출됩니다.");
								((DefaultTableModel)table.getModel()).removeRow(row);
								boolean empty = controller.emptybookcart(user);
								
							} else {
								System.out.println("대출 실패");
								JOptionPane.showMessageDialog(frame, "모종의 이유로 실패", "Inane error", JOptionPane.ERROR_MESSAGE);
							} 
						}
						
						System.out.println("대출 성공");
						JOptionPane.showMessageDialog(frame, "대출되었습니다. 라이더가 호출됩니다.");
					}
						
						//북바구니 DB에 있는 모든 Member_ID에 맞는 
						//북바구니 DB에서 BookcartbookVO 객체로 받아왔을 것임.
						//그것을 userid가 지금 현재 로그인 아이디인걸 찾아서 검색 전부 다(지금은) DeliDB에다가 추가해서 넣어주는 과정
						//그리고서는 북바구니DB에서는 삭제. -동규오빠네거랑 비슷하네 
						//Deli_info는 (ordernumber, userID, book_name, addr ,age, gender, charge, nowlocation, returnday, lib_name, borrowdate)
						//BookcartbookVO(String member_ID, String member_Name, String book_Name, String book_ID, String author,
						//String publisher, String library, String status)
				
						

					
				});
				btnNewButton_5.setFont(new Font("배달의민족 주아", Font.PLAIN, 14));
				btnNewButton_5.setBounds(454, 480, 351, 47);
				panel.add(btnNewButton_5);
				
				JPanel panel_2 = new JPanel();
				panel_2.setBounds(24, 444, 1186, 25);
				panel.add(panel_2);
				panel_2.setLayout(new GridLayout(1, 0, 0, 0));
				
				JLabel lblNewLabel_1 = new JLabel("= \uCD1D ?????\uAD8C \uB300\uCD9C");
				lblNewLabel_1.setFont(new Font("배달의민족 주아", Font.PLAIN, 20));
				lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
				panel_2.add(lblNewLabel_1);
				lblNewLabel_1.setText("총" + " " + dao_1.booknumber(user)+ "개");
				
				JLabel lblNewLabel = new JLabel("\uC804\uCCB4 \uBAA9\uB85D");
				lblNewLabel.setFont(new Font("배달의민족 주아", Font.PLAIN, 18));
				lblNewLabel.setBounds(34, 86, 246, 25);
				panel.add(lblNewLabel);
				
				JPanel panel_4 = new JPanel();
				panel_4.setBounds(0, 537, 1222, 62);
				panel_4.setBackground(new Color(255, 0,0,0));
				panel_4.setOpaque(false);
				panel.add(panel_4);
				panel_4.setLayout(new GridLayout(0, 5, 0, 0));
				
				JButton 홈으로 = new JButton("");
				홈으로.setBorderPainted(false);
				홈으로.setContentAreaFilled(false);
				홈으로.setFocusPainted(false);
				홈으로.setOpaque(false);
				홈으로.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						LibraryHomeGUI home = new LibraryHomeGUI(user); //왜 에러뜨지?
					}
				});
				panel_4.add(홈으로);
				
				JButton 독서내역으로 = new JButton("");
				독서내역으로.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				독서내역으로.setBorderPainted(false);
				독서내역으로.setContentAreaFilled(false);
				독서내역으로.setFocusPainted(false);
				독서내역으로.setOpaque(false);
				panel_4.add(독서내역으로);
				
				JButton 북바구니로 = new JButton("");
				북바구니로.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				북바구니로.setBorderPainted(false);
				북바구니로.setContentAreaFilled(false);
				북바구니로.setFocusPainted(false);
				북바구니로.setOpaque(false);
				panel_4.add(북바구니로);
				
				JButton 마이페이지로 = new JButton("");
				마이페이지로.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					//	LibraryMyPage mypage = new LibraryMyPage();
					}
				});
				마이페이지로.setBorderPainted(false);
				마이페이지로.setContentAreaFilled(false);
				마이페이지로.setFocusPainted(false);
				마이페이지로.setOpaque(false);
				panel_4.add(마이페이지로);
				
				JButton btnNewButton_4 = new JButton("");
				btnNewButton_4.setBorderPainted(false);
				btnNewButton_4.setContentAreaFilled(false);
				btnNewButton_4.setFocusPainted(false);
				btnNewButton_4.setOpaque(false);
				panel_4.add(btnNewButton_4);
				
				JButton btnNewButton = new JButton("\uBD81\uBC14\uAD6C\uB2C8\uC5D0\uC11C \uC0AD\uC81C");
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						boolean success = controller.removefrombookbasket(table_values, user);
						if( success ) {
							System.out.println("지우기 성공");
							JOptionPane.showMessageDialog(frame, "지워졌습니다.");
							((DefaultTableModel)table.getModel()).removeRow(row);
							
						} else {
							System.out.println("지우기 실패");
							JOptionPane.showMessageDialog(frame, "지우기 실패", "Inane error", JOptionPane.ERROR_MESSAGE);
							} 
						}
				});
				btnNewButton.setBounds(24, 480, 173, 47);
				panel.add(btnNewButton);
				
				
	}
}
