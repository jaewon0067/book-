package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

import Controller.LibraryManagementSystem;
import Model.Member_LibraryVo;
import Model.TableDAO;
import Model.TableVo;

import java.awt.GridLayout;
import java.awt.CardLayout;
import javax.swing.JScrollPane;

public class LibraryHomeGUI {

   private JFrame frame;
   private JButton btn_Lib;
   private JTable table;
   public static LibraryManagementSystem controller = new LibraryManagementSystem();
   private JLabel lbl_forName;
   private JLabel loginUser;
   private JLabel lblNewLabel_1;
   private JSeparator separator;


   private JLabel lblNewLabel_2;
   private JSeparator separator_2;
   private JLabel lblNewLabel_3;
   private JLabel back;

   private JPanel panel_2;
   private JButton library2;

   private JLabel back_1;
   private JLabel lblNewLabel_4;
   private JButton list;
   private JButton cart;
   private JButton mypage;
   private JButton delivery;
   private JButton home;
   private JPanel panel_3;
   private JTable put_table;
   private TableDAO dao = new TableDAO();
   private JTable table_1;

   public LibraryHomeGUI(Member_LibraryVo user) {
      initialize(user);
      frame.setVisible(true);
      JPanel panel = new JPanel();

      panel.setBackground(new Color(245, 245, 245));
      panel.setBounds(29, 26, 314, 57);

      frame.getContentPane().add(panel);
      panel.setLayout(null);
      
      panel_3 = new JPanel();
      panel_3.setBounds(29, 104, 357, 213);
      frame.getContentPane().add(panel_3);
      panel_3.setLayout(null);
      
      JScrollPane scrollPane = new JScrollPane();
      scrollPane.setBounds(0, 0, 357, 213);
      String []title = {"ID", "반납기한", "책 제목", "소장 도서관"};
      DefaultTableModel model = new DefaultTableModel(title, 0);
      model = dao.getTable(user);
      table = new JTable(model);
      scrollPane.setViewportView(table);
      panel_3.add(scrollPane);

      lblNewLabel_1 = new JLabel("\uB2D8 \uD658\uC601\uD569\uB2C8\uB2E4");
      lblNewLabel_1.setFont(new Font("HY중고딕", Font.BOLD, 20));
      lblNewLabel_1.setBounds(147, 11, 148, 30);
      panel.add(lblNewLabel_1);

      lblNewLabel_4 = new JLabel("New label");
      lblNewLabel_4.setFont(new Font("함초롬돋움", Font.BOLD, 16));
      lblNewLabel_4.setBounds(42, 12, 82, 28);
      panel.add(lblNewLabel_4);
      lblNewLabel_4.setText(user.getName());

      separator = new JSeparator();
      separator.setBackground(UIManager.getColor("Button.light"));
      separator.setBounds(29, 104, 314, 1);
      frame.getContentPane().add(separator);

      lblNewLabel_2 = new JLabel("\uB300\uCD9C\uBAA9\uB85D");
      lblNewLabel_2.setFont(new Font("HY목각파임B", Font.BOLD, 15));
      lblNewLabel_2.setBounds(29, 82, 88, 23);
      frame.getContentPane().add(lblNewLabel_2);

      separator_2 = new JSeparator();
      separator_2.setBackground(SystemColor.controlHighlight);
      separator_2.setBounds(28, 371, 334, -3);
      frame.getContentPane().add(separator_2);

      lblNewLabel_3 = new JLabel("\uB098\uC758 \uB3C4\uC11C\uAD00");
      lblNewLabel_3.setFont(new Font("HY헤드라인M", Font.BOLD, 14));
      lblNewLabel_3.setBounds(29, 333, 88, 23);
      frame.getContentPane().add(lblNewLabel_3);

      URL url__1 = this.getClass().getResource("../icon/background.PNG");

      back = new JLabel(new ImageIcon(url__1.getPath()));
      back.setBounds(0, 0, 415, 564);
      frame.getContentPane().add(back);

      URL url__2 = this.getClass().getResource("../icon/1.PNG");

      back_1 = new JLabel(new ImageIcon(url__2.getPath()));
      back_1.setBounds(0, 564, 415, 64);
      frame.getContentPane().add(back_1);
      
     
      
      
      
     
   }

   /**
    * Initialize the contents of the frame.
    * 
    * @param user
    */
   private void initialize(Member_LibraryVo user) {

      frame = new JFrame();
      frame.setBackground(new Color(230, 230, 250));
      frame.getContentPane().setBackground(new Color(255, 255, 255));

      frame.setBounds(100, 100, 428, 667);

      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      frame.getContentPane().setLayout(null);
      
      JSeparator separator_1 = new JSeparator();
      separator_1.setBackground(SystemColor.controlHighlight);
      separator_1.setBounds(29, 360, 314, 1);
      frame.getContentPane().add(separator_1);

      JPanel panel_1 = new JPanel();
      panel_1.setBounds(0, 564, 415, 64);
      frame.getContentPane().add(panel_1);
      panel_1.setLayout(new GridLayout(0, 5, 5, 0));

      URL home_1 = this.getClass().getResource("../icon/hohome.PNG");
      home = new JButton(new ImageIcon(home_1.getPath()));
      home.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
         }
      });
      panel_1.add(home);

      URL list_1 = this.getClass().getResource("../icon/list.PNG");
      list = new JButton(new ImageIcon(list_1.getPath()));
      list.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
         }
      });
      panel_1.add(list);

      URL cart_1 = this.getClass().getResource("../icon/cart.PNG");
      cart = new JButton(new ImageIcon(cart_1.getPath()));
      cart.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
         }
      });

      panel_1.add(cart);

      URL mypage_1 = this.getClass().getResource("../icon/mypage.PNG");
      mypage = new JButton(new ImageIcon(mypage_1.getPath()));
      mypage.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
        	 MyPage myPage = new MyPage(user);
         }
      });
      panel_1.add(mypage);

      URL delivery_1 = this.getClass().getResource("../icon/de.PNG");
      delivery = new JButton(new ImageIcon(delivery_1.getPath()));
      delivery.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
         }
      });
      panel_1.add(delivery);

      panel_2 = new JPanel();
      panel_2.setBounds(39, 371, 271, 70);
      frame.getContentPane().add(panel_2);
      panel_2.setLayout(new GridLayout(0, 3, 10, 0));

      URL url__1 = this.getClass().getResource("../icon/library1.PNG");
      JButton libaray_1 = new JButton(new ImageIcon(url__1.getPath()));
      libaray_1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
         }
      });
      panel_2.add(libaray_1);

// ----------------------------------------------------------------------

      URL url__2 = this.getClass().getResource("../icon/library2.PNG");
      JButton libaray_2 = new JButton(new ImageIcon(url__2.getPath()));

      libaray_2.addActionListener(new ActionListener() {

         public void actionPerformed(ActionEvent e) {
        	 snagrok sangrok = new snagrok(user);
         }
      });

      panel_2.add(libaray_2);
//---------------------------------------------------------------------------

      URL url__3 = this.getClass().getResource("../icon/library3.PNG");
      JButton library_3 = new JButton(new ImageIcon(url__3.getPath()));

      library_3.addActionListener(new ActionListener() {

         public void actionPerformed(ActionEvent e) {
         }
      });
      panel_2.add(library_3);

   }
}