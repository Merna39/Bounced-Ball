
package Final_project;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Merna
 */
public class Gameplay extends JPanel implements KeyListener , ActionListener{

    private boolean play = false;
    private int score = 0;
    private Timer timer;
    private int delay = 8;
    private int playerX= 350;
    private int ballposY= 400;
    private int ballposX= 400;
     private int ballXdir= -1;
      private int ballYdir= -2;
      
      
      
      public Gameplay(){
		 addKeyListener(this);
		 setFocusable(true);
		 setFocusTraversalKeysEnabled(false);
	 timer=new Timer(delay,this);
	 timer.start();
      }
      
      
      public void paint(Graphics g) {
          
          //background
           g.setColor(Color.LIGHT_GRAY);
           g.fillRect(1,1,1000,700);
           
            //drawing map
            
            
             //borders
	    g.setColor(Color.white);
            g.fillRect(0,0,3,792);
	    g.fillRect(0,0,992,3);
	    g.fillRect(991,0,3,792);
            
            //the paddle
		 g.setColor(Color.GRAY);
		 g.fillRect(playerX,600,150,12);
                 
                 //the ball
		 g.setColor(Color.BLACK);
		 g.fillOval(ballposX,ballposY,25,25);
                 g.dispose();
      }
      
     
     
      
      
    @Override
    public void keyTyped(KeyEvent ke) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent ke) {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent ke) {
     // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
      
      if(ke.getKeyCode()==KeyEvent.VK_RIGHT) {
			if(playerX >=600) {
				playerX=600;
			}
			else {
				moveRight();
			}
		}
		if(ke.getKeyCode()==KeyEvent.VK_LEFT) {
			if(playerX < 10) {
				playerX=10;
			}
			else {
				moveLeft();
			}
		}
    }
		
		public void moveRight() {
		play=true;
		playerX+=20;
	}
	public void moveLeft() {
		play=true;
		playerX-=20;
	
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     timer.start();
     
     
      repaint();
    }
    
}
