import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Panel2D extends JPanel {
	Panel2D(){
		this.setPreferredSize(new Dimension(500,500));
	}
	
	@Override
	public void paint(Graphics g) {//Override the father's paint method in order to draw on the panel
		Graphics2D g2d= (Graphics2D)g;//Cast the Graphics received in the paint method to Graphics2D
		g2d.setColor(Color.RED);//Set the color to red
		g2d.setStroke(new BasicStroke(5));//Set the width of the line to 5px 
		//g2d.drawLine(0, 0, 500, 500);//Draw a line starting at point (0,0) and ending at point (500,500)
		//g2d.drawRect(100, 100, 300, 300);//Draw a rectangle with upper left corner at (100,100) and with width and height of 300px
		g2d.setColor(Color.GREEN);//Set the color to green
		//g2d.fillRect(100, 100, 300, 300);//Fill the rectangle
		
		//If we will draw the line first and then the rectangle, the rectangle will be on top of the line and hide part of it
		//g2d.drawOval(100, 100, 300, 300);//Draw circle
		//g2d.fillOval(100, 100, 300, 300);//Fill the circle
		
		//g2d.drawArc(100,100,200,200,0,180);//Draw half circle
	
		//g2d.drawArc(100,100,200,200,180,180);//Flip it
		//g2d.drawArc(100,100,200,200,0,270);//Draw 3/4 of a circle
		
		//int[] xPoints= {150,250,350};
		//int[] yPoints= {300,150,300};
		//g2d.drawPolygon(xPoints,yPoints,3);//Draw rectangle using polygon, specify x points and y points of the corners and number of corners,
										   //we can specify more than 3 corners and create different shapes.
				
		//g2d.fillPolygon(xPoints,yPoints,3);//Fill the rectangle using polygon
		g2d.setColor(Color.BLACK);//Set the color to black
		g2d.setFont(new Font("Ink Free", Font.BOLD,40));
		g2d.drawString("Hello world", 100, 100);
	}
}
