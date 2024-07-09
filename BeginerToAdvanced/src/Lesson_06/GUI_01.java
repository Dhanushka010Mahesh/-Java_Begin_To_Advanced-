package Lesson_06;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class GUI_01{
    public static void main(String[] args) {
        JFrame ff=new JFrame();
        ff.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ff.setLayout(null);
        ff.setSize(500,300);
      
        
        JLabel l1=new JLabel();
        l1.setBounds(200,20,100,15);
        l1.setText("Login");
        l1.setForeground(Color.red);
        ff.add(l1);
        
        JLabel lbluName=new JLabel();
        JLabel lbluPass=new JLabel();
        JTextField txtuName=new JTextField();
        JTextField txtuPass=new JTextField();
        lbluName.setBounds(100,60,100,20);
        lbluPass.setBounds(100,120,100,20);
        txtuName.setBounds(300,60,100,20);
        txtuPass.setBounds(300,120,100,20);
        lbluName.setText("User Name");
        lbluPass.setText("Password");
        ff.add(lbluName);
        ff.add(lbluPass);
        ff.add(txtuName);
        ff.add(txtuPass);
        
        JButton btnLog=new JButton();
        btnLog.setBounds(250,200,150,30);
        btnLog.setText("Login");
        btnLog.setBackground(Color.yellow);
        ff.add(btnLog);
        
        
        btnLog.addActionListener(new ActionListener() {
        
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null,"click button");
               
            }
        });
        
        ff.setVisible(true);
        
    }
}
