
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.*;
import java.util.*;


public class signupThree extends JFrame implements ActionListener {
    JRadioButton r1, r2, r3, r4;
    JCheckBox c1, c2 , c3, c4, c5, c6, c7;
    JButton submit, cancel;
    String formno ;
    signupThree(String formno ){
        this.formno= formno;
        setLayout(null);
        JLabel l1 = new JLabel("PAGE 3: ACCOUNT DETAILS");
        l1.setFont(new Font("Raleway", Font.BOLD,22));
        l1.setBounds(280, 40, 400, 40);
        add(l1);
        
        JLabel type = new JLabel("Account Type : ");
        type.setFont(new Font("Raleway", Font.BOLD,22));
        type.setBounds(100, 140, 200, 30);
        add(type);
        
        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway", Font.PLAIN,15));
        r1.setBackground(Color.white);
        r1.setBounds(100, 170, 200, 30);
        add(r1);
        r2 = new JRadioButton("Current Account");
        r2.setFont(new Font("Raleway", Font.PLAIN,15));
        r2.setBackground(Color.white);
        r2.setBounds(100, 200, 200, 30);
        add(r2);
        r3 = new JRadioButton("Fixed Deposit Account");
        r3.setFont(new Font("Raleway", Font.PLAIN,15));
        r3.setBackground(Color.white);
        r3.setBounds(400, 170, 200, 30);
        add(r3);
        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway", Font.PLAIN,15));
        r4.setBackground(Color.white);
        r4.setBounds(400, 200, 200, 30);
        add(r4);
        
        ButtonGroup groupcount = new ButtonGroup();
        groupcount.add(r1);
        groupcount.add(r2);
        groupcount.add(r3);
        groupcount.add(r4);
        
        JLabel card = new JLabel("Card Number : ");
        card.setFont(new Font("Raleway", Font.BOLD,22));
        card.setBounds(100, 250, 200, 30);
        add(card);
        
        JLabel cardno = new JLabel("XXXX-XXXX-XXXX-1234");
        cardno.setFont(new Font("Raleway", Font.BOLD,22));
        cardno.setBounds(400, 250, 250, 30);
        add(cardno);
        
        JLabel carddetails = new JLabel("Your 16 digit card number.");
        carddetails.setFont(new Font("Raleway", Font.PLAIN,15));
        carddetails.setBounds(400, 270, 250, 30);
        add(carddetails);
        
        JLabel pin = new JLabel("Pin Number : ");
        pin.setFont(new Font("Raleway", Font.BOLD,22));
        pin.setBounds(100, 300, 200, 30);
        add(pin);
        
        JLabel pinno = new JLabel("XXXX");
        pinno.setFont(new Font("Raleway", Font.BOLD,22));
        pinno.setBounds(400, 300, 200, 30);
        add(pinno);
        
        JLabel pindetails = new JLabel("Your 4 digit Pin");
        pindetails.setFont(new Font("Raleway", Font.PLAIN,15));
        pindetails.setBounds(400, 320, 200, 30);
        add(pindetails);
        
        JLabel services = new JLabel("Services Required");
        services.setFont(new Font("Raleway", Font.BOLD,22));
        services.setBounds(100, 370, 300, 30);
        add(services);
        
        c1 = new JCheckBox("ATM Card");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway", Font.PLAIN, 15));
        c1.setBounds(100, 400, 200, 15);
        add(c1);
        
        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway", Font.PLAIN, 15));
        c2.setBounds(400, 400, 200, 15);
        add(c2);
        
        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway", Font.PLAIN, 15));
        c3.setBounds(100, 430, 200, 15);
        add(c3);
        
        c4 = new JCheckBox("Email & SMS Alert");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway", Font.PLAIN, 15));
        c4.setBounds(400, 430, 200, 15);
        add(c4);
        
        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway", Font.PLAIN, 15));
        c5.setBounds(100, 460, 200, 15);
        add(c5);
        
        c6 = new JCheckBox("E-Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway", Font.PLAIN, 15));
        c6.setBounds(400, 460, 200, 15);
        add(c6);
        
        c7 = new JCheckBox("I hereby declare that the above entered details are correct to the best of my knowledge.");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Arial", Font.BOLD, 12));
        c7.setBounds(100, 510, 550, 22);
        add(c7);
        
        submit = new JButton("Submit");
        submit.setBackground(Color.WHITE);
        submit.setFont(new Font("Raleway", Font.BOLD, 22));
        submit.setBounds(100,560, 200,22 );
        submit.addActionListener(this);
        add(submit);
        
        cancel = new JButton("Cancel");
        cancel.setBackground(Color.WHITE);
        cancel.setFont(new Font("Raleway", Font.BOLD, 22));
        cancel.setBounds(400,560, 200,22 );
        cancel.addActionListener(this);
        add(cancel);
        
        getContentPane().setBackground(Color.WHITE);
        setSize(850, 820);
        setLocation(350, 0);
        setVisible(true);
    
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== submit){
            String accounttype = null;
            if(r1.isSelected()){
                accounttype = "Saving Account";
            }else if (r2.isSelected()){
                accounttype = "Current Account";
            }else if (r3.isSelected()){
                accounttype = "Fixed Deposit Account";
            }else if (r4.isSelected()){
                accounttype = "Recurring Deposit Account";
            }
            
            Random random = new Random();
            String cardnumber = "" + Math.abs((random.nextLong() % 90000000L)+ 76534320000000L);
            String pinnumber = "" +Math.abs((random.nextLong() % 9000L) + 1000L);
            String facility ="";
            if(c1.isSelected()){
                facility = facility + " ATM Card";   
            }else if(c2.isSelected()) {
                facility = facility + "Internet Banking";
            }else if(c3.isSelected()) {
                facility = facility + "Mobile Banking";
            }else if(c4.isSelected()) {
                facility = facility + "Email & SMS Alert";
            }else if(c5.isSelected()) {
                facility = facility + "Cheque Book";
            }else if(c6.isSelected()) {
                facility = facility + "E-Statement";
            }
            
            try{
                if(accounttype.equals("")){
                    System.out.print("Account type is required");
                }
                else {
                    conn con = new conn();
                    String query = "insert into signupthree values('"+formno+"', '"+accounttype+"', '"+cardnumber+"', '"+pinnumber+"', '"+facility+"')";
                    String query1 = "insert into login values('"+formno+"', '"+cardnumber+"', '"+pinnumber+"')";
                    con.s.executeUpdate(query);
                    con.s.executeUpdate(query1);
                    JOptionPane.showMessageDialog(null, "card number : "+ cardnumber+"\n Pin Number : "+ pinnumber);
                }
            }catch(Exception e){
                System.out.println(e);
            }
        }
        else if (ae.getSource()== cancel){
            
        }
    }
    
    public static void main(String arg[]){
        new signupThree("");
    }
    
}
