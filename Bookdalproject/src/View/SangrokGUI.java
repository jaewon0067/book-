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
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import Controller.BookVO;
import Controller.LibraryManagementSystem;
import Model.Member_LibraryVo;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.BorderLayout;

public class SangrokGUI {

   private JFrame frame;
   private JTextField search;
   private LibraryManagementSystem controller = new LibraryManagementSystem();
//   public ArrayList<BookVO> searchresult = new ArrayList();

   /**
    * Launch the application.
    */
//   public static void main(String[] args) {
//      EventQueue.invokeLater(new Runnable() {
//         public void run() {
//            try {
//               SangrokGUI window = new SangrokGUI();
//               window.frame.setVisible(true);
//            } catch (Exception e) {
//               e.printStackTrace();
//            }
//         }
//      });
//   }

   /**
    * Create the application.
    */
   public SangrokGUI(Member_LibraryVo user) {
      initialize(user);

   }

   /**
    * Initialize the contents of the frame.
    */
   private void initialize(Member_LibraryVo user) {
      frame = new JFrame();
      frame.setBounds(100, 100, 390, 600);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      SpringLayout springLayout = new SpringLayout();
      frame.getContentPane().setLayout(springLayout);

      JPanel panel = new JPanel();
      springLayout.putConstraint(SpringLayout.NORTH, panel, 10, SpringLayout.NORTH, frame.getContentPane());
      springLayout.putConstraint(SpringLayout.WEST, panel, 10, SpringLayout.WEST, frame.getContentPane());
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
            LibrarySearchGUI l = new LibrarySearchGUI(searchbook, user);
//            searchresult = controller.getSearchBook(searchbook);
//            LibrarySearchGUI searchpage = new LibrarySearchGUI();
//            searchpage.frame.setVisible(true);         
//            LibrarySearchGUI.main(null);
//            for (int j = 0; j < searchresult.size(); j++) {
//               System.out.println(searchresult.get(j).getBook_name());
//               
//            }

//            ArrayList<BookVO> searchresult = controller.getSearchBook(searchbook);
//            for (int j = 0; j < searchresult.size(); j++) {
//               System.out.println(searchresult.get(j).getBook_name());
//
//            }
         }
      });
      btn_search.setBounds(305, 0, 49, 34);
      btn_search.setFont(new Font("굴림", Font.PLAIN, 16));
      panel.add(btn_search);

      JPanel bookrecommend = new JPanel();
      springLayout.putConstraint(SpringLayout.WEST, bookrecommend, 10, SpringLayout.WEST, frame.getContentPane());
      springLayout.putConstraint(SpringLayout.SOUTH, bookrecommend, -10, SpringLayout.SOUTH, frame.getContentPane());
      springLayout.putConstraint(SpringLayout.EAST, bookrecommend, 0, SpringLayout.EAST, panel);

      // frame.getContentPane().add(bookrecommend);

      JPanel libinfo = new JPanel();
      springLayout.putConstraint(SpringLayout.NORTH, libinfo, 60, SpringLayout.NORTH, frame.getContentPane());
      springLayout.putConstraint(SpringLayout.WEST, libinfo, 10, SpringLayout.WEST, frame.getContentPane());
      springLayout.putConstraint(SpringLayout.EAST, libinfo, -10, SpringLayout.EAST, frame.getContentPane());
      springLayout.putConstraint(SpringLayout.SOUTH, panel, -6, SpringLayout.NORTH, libinfo);
      springLayout.putConstraint(SpringLayout.EAST, panel, 0, SpringLayout.EAST, libinfo);
      springLayout.putConstraint(SpringLayout.NORTH, bookrecommend, 32, SpringLayout.SOUTH, libinfo);
      frame.getContentPane().add(libinfo);

      JLabel lblNewLabel = new JLabel("Librarian's PICK");
      springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 218, SpringLayout.NORTH, frame.getContentPane());
      springLayout.putConstraint(SpringLayout.SOUTH, libinfo, -6, SpringLayout.NORTH, lblNewLabel);
      springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 10, SpringLayout.WEST, frame.getContentPane());
      springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, -53, SpringLayout.EAST, frame.getContentPane());

      // ------------------------------

      URL url = this.getClass().getResource("../icon/book1.PNG");

      // <이미지 사이즈 수정하기>

      Image originImg = new ImageIcon(url.getPath()).getImage();

      originImg = originImg.getScaledInstance(50, 50, Image.SCALE_SMOOTH);

      ImageIcon Icon = new ImageIcon(originImg);

      JButton btnbook1 = new JButton(new ImageIcon(url.getPath()));
      btnbook1.setBounds(0, 0, 355, 57);
      btnbook1.setBorderPainted(false);
      btnbook1.setContentAreaFilled(false);
      btnbook1.setFocusPainted(false);
      btnbook1.setOpaque(false);
      btnbook1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            book1GUI book1gui = new book1GUI();
            frame.setVisible(true);
            book1gui.setNum(2);
         }
      });
      bookrecommend.setLayout(null);
      bookrecommend.add(btnbook1);

      URL url4 = this.getClass().getResource("../icon/book2.PNG");
      JButton btnbook2 = new JButton(new ImageIcon(url4.getPath()));
      btnbook2.setBounds(0, 62, 355, 57);
      btnbook2.setBorderPainted(false);
      btnbook2.setContentAreaFilled(false);
      btnbook2.setFocusPainted(false);
      btnbook2.setOpaque(false);
      btnbook2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            book1GUI book1gui = new book1GUI();
            book1gui.setNum(8);
            frame.setVisible(true);

         }
      });
      bookrecommend.add(btnbook2);

      URL url1 = this.getClass().getResource("../icon/book3.PNG");
      JButton btnbook3 = new JButton(new ImageIcon(url1.getPath()));
      btnbook3.setBounds(0, 124, 355, 57);
      btnbook3.setBorderPainted(false);
      btnbook3.setContentAreaFilled(false);
      btnbook3.setFocusPainted(false);
      btnbook3.setOpaque(false);
      btnbook3.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            book1GUI book1gui = new book1GUI();
            book1gui.setNum(5);
            frame.setVisible(true);
         }
      });
      bookrecommend.add(btnbook3);

      URL urlcha = this.getClass().getResource("../icon/book4.PNG");
      JButton btnbook4 = new JButton(new ImageIcon(urlcha.getPath()));
      btnbook4.setBounds(0, 186, 355, 57);
      btnbook4.setBorderPainted(false);
      btnbook4.setContentAreaFilled(false);
      btnbook4.setFocusPainted(false);
      btnbook4.setOpaque(false);
      btnbook4.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            book1GUI book1gui = new book1GUI();
            frame.setVisible(true);
            book1gui.setNum(1);
         }
      });
      bookrecommend.add(btnbook4);
      // ---------
      URL urlnar = this.getClass().getResource("../icon/book6.PNG");
      JButton btnbook5 = new JButton(new ImageIcon(urlnar.getPath()));
      btnbook5.setBounds(0, 248, 355, 57);
      btnbook5.setBorderPainted(false);
      btnbook5.setContentAreaFilled(false);
      btnbook5.setFocusPainted(false);
      btnbook5.setOpaque(false);
      btnbook5.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            book1GUI book1gui = new book1GUI();
            frame.setVisible(true);
            book1gui.setNum(6);
         }
      });
      bookrecommend.add(btnbook5);

      URL url5 = this.getClass().getResource("../icon/sangrok.PNG");
      libinfo.setLayout(null);
      JLabel lib_info = new JLabel(new ImageIcon(url5.getPath()));
      lib_info.setBounds(0, 0, 354, 164);
      libinfo.add(lib_info);
      //-----------------------------------------

      lblNewLabel.setFont(new Font("Ink Free", Font.BOLD, 22));
      frame.getContentPane().add(lblNewLabel);

      Dimension size = new Dimension();// 사이즈를 지정하기 위한 객체 생성
      bookrecommend.setPreferredSize(size);
      size.setSize(300, 330);// 객체의 사이즈를 지정

      JScrollPane scrollPane = new JScrollPane();
      springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel, -6, SpringLayout.NORTH, scrollPane);
      springLayout.putConstraint(SpringLayout.SOUTH, scrollPane, -10, SpringLayout.SOUTH, frame.getContentPane());
      springLayout.putConstraint(SpringLayout.NORTH, scrollPane, 244, SpringLayout.NORTH, frame.getContentPane());
      springLayout.putConstraint(SpringLayout.WEST, scrollPane, 10, SpringLayout.WEST, frame.getContentPane());
      springLayout.putConstraint(SpringLayout.EAST, scrollPane, -33, SpringLayout.EAST, frame.getContentPane());

      scrollPane.setViewportView(bookrecommend);

      frame.getContentPane().add(scrollPane);
   }
}