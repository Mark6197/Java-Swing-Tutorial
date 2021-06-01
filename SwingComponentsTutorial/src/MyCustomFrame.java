import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MyCustomFrame extends JFrame {


	MyCustomFrame() {

		this.setSize(700, 700);
		this.setTitle("Swing First Demo");

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setResizable(false);	

		ImageIcon image = new ImageIcon("images/Logo.png");
		this.setIconImage(image.getImage());

		this.getContentPane().setBackground(Color.yellow); 
		
		this.setVisible(true);
	}
}