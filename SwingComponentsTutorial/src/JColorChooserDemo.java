import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class JColorChooserDemo extends JFrame implements ActionListener {

	// JColorChooser is Gui mechanism that let's a user choose a color

	private JButton btn;
	private JLabel label;

	JColorChooserDemo() {
		btn = new JButton("Choose Color");
		btn.addActionListener(this);
		label= new JLabel("Sample Text");

		this.add(btn);
		this.add(label);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn) {
				
				Color color= JColorChooser.showDialog(this, "Pick some color", Color.BLACK);//Open the color dialog and set the chosen color into variable
																							//This method is static. we don't have an instance of JColorChooser
				
				label.setForeground(color);//change the text color of the label
			}
		}
	

	public static void main(String[] args) {
		new JColorChooserDemo();
	}

}
