
package Final_project;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.Timer;


public class Gameplay extends JPanel implements KeyListener , ActionListener{

    private boolean play = false;
    private int score = 0;
    private Timer timer;
    private int delay = 8;
    private int playerX= 310;
    private int ballposY= 120;
    private int ballposX= 350;
     private int ballXdir= -1;
      private int ballYdir= -2;
      private MapGenerator map;
       private int totalBricks=21;
      
      
      public Gameplay(){
		 addKeyListener(this);
		 setFocusable(true);
		 setFocusTraversalKeysEnabled(false);
	 timer=new Timer(delay,this);
	 timer.start();
	 map=new MapGenerator(3,7);
      }
      
      
      public void paint(Graphics g) {
          
          //background
           g.setColor(Color.LIGHT_GRAY);
           g.fillRect(1,1,692,592);
           
            //drawing map
             map.draw((Graphics2D)g);
            
             //borders
	    g.setColor(Color.PINK);
            g.fillRect(0,0,3,592);
	    g.fillRect(0,0,992,3);
	    g.fillRect(691,0,3,592);
            
            //the paddle
		 g.setColor(Color.black);
		 g.fillRect(playerX,550,100,8);
                 
                 //the ball
		 g.setColor(Color.MAGENTA);
		 g.fillOval(ballposX,ballposY,20,20);
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
     if(play){
         if(new Rectangle(ballposX,ballposY,20,20).intersects(new Rectangle(playerX,550,100,8))){
         ballYdir=-ballYdir;
         
         
         }
         
     ballposX+=ballXdir;
     ballposY+=ballYdir;
     if(ballposX<0){
     ballXdir=-ballXdir;
     }
     if(ballposY<0){
     ballYdir=-ballYdir;
     }
     if(ballposX>670){
     ballXdir=-ballXdir;
     }
     }
     
      repaint();
    }
    
}
