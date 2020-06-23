package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.print.DocFlavor.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import Controller.LibraryManagementSystem;
import Model.Member_LibraryVo;

import java.awt.GridLayout;

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
   private JButton btnNewButton;
   private JPanel panel_2;
   private JButton btnNewButton_1;
   private JButton btnNewButton_2;
   private JButton btnNewButton_3;
   private JLabel back_1;
   private JButton btn_1;
   private JButton btn_2;
   private JButton btn_3;
   private JButton btn_4;
   private JButton btn_5;
   private JLabel lblNewLabel_4;

   public LibraryHomeGUI(Member_LibraryVo user) {
      initialize(user);

      JPanel panel = new JPanel();

      panel.setBackground(new Color(245, 245, 245));
      panel.setBounds(29, 26, 314, 57);

      frame.getContentPane().add(panel);
      panel.setLayout(null);

      lblNewLabel_1 = new JLabel("\uB2D8 \uD658\uC601\uD569\uB2C8\uB2E4");
      lblNewLabel_1.setFont(new Font("HY중고딕", Font.BOLD, 20));
      lblNewLabel_1.setBounds(147, 11, 148, 30);
      panel.add(lblNewLabel_1);

      loginUser.setText(loginUser.getName());

      loginUser = new JLabel("\uAE30\uAD00\uCC28");
      loginUser.setFont(new Font("함초롬돋움", Font.BOLD, 16));
      loginUser.setBounds(78, 8, 55, 36);

      String path6 = "C:\\Users\\smhrd\\Desktop\\icon\\hello.png";
      Image image6 = new ImageIcon(path6).getImage();

      JLabel lblNewLabel = new JLabel(new ImageIcon(image6.getScaledInstance(50, 50, image6.SCALE_SMOOTH)));
      lblNewLabel.setBounds(0, 0, 66, 61);
      panel.add(lblNewLabel);

      lblNewLabel_4 = new JLabel("New label");
      lblNewLabel_4.setBounds(78, 21, 57, 15);
      panel.add(lblNewLabel_4);

      String path5 = "C:\\Users\\smhrd\\Desktop\\icon\\user2.png";

      Image image5 = new ImageIcon(path5).getImage();

      String path = "C:\\Users\\smhrd\\Desktop\\icon\\home.png";
      Image image = new ImageIcon(path).getImage();

      String path2 = "C:\\Users\\smhrd\\Desktop\\icon\\checklist.png";
      Image image2 = new ImageIcon(path2).getImage();

      String path3 = "C:\\Users\\smhrd\\Desktop\\icon\\user1.png";
      Image image3 = new ImageIcon(path3).getImage();

      String path4 = "C:\\Users\\smhrd\\Desktop\\icon\\shipping-and-delivery.png";
      Image image4 = new ImageIcon(path4).getImage();

      String path1 = "C:\\Users\\smhrd\\Desktop\\icon\\cart.png";
      Image image1 = new ImageIcon(path1).getImage();

      separator = new JSeparator();
      separator.setBackground(UIManager.getColor("Button.light"));
      separator.setBounds(29, 115, 314, 1);
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
      lblNewLabel_3.setFont(new Font("HY헤드라인M", Font.BOLD, 15));
      lblNewLabel_3.setBounds(29, 333, 88, 23);
      frame.getContentPane().add(lblNewLabel_3);

      String path8 = "C:\\Users\\smhrd\\Desktop\\icon\\배애경.PNG";
      Image image8 = new ImageIcon(path8).getImage();

      back = new JLabel(new ImageIcon(image8.getScaledInstance(374, 499, image8.SCALE_SMOOTH)));
      back.setBounds(0, 0, 374, 499);
      frame.getContentPane().add(back);

      String path7 = "C:\\Users\\smhrd\\Desktop\\icon\\1.PNG";
      Image image7 = new ImageIcon(path7).getImage();

      back_1 = new JLabel(new ImageIcon(image7.getScaledInstance(374, 64, image7.SCALE_SMOOTH)));
      back_1.setBounds(0, 497, 374, 64);
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

      frame.setBounds(100, 100, 390, 600);

      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      frame.getContentPane().setLayout(null);

      String path8 = "C:\\Users\\smhrd\\Desktop\\icon\\library.png";
      Image image8 = new ImageIcon(path8).getImage();

      btn_5 = new JButton("");
      btn_5.setIcon(new ImageIcon("C:\\Users\\smhrd\\Desktop\\icon\\\uBC18\uB0A9.PNG"));
      btn_5.setBounds(308, 504, 54, 47);
      frame.getContentPane().add(btn_5);

      btn_4 = new JButton("");
      btn_4.setIcon(new ImageIcon("C:\\Users\\smhrd\\Desktop\\icon\\\uB9C8\uC774\uD398\uC774\uC9C0.PNG"));
      btn_4.setBounds(234, 504, 62, 57);
      frame.getContentPane().add(btn_4);

      btn_2 = new JButton("");
      btn_2.setIcon(new ImageIcon("C:\\Users\\smhrd\\Desktop\\icon\\\uBC30\uC1A1\uC815\uBCF4.PNG"));
      btn_2.setBounds(85, 504, 54, 47);
      frame.getContentPane().add(btn_2);

      btn_3 = new JButton("");
      btn_3.setIcon(new ImageIcon("C:\\Users\\smhrd\\Desktop\\icon\\\uBD81\uBC14\uAD6C\uB2C8.PNG"));
      btn_3.setBounds(155, 504, 54, 47);
      frame.getContentPane().add(btn_3);

      btn_1 = new JButton("");
      btn_1.setIcon(new ImageIcon("C:\\Users\\smhrd\\Desktop\\icon\\\uD648.PNG"));
      btn_1.setBounds(10, 504, 54, 47);
      frame.getContentPane().add(btn_1);

      panel_2 = new JPanel();
      panel_2.setBounds(39, 371, 271, 70);
      frame.getContentPane().add(panel_2);
      panel_2.setLayout(new GridLayout(0, 3, 10, 0));

      JButton btnNewButton_1 = new JButton("");
      btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\smhrd\\Desktop\\icon\\\uB3C4\uC11C\uAD001.PNG"));

      btnNewButton_1.addActionListener(new ActionListener() {

         public void actionPerformed(ActionEvent e) {
         }
      });
      panel_2.add(btnNewButton_1);

      btnNewButton_2 = new JButton("");
      btnNewButton_2.addActionListener(new ActionListener() {

         public void actionPerformed(ActionEvent e) {
         }
      });
      btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\smhrd\\Desktop\\icon\\\uB3C4\uC11C\uAD002.PNG"));
      panel_2.add(btnNewButton_2);

      btnNewButton_3 = new JButton("");
      btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\smhrd\\Desktop\\icon\\\uB3C4\uC11C\uAD003.PNG"));
      panel_2.add(btnNewButton_3);

      JSeparator separator_1 = new JSeparator();
      separator_1.setBackground(SystemColor.controlHighlight);
      separator_1.setBounds(29, 355, 314, 1);
      frame.getContentPane().add(separator_1);

      table = new JTable();
      table.setBackground(SystemColor.controlLtHighlight);
      table.setBounds(29, 124, 295, 199);
      frame.getContentPane().add(table);

   }
}