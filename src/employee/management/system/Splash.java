
package employee.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Splash extends JFrame implements ActionListener{
    Splash(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading= new JLabel("EMPLOYEE MANAGEMENT SYSTEM"); 
        heading.setBounds(60,30,1200,60 );
        heading.setFont(new Font("serit",Font.BOLD,60));
        heading.setForeground(Color.red);
        add(heading);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
        Image i2= i1.getImage().getScaledInstance(1100, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image =new JLabel(i3);
        image.setBounds(50, 100, 1050, 500);
        add(image);
        
        JButton clickHere = new JButton("CLICK TO CONTINUE");
        clickHere.setBounds(400,400 ,300 ,70 );
        clickHere.setBackground(Color.red);
        clickHere.setForeground(Color.white);
        clickHere.addActionListener(this);
        image.add(clickHere);
        
        setSize(1170,650);
        setLocation(200,50);
        setVisible(true);
        
        while(true){
            heading.setVisible(false);
            try{
                Thread.sleep(500);
            }catch(Exception e){
                
            }
            heading.setVisible(true);
            try{
                Thread.sleep(500);
            }catch(Exception e){
                
            } 
        }
    }
    public static void main(String srg[]){
        new Splash();
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        setVisible(false);
        new Login();
    }
}
