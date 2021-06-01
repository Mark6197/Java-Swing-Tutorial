import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

@SuppressWarnings("serial")
public class JRadioButtonDemo extends JFrame implements ActionListener {
	private JRadioButton btn1, btn2, btn3;
	//JRadioButton is one or more buttons in a group that only one can be selected 
	JRadioButtonDemo(){

		btn1= new JRadioButton("Button 1");
		btn1.setName("btn1");//We can name any component
		btn2= new JRadioButton("Button 2");
		btn2.setName("btn2");
		btn3= new JRadioButton("Button 3");
		btn3.setName("btn3");

		//We can change radiobutton font, color, imageicon etc.. just like we did with JLabel and JTextField 
		
		ButtonGroup btnGroup=new ButtonGroup();//Create a ButtonGroup that will hold all the radio buttons
		btnGroup.add(btn1);
		btnGroup.add(btn2);
		btnGroup.add(btn3);

		//Set the ActionListener for each JRadioButton
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);

		this.add(btn1);
		this.add(btn2);
		this.add(btn3);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JRadioButton btn= (JRadioButton)e.getSource();//Get the event source and cast it to JRadioButton
		System.out.println(String.format("%s has been chosen", btn.getName()));//We can get name of any element using getName() method
		System.out.println(String.format("%s has been chosen", btn.getText()));//We can get text of any element using getName() method
		//We can get more information from each component for example: getBackgroud(), getFont()
	}
	
	public static void main(String[] args) {
		new JRadioButtonDemo();
	}

}
