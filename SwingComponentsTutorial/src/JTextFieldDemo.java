import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class JTextFieldDemo extends JFrame implements ActionListener {

	// JTextField is a GUI textbox component that can be used to add set or get text
	private JButton btn;
	private JTextField textField;
	
	JTextFieldDemo(){
		textField=new JTextField();//Create new JTextField instance
		textField.setPreferredSize(new Dimension(300,50));//Set size 
		textField.setFont(new Font("Consolas", Font.PLAIN, 40));//Set font
		textField.setText("Some text...");//Placeholder text
		//textField.setEditable(false);//Make the text field readonly
		
		
		btn= new JButton("Submit");
		btn.addActionListener(this); 
		
		this.add(textField);
		this.add(btn);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn) {
			System.out.println(textField.getText());//Get the text out of the text field and print to console
		}
	}
	
	public static void main(String[] args) {
		new JTextFieldDemo();
	}
}
