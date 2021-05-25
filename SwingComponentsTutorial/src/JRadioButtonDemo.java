import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class JRadioButtonDemo extends JFrame implements ActionListener {
	private JRadioButton btn1, btn2, btn3;
	//JRadioButton is one or more buttons in a group that only one can be selected 
	JRadioButtonDemo(){

		btn1= new JRadioButton("Button 1");
		btn2= new JRadioButton("Button 2");
		btn3= new JRadioButton("Button 3");

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
		if(e.getSource()==btn1) {
			System.out.println("btn1 has been chosen");
		}
		else if(e.getSource()==btn2) {
			System.out.println("btn2 has been chosen");
		}
		else if(e.getSource()==btn3) {
			System.out.println("btn3 has been chosen");
		}
	}
	
	public static void main(String[] args) {
		new JRadioButtonDemo();
	}

}
