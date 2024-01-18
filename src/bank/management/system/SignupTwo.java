package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener{
   
    JLabel additionaldetails, religion, category, income, educational, qualification, occupation, panno, adhaarno, account, srcitizen;
    JTextField pantextfield, adhaartextfield;
    JRadioButton syes, sno, eyes, eno;
    JComboBox occupationbox,religionbox, categorybox, incomebox, educationalbox;
    String formno;
    
    SignupTwo(String formno){
        setLayout(null);
        this.formno =formno;
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        additionaldetails = new JLabel("PAGE 2: ADDITIONAL DETAILS ");
        additionaldetails.setFont(new Font("Ralwey",Font.BOLD, 22));
        additionaldetails.setBounds(290, 80, 400, 30);
        add(additionaldetails);
        
        religion = new JLabel("RELIGION");
        religion.setFont(new Font("Ralwey",Font.BOLD, 22));
        religion.setBounds(100, 140, 150, 30);
        add(religion);
        
        String Religion[] = {"Hindu", "Muslim", "Shikh", "Christan", "Others"};
        religionbox = new JComboBox(Religion);
        religionbox.setFont(new Font("Ralwey",Font.ITALIC, 15));
        religionbox.setBounds(400, 140,400,30);
        add(religionbox);
        
        category = new JLabel("CATEGORY");
        category.setFont(new Font("Ralwey",Font.BOLD, 22));
        category.setBounds(100, 190, 200, 30);
        add(category);
        
        String Category[] = {"General", "OBC", "ST", "SC"};
        categorybox = new JComboBox(Category);
        categorybox.setFont(new Font("Ralwey",Font.ITALIC, 15));
        categorybox.setBounds(400, 190,400,30);
        add(categorybox);
        
        income = new JLabel("INCOME");
        income.setFont(new Font("Ralwey",Font.BOLD, 22));
        income.setBounds(100, 240, 200, 30);
        add(income);
        
        String Income[] = {"     ", "Less than 1,50,000", "Less than 2,50,000", "Less than 5,00,000", "Less than 10,00,000", "More than 10,00,000"};
        incomebox = new JComboBox(Income);
        incomebox.setBounds(400, 240, 400, 30);
        incomebox.setForeground(Color.BLACK);
        add(incomebox);
        
        educational = new JLabel("EDUCATIONAL");
        educational.setFont(new Font("Ralwey",Font.BOLD, 22));
        educational.setBounds(100, 290, 200, 30);
        add(educational);
        
        String Educational[] = {"     ","Secondary(10th)", "High Secondary(12th)", "Graduate", "Post Graduate", "Doctrate", "Others"};
        educationalbox = new JComboBox(Educational);
        educationalbox.setBounds(400, 330, 400, 30);
        educationalbox.setBackground(Color.WHITE);
        add(educationalbox);
        
        qualification = new JLabel("QUALIFICATION");
        qualification.setFont(new Font("Ralwey",Font.BOLD, 22));
        qualification.setBounds(100, 325, 200, 30);
        add(qualification);
        
        occupation  = new JLabel("OCCUPATION");
        occupation.setFont(new Font("Ralwey",Font.BOLD, 22));
        occupation.setBounds(100, 375, 200, 30);
        add(occupation);
        String Occupations[] = {"     ","Employed", "Self Emplyed", "Bussiness", "Retired", "Student", "Others"};
        occupationbox = new JComboBox(Occupations);
        occupationbox.setBounds(400, 375, 200, 30);
        add(occupationbox);
        
        panno = new JLabel("PAN NO. ");
        panno.setFont(new Font("Ralwey",Font.BOLD, 22));
        panno.setBounds(100, 425, 200, 30);
        add(panno);
        
        pantextfield = new JTextField();
        pantextfield.setFont(new Font("Ralwey",Font.ITALIC, 15));
        pantextfield.setBounds(400, 425,400,30);
        add(pantextfield);
        
        adhaarno = new JLabel("ADHAAR NO. ");
        adhaarno.setFont(new Font("Ralwey",Font.BOLD, 22));
        adhaarno.setBounds(100, 475, 200, 30);
        add(adhaarno);
        
        adhaartextfield = new JTextField();
        adhaartextfield.setFont(new Font("Ralwey",Font.ITALIC, 15));
        adhaartextfield.setBounds(400, 475,400,30);
        add(adhaartextfield);
        
        srcitizen = new JLabel("SENIOR CITIZEN ");
        srcitizen.setFont(new Font("Ralwey",Font.BOLD, 22));
        srcitizen.setBounds(100, 525, 200, 30);
        add(srcitizen);
        syes =new JRadioButton("Yes");
        syes.setBounds(400, 525, 75, 30);
        syes.setBackground(Color.WHITE);
        add(syes);
        sno = new JRadioButton("No");
        sno.setBounds(500, 525, 100, 30);
        sno.setBackground(Color.WHITE);
        add(sno);
        ButtonGroup citizengroup = new ButtonGroup();
        citizengroup.add(syes);
        citizengroup.add(sno);
        
        account = new JLabel("EXISTING ACCOUNT ");
        account.setFont(new Font("Ralwey",Font.BOLD, 22));
        account.setBounds(100, 575, 250, 30);
        add(account);
        eyes =new JRadioButton("Yes");
        eyes.setBounds(400, 575, 75, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        eno = new JRadioButton("No");
        eno.setBounds(500, 575, 100, 30);
        eno.setBackground(Color.WHITE);
        add(eno);
        ButtonGroup accountgroup = new ButtonGroup();
        accountgroup.add(eyes);
        accountgroup.add(eno);
        
        JButton next = new JButton("Next");
        next.setBounds(700, 640, 100, 30);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
        setSize(850, 750);
        setLocation(350, 10);
        setVisible(true );
    }
    public void actionPerformed(ActionEvent ae){
          //long
        String sreligion = (String)religionbox.getSelectedItem(); 
        String scategory = (String)categorybox.getSelectedItem();  
        String sincome = (String)incomebox.getSelectedItem(); 
        String seducation = (String)educationalbox.getSelectedItem(); 
        String soccupation = (String)occupationbox.getSelectedItem(); 
        
        String seniorcitizen = null;
        if(syes.isSelected()){
            seniorcitizen = "YES";
        }
        else if (sno.isSelected()){
            seniorcitizen = "NO";
        }
        
        String saccount = null;  
        if(eyes.isSelected()){
            saccount = "YES";
        }
        else if (eno.isSelected()){
            saccount = "NO";
        }
        String spanno = pantextfield.getText(); 
        String sadhaar = adhaartextfield.getText(); 
        try{
                conn c = new conn();
                String query = "insert into signuptwo values('"+formno+"', '"+sreligion+"', '"+scategory+"', '"+sincome+"', '"+seducation+"', '"+soccupation+"', '"+spanno+"', '"+sadhaar+"', '"+seniorcitizen+"', '"+saccount+"')";
                c.s.executeUpdate(query);
                setVisible(false );
            new signupThree(formno).setVisible(true);
    
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String arg[]){
        
        new SignupTwo("");
    }
    
}
