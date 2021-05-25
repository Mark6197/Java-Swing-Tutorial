import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class JCheckBoxDemo extends JFrame implements ActionListener {
	
	//JCheckBox is a GUI component that can be selected or deselected 
	private JCheckBox box;
	private JButton btn;
	
	JCheckBoxDemo(){
		box= new JCheckBox("Check box");
		//We can change checkbox font, color, imageicon etc.. just like we did with JLabel and JTextField 
		btn= new JButton("Print");
		btn.addActionListener(this);
		
		this.add(box);
		this.add(btn);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn) {
			System.out.println(box.isSelected());//Print if the checkbox is selected or not
		}
	}
	
	public static void main(String[] args) {
		new JCheckBoxDemo();
	}
}
