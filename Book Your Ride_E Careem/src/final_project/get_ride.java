/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final_project;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Ch Muhammad Waqas
 */
public class get_ride extends JFrame
{
    
    JFrame f=new JFrame("Get Ride");
    JLabel label1,label2,label3,label4,label5,label6,label7,id,label8;
    TextField tf1,tf2,tf3,tf4,tf5;
    JButton button1,button2,button3;
    ImageIcon n= new ImageIcon("C:\\Users\\Ch Muhammad Waqas\\Desktop\\Project 4C\\final_project\\src\\final_project.pnj");
    node root=null;
    
    
    void get_ride()
    {    
        label8 = new JLabel();
        label8.setIcon(n);
        label8.setVisible(true);
        label8.setBounds(100,100, 150, 100);
        
        
        
        
        label1=new JLabel();
        label1.setBounds(175,25,400,50);
        label1.setText("#RIDE Menu");
        label1.setFont(new Font("Serif", Font.ITALIC, 48));
        label1.setForeground(Color.green);
    
        label2=new JLabel();
        label2.setBounds(50,100,300,30);
        label2.setText("Ride Info Form ");
        label2.setFont(new Font("Serif", Font.ITALIC, 20));
        label2.setForeground(Color.green);
    
        label3=new JLabel();
        label3.setBounds(75,150,200,30);
        label3.setText("Enter Name ");
        label3.setFont(new Font("Serif", Font.ITALIC, 18));
        label3.setForeground(Color.green);
    
        label4=new JLabel();
        label4.setBounds(75,200,200,30);
        label4.setText("Phone Number ");
        label4.setFont(new Font("Serif", Font.ITALIC, 20));
        label4.setForeground(Color.green);
    
        label5=new JLabel();
        label5.setBounds(75,250,200,30);
        label5.setText("Pick up ");
        label5.setFont(new Font("Serif", Font.ITALIC, 20));
        label5.setForeground(Color.green);
    
        label6=new JLabel();
        label6.setBounds(75,300,200,30);
        label6.setText("Destination ");
        label6.setFont(new Font("Serif", Font.ITALIC, 20));
        label6.setForeground(Color.green);
    
        label7=new JLabel();
        label7.setBounds(75,350,200,30);
        label7.setText("Charges ");
        label7.setFont(new Font("Serif", Font.ITALIC, 18));
        label7.setForeground(Color.green);
        
        tf1=new TextField();
        tf1.setBounds(275,150,300,30);
        tf1.setFont(new Font("Serif",Font.LAYOUT_LEFT_TO_RIGHT,18));
        
        tf2=new TextField();
        tf2.setBounds(275,200,300,30);
        tf2.setFont(new Font("Serif",Font.LAYOUT_LEFT_TO_RIGHT,18));
        
        tf3=new TextField();
        tf3.setBounds(275,250,300,30);
        tf3.setFont(new Font("Serif",Font.LAYOUT_LEFT_TO_RIGHT,18));
        
        tf4=new TextField();
        tf4.setBounds(275,300,300,30);
        tf4.setFont(new Font("Serif",Font.LAYOUT_LEFT_TO_RIGHT,18));
        
        tf5=new TextField();
        tf5.setBounds(275,350,300,30);
        tf5.setFont(new Font("Serif",Font.LAYOUT_LEFT_TO_RIGHT,18));
        
        button1 = new JButton("ADD");
        button1.setBounds(175,450,200,50);
        button1.setFont(new Font("Serif", Font.ITALIC, 35));
        button1.setForeground(Color.white);
        button1.setBackground(Color.green);
        
        button2 = new JButton("Main");
        button2.setBounds(375,450,200,50);
        button2.setFont(new Font("Serif", Font.ITALIC, 35));
        button2.setForeground(Color.white);
        button2.setBackground(Color.green);
        
        
         f.add(label8);
        f.add(label1);
        f.add(label2);
        f.add(label3);
        f.add(label4);
        f.add(label5);
        f.add(label6);
        f.add(label7);
        f.add(tf1);
        f.add(tf2);
        f.add(tf3);
        f.add(tf4);
        f.add(tf5);
        f.add(button1);
        f.add(button2);
       
        
        button1.addActionListener(new action());
        button2.addActionListener(new action());
//        button3.addActionListener(new action());

        System.out.println("Root addboook : "+root);
        
        f.setLocation(new Point(500, 125));
        f.setSize(new Dimension(720,600));
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        f.setBackground(Color.GRAY);
        f.setLayout(null);
        f.setVisible(true);
    }
    
     public class action implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent ac) {
        
        if(ac.getSource()==button1)
        {
            linkedlist obj=new linkedlist();
            obj.insert(tf1.getText(), Integer.parseInt(tf2.getText()), tf3.getText(), tf4.getText(), Integer.parseInt(tf5.getText()));
        }
        
        if(ac.getSource()==button2)
        {
            careem obj=new careem();
            obj.careem1();
        }
    }
     }
    
}