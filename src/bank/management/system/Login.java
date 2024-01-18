
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    JButton login, Clear, Signup ;
    JTextField cardnofield;
    JPasswordField pinfield;
    
    Login()
    {
        
        setLayout(null);
        setTitle("AUTOMATED TELLER MACHINE");
        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel lebal = new JLabel(i3);
        lebal.setBounds(70, 10, 100, 100);
        add(lebal);
        JLabel text = new JLabel("WELCOME TO ATM");
        text.setFont(new Font("Osward", Font.BOLD, 38));
        text.setBounds(200,40,400,40);
        add(text);
        
        JLabel cardno = new JLabel("Card No.");
        cardno.setFont(new Font("Osward", Font.BOLD, 28));
        cardno.setBounds(120,150,200,40);
        add(cardno);
        
        cardnofield = new JTextField();
        cardnofield.setBounds(300, 150, 300, 40);
        add(cardnofield);
        
        JLabel pin = new JLabel("Pin No.");
        pin.setFont(new Font("Osward", Font.BOLD, 28));
        pin.setBounds(120,220,400,40);
        add(pin);
        
        pinfield = new JPasswordField();
        pinfield.setBounds(300, 220, 300, 40);
        add(pinfield);
        
        login = new JButton("Sign In");
        login.setBounds(300, 300, 100, 40);
        login.setBackground(Color.black);
        login.setForeground(Color.white);
        login.addActionListener(this);
        add(login);
        
        Clear = new JButton("Clear");
        Clear.setBounds(500, 300, 100, 40);
        Clear.setBackground(Color.black);
        Clear.setForeground(Color.white);
        Clear.addActionListener(this);
        add(Clear);
        
        Signup = new JButton("Sign Up");
        Signup.setBounds(300, 350, 300, 40);
        Signup.setBackground(Color.black);
        Signup.setForeground(Color.white);
        Signup.addActionListener(this);
        add(Signup);  
   
        getContentPane().setBackground(Color.white);
        
        setSize(800, 480);
        setVisible(true);
        setLocation(200,200);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == Clear){
            cardnofield.setText("");
            pinfield.setText("");
        }
        else if(ae.getSource()== login){
            
        }
        else if(ae.getSource() == Signup){
            setVisible(false);
            new SignupOne().setVisible(true);
            
        }
    }
    
    public static void main(String arg[]){
        new Login();
    
    }  
}
