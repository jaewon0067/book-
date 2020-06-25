package View;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Controller.LibraryManagementSystem;

import Model.Member_LibraryVo;
import javax.swing.JPanel;
import java.awt.Font;



public class LibraryJoinGUI {

   ;private JFrame frame;
   private JTextField txt_forID;
   private JTextField txt_forPW;
   private JTextField txt_forName;
   private JButton btn_join;
   private JButton btn_join_1;
   private LibraryManagementSystem controller = LibraryLoginGUI.controller;
   private JTextField txt_forAge;
   private JTextField txt_forGender;
   private JTextField txt_forPhone;
   private JTextField txt_forAddr;

   
   public LibraryJoinGUI() {
      initialize();
      frame.setVisible(true);
   }

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               LibraryJoinGUI window = new LibraryJoinGUI();
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


   /**
    * Initialize the contents of the frame.
    */
   
   private void initialize() {
      frame = new JFrame();
      frame.getContentPane().setBackground(Color.WHITE);
      frame.setBounds(100, 100, 389, 622);
      frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // 회원가입 창만 닫게 하기
      frame.getContentPane().setLayout(null);
      
      txt_forID = new JTextField();
      txt_forID.setBounds(131, 140, 161, 21);
      frame.getContentPane().add(txt_forID);
      txt_forID.setColumns(10);
      
      txt_forPW = new JTextField();
      txt_forPW.setBounds(131, 191, 161, 21);
      frame.getContentPane().add(txt_forPW);
      txt_forPW.setColumns(10);
      
      txt_forName = new JTextField();
      txt_forName.setBounds(131, 234, 161, 21);
      frame.getContentPane().add(txt_forName);
      txt_forName.setColumns(10);
      
      txt_forAge = new JTextField();
      txt_forAge.setBounds(131, 281, 161, 23);
      frame.getContentPane().add(txt_forAge);
      txt_forAge.setColumns(10);
      
      txt_forGender = new JTextField();
      txt_forGender.setBounds(131, 324, 161, 23);
      frame.getContentPane().add(txt_forGender);
      txt_forGender.setColumns(10);
      
      txt_forPhone = new JTextField();
      txt_forPhone.setBounds(131, 375, 161, 24);
      frame.getContentPane().add(txt_forPhone);
      txt_forPhone.setColumns(10);
      
      btn_join_1 = new JButton("\uD68C\uC6D0\uAC00\uC785");
      btn_join_1.setFont(new Font("굴림", Font.BOLD, 15));
      btn_join_1.setBackground(new Color(222, 184, 135));
      btn_join_1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            String id = txt_forID.getText();
            String pw = txt_forPW.getText();
            String name = txt_forName.getText();
            String age = txt_forAge.getText();
            String gender = txt_forGender.getText();
            String phone = txt_forPhone.getText();
            String addr = txt_forAddr.getText();
            Member_LibraryVo joinUser = new Member_LibraryVo(id,pw,name,age,gender,phone,addr);
            int cnt = controller.join(joinUser);
            if(cnt == 0) {
               System.out.println("회원가입 실패");
               JOptionPane.showMessageDialog(frame,
                      "회원가입 실패",
                      "회원가입 결과 ",
                      JOptionPane.ERROR_MESSAGE);
               
            }else {
               System.out.println("회원가입 성공");
               JOptionPane.showMessageDialog(frame,
                      "회원가입 성공",
                      "회원가입 결과",
                      JOptionPane.INFORMATION_MESSAGE);
               frame.setVisible(false);
               
            }
               
         }
      });
      btn_join_1.setBounds(116, 477, 123, 31);
      frame.getContentPane().add(btn_join_1);
      
      txt_forAddr = new JTextField();
      txt_forAddr.setBounds(131, 418, 161, 23);
      frame.getContentPane().add(txt_forAddr);
      txt_forAddr.setColumns(10);
      
      
      java.net.URL url__1 = this.getClass().getResource("../icon/joinback.PNG");   
      JLabel back = new JLabel(new ImageIcon(url__1.getPath()));
      back.setBounds(0, 0, 375, 585);
      frame.getContentPane().add(back);
      
      
   }
}