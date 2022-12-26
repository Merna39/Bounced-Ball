package Final_project;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class HomePage extends JFrame{
  
  public HomePage (GamePlay gamePlay){ 
    
    JFrame frame = new JFrame ("   ");
       frame.setSize(700 , 600);
       frame.setVisible(true);
       frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
       frame.setLocationRelativeTo(null);
       frame.setLayout(new FlowLayout(600, 300, 150));
       JButton button1 = new JButton("          play      ");
       button1.setBackground(Color.yellow);
       button1.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent ae) {
         
            JFrame theFrame = new JFrame("Bounced Ball");
            theFrame.setBounds(1,1,700,600);
            theFrame.setResizable(false);
            theFrame.setLocation(500, 300);
            theFrame.add(gamePlay);
        
            theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            theFrame.setVisible(true);
          }
       });
       
       frame.add(button1);
       
  }
}
