import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class JButtonDemo extends JFrame implements ActionListener {//The ActionListener is an interface belonging to awt and holds one single event: actionPerformed
	JButton button;//Declare as global component inside the class and not in the constructor in order to access the button in the event
	
	JButtonDemo() {
		button=new JButton(); //Create a new instance of JButton
		button.setText("Click Me!");//Set the desired text
		button.setBounds(200, 200, 100, 50);//Set the location, width and height
		button.addActionListener(this);//Set the action listener to this instance
		button.setFocusable(false);//Remove the focus from the button
		//We can add image to button, set font, change location, change colors etc.. just the same way we did with the label
		//button.setEnabled(false);//Disable the button
		
		
		this.setSize(700, 700);
		this.setTitle("Swing Buttons Demo");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.getContentPane().setBackground(Color.WHITE);
		this.setVisible(true);
		this.add(button);
	}

	@Override
	public void actionPerformed(ActionEvent e) {//Method from ActionListener interface that needs to be implemented
		if(e.getSource()==button){//Check if the source of the event is the button	
			if(this.getContentPane().getBackground()==Color.WHITE) {//Check if the background is white
				this.getContentPane().setBackground(Color.RED);//If do change it to red
			}	
			else {
				this.getContentPane().setBackground(Color.WHITE);//Else change it to white
			}
		}
	}
	
	public static void main(String[] args) {
		new JButtonDemo();
	}
}
