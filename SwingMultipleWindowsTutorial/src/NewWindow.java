import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow {
	JFrame frame= new JFrame();
	JLabel label=new JLabel("You opened the new window!");
	
	NewWindow(){
		label.setBounds(0,0,200,50);
		
		frame.add(label);
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}
