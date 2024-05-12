package quiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Proceed extends JFrame implements ActionListener{

    String name;
    JButton start, back;
    
    Proceed(String name) {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome " + name + " to Brain Tester");
        heading.setBounds(400, 20, 700, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        heading.setForeground(Color.BLACK);
        add(heading);
        
        JLabel proceed = new JLabel();
        proceed.setBounds(300, 100, 700, 370);
        proceed.setFont(new Font("Tahoma", Font.PLAIN, 20));
        proceed.setText(
            "<html>"+ 
                "1. Participants must carefully read and understand the instructions provided before starting the quiz." + "<br><br>" +
                "2. Participants must complete the quiz within the allotted time." + "<br><br>" +
                "3. You may have lot of options in life but here all the questions are compulsory." + "<br><br>" +
                "4. Each question may have a time limit for answering. Participants must submit their responses within the allotted time." + "<br><br>" +
                "5. After the quiz concludes, participants will receive their individual scores." + "<br><br>" +
            "<html>"
        );
        add(proceed);
        
        back = new JButton("Back");
        back.setBounds(440, 500, 100, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.BLACK);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Start");
        start.setBounds(650, 500, 100, 30);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.BLACK);
        start.addActionListener(this);
        add(start);
        
        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            //new Login();
        }
    }
    
    public static void main(String[] args) {
        new Proceed("User");
    }
}

