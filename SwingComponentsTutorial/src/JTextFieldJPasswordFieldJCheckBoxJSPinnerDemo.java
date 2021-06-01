import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.util.Calendar;
//import java.util.Date;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JSpinner;
import javax.swing.JTextField;
//import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerNumberModel;

public class JTextFieldJPasswordFieldJCheckBoxJSPinnerDemo implements ActionListener {

	// JTextField is a GUI text box component that can be used to add set or get text
	// JPasswordField is a text box component specialized for password entry.
	// JCheckBox is a GUI component that can be selected or deselected 

	private JFrame frame;
	private JLabel userLabel, passLabel, ageLabel;
	private JButton btn;
	private JTextField textField;
	private JPasswordField passField;  
	private JCheckBox checkBox;
	private JSpinner spinner;

	JTextFieldJPasswordFieldJCheckBoxJSPinnerDemo(){
		frame=new JFrame();
		userLabel= new JLabel("Username: ");
		textField=new JTextField();//Create new JTextField instance
		textField.setPreferredSize(new Dimension(300,50));//Set size 
		textField.setFont(new Font("Consolas", Font.PLAIN, 40));//Set font
		textField.setText("Some text...");//Placeholder text
		//textField.setEditable(false);//Default true, If false make the text field read only
		textField.setEnabled(true);//Default true, If false make the text field disabled
		
		passLabel= new JLabel("Password: ");
		passField=new JPasswordField();//Create new JPasswordField instance
		passField.setPreferredSize(new Dimension(300,50));//Set size 
		passField.setFont(new Font("Consolas", Font.PLAIN, 40));//Set font
		
		ageLabel= new JLabel("Age: ");
		spinner= new JSpinner(new SpinnerNumberModel(18,0,120,1));//Create new JSpinner instance and set the initial value, min value, max value and intervals
																  //We can also use the spinner with DateModel and ListModel
		//JSpinner dateSpinner = new JSpinner(new SpinnerDateModel(new Date(), null, null, Calendar.MONTH));//Create new JSpinner with today's date and not minimum or maximum dates
	    //JSpinner.DateEditor editor = new JSpinner.DateEditor(dateSpinner, "dd/MM/yy");//Create DateEditor with format pattern
	    //dateSpinner.setEditor(editor);//Set the editor to the spinner
		
		checkBox=new JCheckBox("Show Password");//Create new JCheckBox instance
		//We can change checkbox font, color, imageicon etc.. just like we did with JLabel and JTextField 

		btn= new JButton("Submit");
		btn.addActionListener(this); 
		
		checkBox.addActionListener(new ActionListener() {//Add action listener that will listen to changes in checkbox selection 
			public void actionPerformed(ActionEvent e) {
				if(checkBox.isSelected()) {//If the checkbox is selected
					passField.setEchoChar((char)0);//Set the echo character that will be displayed as 0 that converted to char
				}
				else {
					passField.setEchoChar('*');//Set the echo character that will be displayed as *, we can also use other characters but it's common to use *.
				}
			}
		});
		
		frame.add(userLabel);
		frame.add(textField);
		frame.add(passLabel);
		frame.add(passField);
		frame.add(ageLabel);
		frame.add(spinner);
		//frame.add(dateSpinner);
		frame.add(checkBox);
		frame.add(btn);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		frame.setSize(400,200);
		frame.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn) {
			System.out.println("Username: " + textField.getText());//Get the text out of the text field and print to console
			System.out.println("Password: " + new String(passField.getPassword()));//Get the text out of the password field and print to console
																				   //Note that the return type of getPassword is char[] 
																				   //that why we need to cast it into String
			System.out.println("Age: " + spinner.getValue());//Get the value from the spinner and print it to the console
		}
	}
	
	public static void main(String[] args) {
		new JTextFieldJPasswordFieldJCheckBoxJSPinnerDemo();
	}
}
