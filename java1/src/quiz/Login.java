package quiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
 
    JButton proceed, back;
    JTextField tfname;
    
    Login() {
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/LOGIN.jpg"));


        JLabel image = new JLabel(i1);
        image.setBounds(-50, -100, 900, 900);
        add(image);
        
        JLabel heading = new JLabel("BRAIN TESTER");
        heading.setBounds(750, 60, 600, 200);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 50));
        heading.setForeground(Color.WHITE);
        add(heading);
        
        JLabel name = new JLabel("Enter your name");
        name.setBounds(850, 170, 300, 150);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 28));
        name.setForeground(Color.WHITE);
        add(name);
        
        tfname = new JTextField();
        tfname.setBounds(799, 300, 300, 40);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(tfname);
        
        proceed = new JButton("Proceed");
        proceed.setBounds(820, 370, 120, 35);
        proceed.setBackground(Color.GRAY);
        proceed.setForeground(Color.BLACK);
        proceed.addActionListener(this);
        add(proceed);
        
        back = new JButton("Back");
        back.setBounds(950, 370, 120, 35);
        back.setBackground(Color.GRAY);
        back.setForeground(Color.BLACK);
        back.addActionListener(this);
        add(back);
        
        setSize(1200, 500);
        setLocation(200, 150);
        setVisible(true);
    }
    
   public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == proceed) {
            String name = tfname.getText();
            setVisible(false);
           new  Proceed(name);
        } else if (ae.getSource() == back) {
            setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        new Login();
    }
}

