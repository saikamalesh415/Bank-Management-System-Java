
package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.util.Date;
import java.sql.*;


public class Deposit extends JFrame  implements ActionListener{
    
    JButton deposit,back;
    JTextField amount;
    String pinnumber;    
    
    Deposit(String pinnumber){
        this.pinnumber=pinnumber;
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text = new JLabel("Enter the you want to deposit");
        text.setFont(new Font("System", Font.BOLD,16));
        text.setForeground(Color.WHITE);
        text.setBounds(170,300,400,20);
        image.add(text);
        
        amount = new JTextField();
        amount.setFont(new Font("Raleway", Font.BOLD,22));
        amount.setBounds(170,350,320,25);
        image.add(amount);
        
        deposit = new JButton("Deposit");
        deposit.setBounds(355,485,150,30);
        deposit.addActionListener(this);
        image.add(deposit);
        
        back = new JButton("Back");
        back.setBounds(355,520,150,30);
        back.addActionListener(this);
        image.add(back);
        
        setSize(900,900);
        setLocation(300,0);
//        setUndecorated(true);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == deposit){
            String number=amount.getText();
            java.sql.Date date = new java.sql.Date(System.currentTimeMillis());
            if(number.equals("")){
                JOptionPane.showMessageDialog(null, "Please Enter valid Ammount");
            }else{
                try{
                    
                    Conn c = new Conn();
                    String query = "insert into bank values('"+pinnumber+"', '"+date+"', 'Deposit', '"+number+"')" ;
                    c.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Rs "+number+" Deposited Successfully");
                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);
                    
                }catch(Exception e){
                    System.out.println(e);
                }
                
            }
        }
        else if(ae.getSource() == back){
            setVisible(true);
            new Transactions(pinnumber).setVisible(true);
        }
    }
    
    public static void main(String ars[]){
        new Deposit("");
    }
}
