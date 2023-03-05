package DemoGame;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class MapGenerator  {
	 public int map [][];
	 public int brickWidth;
	 public int brickHeight;
	 
	 
	 // this generates the bricks
	  public MapGenerator (int row, int col) {
		  map = new int [row][col];  
		  for (int i=0;i<map.length;i++) {
			  for (int j=0;j<map[0].length;j++) {
				  map[i][j]=1;  
			  }
		  }
		  
		   brickWidth = 540/col;
		   brickWidth = 150/row;
	  }
	  
	   // this draws the brick
	   public void draw(Graphics2D g) {
		   for (int i=0;i<map.length;i++) {
			   for (int j=0;j<map[0].length;j++) {
				   if(map[i][j]>0) {
					   g.setColor(Color.white);
					   g.fillRect(j*brickWidth+80,i*brickHeight+50,brickWidth,brickHeight);
					   
					   //g.setColor(Color.black);
					   g.setStroke(new BasicStroke(3));
					   g.drawRect(j*brickWidth+80,i*brickHeight+50,brickWidth ,brickHeight);
					   
				   }
			   }
		   }
	   }
	   
	   // this set the value of brick to 0 if it hit by the ball
	   public void setBrick(int value, int row, int col) {
		   map[row][col]=value;
	   }
}




