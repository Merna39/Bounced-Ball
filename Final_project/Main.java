/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final_project;

import java.awt.Color;
import javax.swing.JFrame;


public class Main {
    public static void main(String[] args) {
        Gameplay gamePlay = new Gameplay();
       JFrame theFrame = new JFrame("Bounced Ball");
       theFrame.setBounds(10,10,700,600);
        theFrame.setResizable(false);
//       theFrame.setLocationRelativeTo(null);
        theFrame.setLocation(300, 300);
        theFrame.add(gamePlay);
        theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        theFrame.setVisible(true);
//        thePanel.playGame();
    }
}
