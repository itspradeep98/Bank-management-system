
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;

public class SignupOne extends JFrame implements ActionListener{
    long random;
    JLabel formno, PersonDetails, name, fname, dob, gender, Email, marital, Address, state, city, pincode;
    JTextField nametextfield, fnametextfield, emailtextfield, addresstextfield, statetextfield, citytextfield, pincodetextfield;
    JDateChooser datechooser;
    JRadioButton yes, no, other, male, female, transgender;
    
    SignupOne(){
        setLayout(null);
        
        Random ran = new Random();
        random = Math.abs((ran.nextLong() % 9000L) + 1000L);
        
        formno = new JLabel("APPLICATION FORM NO. " + random);
        formno.setFont(new Font("Ralwey",Font.BOLD, 38));
        formno.setBounds(140, 20, 600, 40);
        add(formno);
        
        PersonDetails = new JLabel("PAGE 1: PERSONAL DETAILS ");
        PersonDetails.setFont(new Font("Ralwey",Font.BOLD, 22));
        PersonDetails.setBounds(290, 80, 400, 30);
        add(PersonDetails);
        
        name = new JLabel("NAME");
        name.setFont(new Font("Ralwey",Font.BOLD, 22));
        name.setBounds(100, 140, 100, 30);
        add(name);
        
        nametextfield = new JTextField();
        nametextfield.setFont(new Font("Ralwey",Font.ITALIC, 15));
        nametextfield.setBounds(400, 140,400,30);
        add(nametextfield);
        
        fname = new JLabel("FATHERS NAME ");
        fname.setFont(new Font("Ralwey",Font.BOLD, 22));
        fname.setBounds(100, 190, 200, 30);
        add(fname);
        
        fnametextfield = new JTextField();
        fnametextfield.setFont(new Font("Ralwey",Font.ITALIC, 15));
        fnametextfield.setBounds(400, 190,400,30);
        add(fnametextfield);
        
        dob = new JLabel("DATE OF BIRTH ");
        dob.setFont(new Font("Ralwey",Font.BOLD, 22));
        dob.setBounds(100, 240, 200, 30);
        add(dob);
        
        datechooser = new JDateChooser();
        datechooser.setBounds(400, 240, 400, 30);
        datechooser.setForeground(Color.BLACK);
        add(datechooser);
        
        gender = new JLabel();
        gender.setFont(new Font("Ralwey",Font.BOLD, 22));
        gender.setBounds(100, 290, 150, 30);
        add(gender);
        
        male = new JRadioButton("Male");
        male.setBounds(400, 290, 75, 30);
        male.setBackground(Color.WHITE);
        add(male);
        female = new JRadioButton("Female");
        female.setBounds(500, 290, 75, 30);
        female.setBackground(Color.WHITE);
        add(female);
        transgender = new JRadioButton("Transgender");
        transgender.setBounds(600, 290, 100, 30);
        transgender.setBackground(Color.WHITE);
        add(transgender);
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        gendergroup.add(transgender);
        
        Email = new JLabel("EMAIL ADDRESS ");
        Email.setFont(new Font("Ralwey",Font.BOLD, 22));
        Email.setBounds(100, 340, 200, 30);
        add(Email);
        
        emailtextfield = new JTextField();
        emailtextfield.setFont(new Font("Ralwey",Font.ITALIC, 15));
        emailtextfield.setBounds(400, 340,400,30);
        add(emailtextfield);
        
        marital  = new JLabel("MARITAL STATUS ");
        marital.setFont(new Font("Ralwey",Font.BOLD, 22));
        marital.setBounds(100, 390, 200, 30);
        add(marital);
        yes = new JRadioButton("Married");
        yes.setBounds(400, 390, 75, 30);
        yes.setBackground(Color.WHITE);
        add(yes);
        no = new JRadioButton("Unmarried");
        no.setBounds(500, 390, 100, 30);
        no.setBackground(Color.WHITE);
        add(no);
        other = new JRadioButton("Other");
        other.setBounds(600, 390, 100, 30);
        other.setBackground(Color.WHITE);
        add(other);
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(yes);
        maritalgroup.add(no);
        maritalgroup.add(other);
        
        Address = new JLabel("ADDRESS ");
        Address.setFont(new Font("Ralwey",Font.BOLD, 22));
        Address.setBounds(100, 440, 200, 30);
        add(Address);
        
        addresstextfield = new JTextField();
        addresstextfield.setFont(new Font("Ralwey",Font.ITALIC, 15));
        addresstextfield.setBounds(400, 440,400,30);
        add(addresstextfield);
        
        state = new JLabel("STATE ");
        state.setFont(new Font("Ralwey",Font.BOLD, 22));
        state.setBounds(100, 490, 200, 30);
        add(state);
        
        statetextfield = new JTextField();
        statetextfield.setFont(new Font("Ralwey",Font.ITALIC, 15));
        statetextfield.setBounds(400, 490,400,30);
        add(statetextfield);
        
        city = new JLabel("CITY ");
        city.setFont(new Font("Ralwey",Font.BOLD, 22));
        city.setBounds(100, 540, 200, 30);
        add(city);
        
        citytextfield = new JTextField();
        citytextfield.setFont(new Font("Ralwey",Font.ITALIC, 15));
        citytextfield.setBounds(400, 540,400,30);
        add(citytextfield);
        
        pincode = new JLabel("PIN CODE");
        pincode.setFont(new Font("Ralwey",Font.BOLD, 22));
        pincode.setBounds(100, 590, 200, 30);
        add(pincode);
        
        pincodetextfield = new JTextField();
        pincodetextfield.setFont(new Font("Ralwey",Font.ITALIC, 15));
        pincodetextfield.setBounds(400, 590,400,30);
        add(pincodetextfield);
        
        JButton next = new JButton("Next");
        next.setBounds(700, 640, 100, 30);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
        setSize(850, 750);
        setLocation(350, 10);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        String formno = "" + random;  //long
        String name = nametextfield.getText(); 
        String fname = fnametextfield.getText(); 
        String dob = ((JTextField) datechooser.getDateEditor().getUiComponent()).getText(); 
        String gender = null; 
        if(male.isSelected()){
            gender = "male";
        }
        else if (female.isSelected()){
            gender = "female";
        }else
            gender = "transgender";
        String email = emailtextfield.getText(); 
        String marital = null; 
        if(yes.isSelected()){
            marital = "married";
        }
        else if (no.isSelected()){
            marital = "Unmarried";
        }else
            marital = "other";
        String address = addresstextfield.getText();
        String city = citytextfield.getText();
        String state = statetextfield.getText();
        String pin = pincodetextfield.getText();
        
        try{
            if (name.equals("")){
                JOptionPane.showMessageDialog(null, "Name is required");
            }
            else{
                conn c = new conn();
                String query = "insert into signup values('"+formno+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+email+"', '"+marital+"', '"+address+"', '"+city+"', '"+state+"', '"+pin+"')";
                c.s.executeUpdate(query);
                
                setVisible(false);
                new SignupTwo(formno).setVisible(true);
            }
    
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String arg[]){
        
        new SignupOne();
    }
    
}
