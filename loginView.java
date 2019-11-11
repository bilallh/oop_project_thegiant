package org.iuea.oop.thegiant;
/*      GROUP NAME= THE GIENT
        (" LAWAL BILAL  18/1192/BSSE-S"
                 "ADAMU ABDULRAHMAN  18/446/BSSE-S"
                 " IBRAHIM MATO DANGADA  "19/928/BIT-S"
                 " SADIQ NASIDI SALISU    19/789/BSCS-S"*/
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.*;
import java.awt.*;

public class loginView  extends JFrame{
	public loginView() {
		JFrame frame1=new JFrame();
		  JPanel pan1=new JPanel();
		  
		  pan1.setBounds(0,0,0,0);
		  
		  JLabel label1=new JLabel("ADMIN LOGIN");
		  label1.setBounds(260, 60, 200, 20);
		  label1.setFont(new Font("Calibri",Font.ITALIC,23));
		  
		  JLabel Label2=new JLabel("PASSWORD");
		  Label2.setBounds(80, 150, 150, 20);
	         
		  Label2.setFont(new Font("calibri",Font.BOLD,17));
	          
		  JLabel label3=new JLabel("USER NAME");
		  label3.setBounds(80,100,200,20);
		  label3.setFont(new Font("calibri",Font.BOLD,17));
		  
		  JTextField Textfield2=new JTextField();
		  Textfield2.setBounds(300, 100, 190, 30); 
		  
		  JPasswordField JPasswordField2=new JPasswordField();
		  JPasswordField2.setBounds(300, 150, 190, 30);
		  
		  JButton button1=new JButton("CANCEL");
		  button1.setBounds(150, 260, 100, 30);
	         
		  
		  JButton button2=new JButton("LOGIN");
		  button2.setBounds(300, 260, 100, 30);
	          
	 
	          
	          button2.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent ae) {
	                if(Textfield2.getText().isEmpty()||Textfield2.getText().isEmpty()){
	                    JOptionPane.showMessageDialog(null, "All fields is required."+"!");
	                }else if(Textfield2.getText().equals("thegiant")&& JPasswordField2.getText().equals("thegiant")){
	                    JOptionPane.showMessageDialog(null, "Logged in successful");
	                    frame1.dispose();
	                    EventQueue.invokeLater(new Runnable() {
	            			public void run() {
	            			try {
	            					mainView frame = new mainView();
	            					frame.setVisible(true);
	            				} catch (Exception e) {
	            					e.printStackTrace();
	            				}
	            			}
	            		});
	                }else{
	                    JOptionPane.showMessageDialog(null,"Invalid login credencials"+"!");
	               }
	                
	            }
	        });{
	    
	}	
		  //add labels
		  frame1.getContentPane().add(label3);
		  frame1.getContentPane().add(Label2);
		  //add TextField
		  frame1.getContentPane().add(Textfield2);
		  frame1.getContentPane().add(JPasswordField2);
		  //add button
		  frame1.getContentPane().add(button1);
		  frame1.getContentPane().add(button2);
		  //add label
		  frame1.getContentPane().add(label1);
		  //add panel
		  frame1.getContentPane().add(pan1);
		  frame1.getContentPane().add(pan1);
		  
	      frame1.setVisible(true);
		  frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  frame1.setSize(600,400);
		  frame1.getContentPane().setLayout(null);
	}
	

}
