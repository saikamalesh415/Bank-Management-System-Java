
package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;



public class SignupThree extends JFrame implements ActionListener{
    
    JRadioButton r1, r2, r3, r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit,cancel;
    String formno;
    
    SignupThree(String formno){
        this.formno=formno;
        setLayout(null);
        
        JLabel l1 = new JLabel("Page 3: Account Details");
        l1.setFont(new Font("raleway",Font.BOLD,22));
        l1.setBounds(280,40,400,40);
        add(l1);
        
        JLabel type = new JLabel("Account Type : ");
        type.setFont(new Font("raleway",Font.BOLD,22));
        type.setBounds(100,140,200,30);
        add(type);
        
        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("raleway",Font.BOLD,16));
        r1.setBounds(100,180,150,20);
        r1.setBackground(Color.WHITE);
        add(r1);
        
        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("raleway",Font.BOLD,16));
        r2.setBounds(350,180,300,20);
        r2.setBackground(Color.WHITE);
        add(r2);    
        
        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("raleway",Font.BOLD,16));
        r3.setBounds(100,220,150,20);
        r3.setBackground(Color.WHITE);
        add(r3);
        
        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("raleway",Font.BOLD,16));
        r4.setBounds(350,220,300,20);
        r4.setBackground(Color.WHITE);
        add(r4); 
             
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(r1);
        maritalgroup.add(r2); 
        maritalgroup.add(r3);
        maritalgroup.add(r4); 
        
        JLabel card = new JLabel("Card Number : ");
        card.setFont(new Font("raleway",Font.BOLD,22));
        card.setBounds(100,300,200,30);
        add(card);
        
        JLabel number = new JLabel("XXXX-XXXX-XXXX-4184");
        number.setFont(new Font("raleway",Font.BOLD,22));
        number.setBounds(330,300,300,30);
        add(number);
        
        JLabel carddetails = new JLabel("Your 16 Digit Card Number ");
        carddetails.setFont(new Font("raleway",Font.BOLD,12));
        carddetails.setBounds(100,330,300,20);
        add(carddetails);
        
        JLabel pin = new JLabel("Pin : ");
        pin.setFont(new Font("raleway",Font.BOLD,22));
        pin.setBounds(100,370,200,30);
        add(pin);
        
        JLabel pnumber = new JLabel("XXXX");
        pnumber.setFont(new Font("raleway",Font.BOLD,22));
        pnumber.setBounds(330,370,300,30);
        add(pnumber);
        
        JLabel pindetails = new JLabel("Your 4 Digit Pin ");
        pindetails.setFont(new Font("raleway",Font.BOLD,12));
        pindetails.setBounds(100,400,300,20);
        add(pindetails);
        
        JLabel services = new JLabel("Services Reqired : ");
        services.setFont(new Font("raleway",Font.BOLD,22));
        services.setBounds(100,450,400,30);
        add(services);
        
        c1=new JCheckBox("ATM CARD");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("raleway",Font.BOLD,16));
        c1.setBounds(100,500,200,30);
        add(c1);
        
        c2=new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("raleway",Font.BOLD,16));
        c2.setBounds(350,500,200,30);
        add(c2);
        
        c3=new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("raleway",Font.BOLD,16));
        c3.setBounds(100,550,200,30);
        add(c3);
        
        c4=new JCheckBox("EMAIL & SMS Alerts");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("raleway",Font.BOLD,16));
        c4.setBounds(350,550,200,30);
        add(c4);
        
        c5=new JCheckBox("Cheque Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("raleway",Font.BOLD,16));
        c5.setBounds(100,600,200,30);
        add(c5);
        
        c6=new JCheckBox("E-Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("raleway",Font.BOLD,16));
        c6.setBounds(350,600,200,30);
        add(c6);
        
        c7=new JCheckBox("I Hereby declares that the above entered details aare correct to the best of my knowledge");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("raleway",Font.BOLD,12));
        c7.setBounds(100,680,600,30);
        add(c7);
        
        submit = new JButton("Submit");
        submit.setBounds(250,720,100,30);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway", Font.BOLD,14));
        submit.addActionListener(this);
        add(submit);
        
        cancel = new JButton("Cancel");
        cancel.setBounds(420,720,100,30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway", Font.BOLD,14));
        cancel.addActionListener(this);
        add(cancel);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,820);
        setLocation(350,0);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == submit){
            String accounttype=null;
            if(r1.isSelected()){
            accounttype="Saving Account";
            }
            else if(r2.isSelected()){
            accounttype="Fixed Deposit Account";
            }
            else if(r3.isSelected()){
            accounttype="Current Account";
            } 
            else if(r4.isSelected()){
            accounttype="Recurring Deposit Account";
            }
            
            Random random = new Random();
            String cardnumber ="" + Math.abs((random.nextLong()% 90000000L)+5040936000000000L);
            
            String pinnumber ="" +Math.abs((random.nextLong()% 9000L) + 1000L);
            
            String facility = "";
            if(c1.isSelected()){
                facility=facility + "ATM CARD";
            }
            else if(c2.isSelected()){
                facility=facility + "Internet Banking";
            }
            else if(c3.isSelected()){
                facility=facility + "Mobile Banking";
            } 
            else if(c4.isSelected()){
                facility=facility + "EMAIL & SMS Alerts";
            }
            else if(c5.isSelected()){
                facility=facility + "Cheque Book";
            }
            else if(c6.isSelected()){
                facility=facility + "E-Statement";
            }
            
            try{  
                if(accounttype.equals("")){
                    JOptionPane.showMessageDialog(null,"Account Type is Required");
                }
                else{
                    Conn c = new Conn();
                    String query="insert into signupthree values('"+formno+"', '"+accounttype+"', '"+cardnumber+"', '"+pinnumber+"', '"+facility+"')";  
                    c.s.executeUpdate(query);
                    String queryl="insert into login values('"+formno+"', '"+cardnumber+"', '"+pinnumber+"')";  
                    c.s.executeUpdate(queryl);
                    
                    JOptionPane.showMessageDialog(null,"Card Number: " +cardnumber+"\n Pin: "+pinnumber );
                    setVisible(false);
                    new Deposit(pinnumber).setVisible(false);
                }                            
            }
            catch(Exception e){
                System.out.println(e);                
            }            
            
        }else if(ae.getSource() == cancel){
            setVisible(false);
            new Login().setVisible(true);
        }
    }
    
    public static void main(String args[]){
        new SignupThree("");
    }
}
