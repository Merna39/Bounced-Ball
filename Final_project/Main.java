
package Final_project;

import java.awt.Color;
import javax.swing.JFrame;


public class Main {
    public static void main(String[] args) {
        Gameplay gamePlay = new Gameplay();
       JFrame theFrame = new JFrame("Bounced Ball");
       theFrame.setBounds(10,10,1000,700);
        theFrame.setResizable(false);
        theFrame.setLocation(300, 300);
        

    }
}
