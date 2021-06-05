import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

@SuppressWarnings("serial")
public class Animation2DPanel extends JPanel {
	//Fields
	final int PANEL_WIDTH = 700;
	final int PANEL_HEIGHT = 490;
	Image ball, backgroundImage;
	Timer timer;
	int xVelocity = 2;//xVelocity is a variable that will be used to move the image on it's x axis
	int yVelocity = 1;//yVelocity is a variable that will be used to move the image on it's y axis
	int x = 0;//Starting x point
	int y = 0;//Starting y point

	Animation2DPanel() {
		this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
		ball = new ImageIcon("images/ball.png").getImage();
		backgroundImage=new ImageIcon("images/field.jpg").getImage();
		
		timer = new Timer(10, new ActionListener() {//The timer will invoke actionPerformed method each 10 milliseconds
			@Override
			public void actionPerformed(ActionEvent e) {
				if (x >= PANEL_WIDTH - ball.getWidth(null) || x < 0) {//Check if the current x is greater than the panel width,
																	//since the x represents the top left corner we need to decrease the width of the image
																	//or if x is smaller than zero
					xVelocity = xVelocity * -1;//If one of the two cases is true we will multiply the xVelocity with -1 in order to change the direction of the image
				}

				if (y >= PANEL_HEIGHT - ball.getHeight(null) || y < 0) {//same with y
					yVelocity = yVelocity * -1;
				}

				x += xVelocity;//add xVelocity to x in order to move the image
				y += yVelocity;//add yVelocity to y in order to move the image
				repaint();//repaint and make the image actually move
			}
		});
		timer.start();//Start the timer
	}

	//this method will be invoked each time using repaint()
	//@Override
	//public void paint(Graphics g) {
		//super.paint(g);//Call the father paint method and pass it the Graphics in order to show the background image

		//Graphics2D g2D = (Graphics2D) g;//Cast Graphics into Graphics2D
		//g2D.drawImage(backgroundImage, 0, 0, null);//draw the background image with x and y of left top corner at (0,0)
		//g2D.drawImage(ball, x, y, null);//draw the image at the current x and y
	//}
	
	//this method will also be invoked each time using repaint()
	//The difference is that paint is like the main paint method that calls different more concrete methods such as paintComponent, paintChildren, paintBorder
	//When overriding the paint method we most likely will need to call the fathers paint method just like we did in the example above
	//When overriding paintComponent we only overriding this specific method, the background image will still be printed by the father
	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2D = (Graphics2D) g;//Cast Graphics into Graphics2D
		g2D.drawImage(backgroundImage, 0, 0, null);//draw the background image with x and y of left top corner at (0,0)
		g2D.drawImage(ball, x, y, null);//draw the image at the current x and y	
	}
}
