package final_project;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ch Muhammad Waqas
 */

class node
{
    node next;
    String name,pickup,destination;
    int charges,phone_number;
}

public class linkedlist {
    static node head=null;
    
    void insert(String name,int phone_number,String pickup,String destination,int charges)
    {
        node temp=new node();
        temp.next=null;
        temp.name=name;
        temp.phone_number=phone_number;
        temp.pickup=pickup;
        temp.destination=destination;
        temp.charges=charges;
        
        if(head==null)
        {
                head=temp;
        }
        else
        {
            node q=head;
            while(q.next!=null)
            {
                q=q.next;
            }
            q.next=temp;
        }
    }
    
    
    JFrame f=new JFrame("Booking List");
    JLabel label1,label2;
    void display()
    {
        node q=head;
        String[] tblHead={"ID","Name","Phone Number","Pick Up","Destination","Charges"};
        DefaultTableModel dtm=new DefaultTableModel(tblHead,0);
        JTable tbl=new JTable(dtm);
        JScrollPane sp=new JScrollPane(tbl);
    
        for(int i=1;q!=null;i++)
        {
            String[] item={Integer.toString(i),q.name,Integer.toString(q.phone_number),q.pickup,q.destination,Integer.toString(q.charges)};
            q=q.next;
            dtm.addRow(item);
        }
        
        f.add(sp);          
        f.setSize(720,600);
        f.setVisible(true); 
        
    }
    
    void delete()
    {
        if(head==null)
                {
                    JOptionPane.showMessageDialog(null, "List is empty ! ");
                }
                
                else
                {            
                int id = Integer.parseInt(JOptionPane.showInputDialog("Enter ID No : "));
                
                if(id==1)
                {
                    head=head.next;
                }
                else
                {
                    node q=head;
                    node r=q;
                    for(int i=1;i<id;i++)
                    {
                        r=q;
                        q=q.next;
                    }
                            r.next=q.next;
                            q.next=null;
                }
                }
    }
    
}
