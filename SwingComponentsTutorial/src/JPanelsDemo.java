import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanelsDemo {
	
	public static void main(String[] args) {

		//JPanel is a GUI component that function as a container that holds other components- good for code reuse 
		MyCustomFrame frame= new MyCustomFrame();

		JPanel redPanel =new JPanel();//Create new instance of JPanel
		redPanel.setBackground(Color.RED);//Set the background color of the panel
		redPanel.setBounds(0, 0, 200, 200);//set the location of x=0, y=0 and width and height of 200
		
		JPanel greenPanel =new JPanel();
		greenPanel.setBackground(Color.GREEN);
		greenPanel.setBounds(200, 0, 200, 200);

		JPanel bluePanel =new JPanel();
		bluePanel.setBackground(Color.BLUE);
		bluePanel.setBounds(0, 200, 400, 200);
		
		greenPanel.setLayout(new BorderLayout());//Set the layout of the greenPanel to be BorderLayout in order to change the location of the label later
		
		//Add label to the panel
		JLabel label=new JLabel("Hello World");
		label.setVerticalAlignment(JLabel.CENTER);//set the vertical alignment of the label to center
		label.setHorizontalAlignment(JLabel.CENTER);//set the horizontal alignment of the label to center

		greenPanel.add(label);
		
		

		//For this demo we will set the layout to null again
		frame.setLayout(null);
		//Add panels to the frame
		frame.add(redPanel);
		frame.add(greenPanel);
		frame.add(bluePanel);
		
		

	}
}
