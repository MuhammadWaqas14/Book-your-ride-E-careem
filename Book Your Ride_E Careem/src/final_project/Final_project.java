/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final_project;

import java.awt.Color;
import java.awt.Font;
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



class careem extends JFrame
{
    JFrame frame;
    JButton button1,button2,button3,button4;
    JLabel label1,label2;
    node root=null;
    
    
    void careem1()
    {
        JLabel ll = new JLabel();
        frame=new JFrame();
        frame.setTitle("Careem Care");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1080, 720);
        frame.setLocation(250, 100);
        frame.setBackground(Color.RED);
        frame.setLayout(null);
        
        label1=new JLabel();
        label1.setText("Welcome to Careem Care!");
        label1.setFont(new Font("Serif",Font.ITALIC,48));
        label1.setBounds(20,25, 1060, 50);
        label1.setForeground(Color.green);
        
        button1=new JButton("Get Ride");
        button1.setBounds(150,125, 350, 100);
        button1.setFont(new Font("Serif", Font.ITALIC, 35));
        button1.setForeground(Color.white);
        button1.setBackground(Color.green);
        
        button2=new JButton("Cancel Ride");
        button2.setBounds(550,125, 350, 100);
        button2.setFont(new Font("Serif", Font.ITALIC, 35));
        button2.setForeground(Color.white);
        button2.setBackground(Color.green);
        
        button3=new JButton("Display");
        button3.setBounds(150,275, 350, 100);
        button3.setFont(new Font("Serif", Font.ITALIC, 35));
        button3.setForeground(Color.white);
        button3.setBackground(Color.green);
        
        
        button4=new JButton("Exit");
        button4.setBounds(550,275, 350, 100);
        button4.setFont(new Font("Serif", Font.ITALIC, 35));
        button4.setForeground(Color.white);
        button4.setBackground(Color.green);
        
        frame.add(label1);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        
        button1.addActionListener(new action());
        button2.addActionListener(new action());
        button3.addActionListener(new action());
        button4.addActionListener(new action());
        
        frame.setLayout(null);
        frame.setVisible(true);
    }
    
    public class action implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent ac) {
        
        if(ac.getSource()==button1)
        {
            get_ride getride = new get_ride();
            getride.get_ride();
            frame.dispose();
        }
        
        if(ac.getSource()==button2)
        {
            linkedlist obj=new linkedlist();
            obj.delete();
        }
        
        if(ac.getSource()==button3)
        {
            linkedlist obj=new linkedlist();
            obj.display();
        }
        
        if(ac.getSource()==button4)
        {
            System.exit(0);
        }
    
               
    }
    }
    
}

public class Final_project {

    /**
     * @param args the command line arguments
     */
   
    ImageIcon i = new ImageIcon("");
    
  
    
    
    
    
    public static void main(String[] args) {
    careem obj=new careem();
    obj.careem1();
}
}