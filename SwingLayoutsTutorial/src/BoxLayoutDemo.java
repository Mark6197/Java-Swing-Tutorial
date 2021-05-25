import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BoxLayoutDemo {

	public static void main(String[] args) {
		//The BoxLayout is used to arrange the components either vertically or horizontally
		//BoxLayout is a class that belongs to Swing
		
		JFrame frame=new JFrame();
		frame.setSize(500, 500);
		frame.setTitle("Box Layout Demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));//Set the layout to BoxLayout and pass it the target 
												//(in this case we need to set the target to the container that we get from JFrame's getContentPane function)  
												//Set the layout direction from left to right
		
		//frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));//Set the layout direction from top to button
		
		//frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.LINE_AXIS));
		//Components are laid out the way words are laid out in a line, based on the container's ComponentOrientation property.
		//If the container's ComponentOrientation is horizontal then components are laid out horizontally,
		//otherwise they are laid out vertically. For horizontal orientations,
		//if the container's ComponentOrientation is left to right then components are laid out left to right, otherwise they are laid out right to left.
		//For vertical orientations components are always laid out from top to bottom.
		
		//frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.PAGE_AXIS));
		//Components are laid out the way text lines are laid out on a page, based on the container's ComponentOrientation property.
		//If the container's ComponentOrientation is horizontal then components are laid out vertically, otherwise they are laid out horizontally.
		//For horizontal orientations, if the container's ComponentOrientation is left to right then components are laid out left to right,
		//otherwise they are laid out right to left.  For vertical orientations components are always laid out from top to bottom.		
		
		JButton[] buttons = new JButton [5];//Create empty array of 5 buttons
	    
		for (int i = 0;i<5;i++) {  //run 5 times
			buttons[i] = new JButton ("Button " + (i + 1));  //Add new button to the array
		    frame.add(buttons[i]);  //Add the button to the frame
		}  
		
		frame.setVisible(true);
	}

}
