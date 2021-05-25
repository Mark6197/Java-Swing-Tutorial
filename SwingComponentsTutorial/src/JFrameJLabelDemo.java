import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class JFrameJLabelDemo {

	public static void main(String[] args) {
		// Step 1: write all code inside main
		/*
		//JFrame is a GUI window that we can add components to 
		 
		JFrame frame=new JFrame(); //Create a new instance of a frame which is a gui window that we can add components to
		
		frame.setSize(700,700);//Set the size of the frame (x-dimension, y-dimension)
		frame.setTitle("Swing First Demo");//Set the title at the top of the window
		
		//frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);//This if the default behavior of JFrame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Exit the application when closing the application
		//frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);//Prevent the user from exit the application
		
		frame.setResizable(false);//Prevent the user from resizing the window (true by default)

		frame.setVisible(true);//Make the frame visible (false by default)
		
		ImageIcon image= new ImageIcon("images/Logo.png");//Create new instance of ImageIcon and pass the icon's file path
		frame.setIconImage(image.getImage());//Set the frame's icon to the image
		
		frame.getContentPane().setBackground(Color.yellow); //Set the frame's background color using awt colors
		//frame.getContentPane().setBackground(new Color(0,255,0)); //Set the frame's background color using rgb values (0-255 range)
		//frame.getContentPane().setBackground(new Color(0xFF0000)); //Set the frame's background color using hexadecimal  value
		 */
		
		//Step 2: move all the code to the constructor of MyCustomFrame class in order to reuse it
		//new MyCustomFrame();//Create new instance without saving as variable
		MyCustomFrame frame= new MyCustomFrame();//Create new instance and save it as variable in order to use it later
		
		//Step 3- creating label and adding it to the frame
		//JLabel is a GUI component that display string, image or both
		JLabel label=new JLabel("Hello world");//Create new instance of JLabel
		//label.setText("Hello World");//If we want to pass the text later (not when creating the label)
		
		ImageIcon icon= new ImageIcon("images/Hello World Logo.jpg");//Create new instance of ImageIcon and pass the icon's file path
		label.setIcon(icon);//Add the icon to the label
		label.setHorizontalTextPosition(JLabel.CENTER);//Set the text horizontal position to be in center of the image, can be also RIGHT or CENTER (RIGHT by default)
		label.setVerticalTextPosition(JLabel.TOP);//Set the text vertical position to be in top of the image, can be also BUTTOM or CENTER (RIGHT by default)
		label.setIconTextGap(15);//Set the space between icon and text to 14px (4 by default), negative values will make the space smaller
		label.setFont(new Font("DAVID", Font.BOLD, 20));//Set the font
		label.setBackground(Color.CYAN);//Change the background color of the label
		label.setOpaque(true);//Display the background color of the label and not color of the frame. 
						      //at this moment the size of the label is same as the size of the frame
		
		//DO NOT FORGET TO ADD THE LABEL TO THE FRAME (LINE 76)
		
		//Step 4- set the border of the label to show that it's indeed same size as the frame
		Border border= BorderFactory.createLineBorder(Color.DARK_GRAY,4);//Create a border 4 px wide in dark grey color using the BorderFactory
		//Border border= BorderFactory.createDashedBorder(Color.DARK_GRAY,4, 4, 4, false);//Create a dashed border 4 px wide and 4 px interval 
																						  //in dark grey color using the BorderFactory, false is for rounded
		label.setBorder(border);//Set the border to the label (could make both lines as one)
		
		label.setVerticalAlignment(JLabel.TOP);//Set the label vertical position to in top of the frame, can be also RIGHT or CENTER (CENTER by default)
		label.setHorizontalAlignment(JLabel.CENTER);//Set the label vertical position to in center of the frame, can be also RIGHT or CENTER (LEFT by default)

		//Step 5- Optional make the image to not be same size as the frame (not best practice but nice to know)
		//frame.setLayout(null);//For now let's set the layout to null instead of the default FlowLayout
		//label.setBounds(0,0,200,200);//Set the position of the label to x=0, y=0 and the width and height to 200 each
		//Now the image won't be the same size as the frame
		
		//Step 6- Set the frame size as the label
		//First, for this step we won't set size to the frame- mark this line out in the MyCustomFrame class line num 12
		//Second, add frame.pack() after the label has been added (LINE 77)
		
		frame.add(label);//Add the label to the frame
		//frame.pack();
		
		//frame.remove(label);//Remove component from a frame 
		//frame.remove(0);//Remove component from a frame by it's index
		//frame.removeAll();//Remove all components from a frame 
	}

}
