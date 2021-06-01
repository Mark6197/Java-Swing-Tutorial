import javax.swing.*;
import java.awt.event.*;

public class JListDemo {
	private JFrame frame;
	private JButton btn;
	//final field are read only. We can assign them in the declaration or in the constructor, they can't be changed later.
	private final JLabel label;
	private final DefaultListModel<String> l1;
	private final JList<String> list1, list2;

	JListDemo() {
		frame = new JFrame();
		label = new JLabel();
		label.setSize(500, 100);
		btn = new JButton("Show");
		btn.setBounds(200, 150, 80, 30);

		l1 = new DefaultListModel<>();//Create new instance of DefaultListModel.
						//We don't have to explicitly specify String type inside <> since we already specified it in the declaration of the variable.
		//Add the element of type String to the list
		l1.addElement("Mazda");
		l1.addElement("BMW");
		l1.addElement("Ferrari");
		l1.addElement("Honda");
		list1 = new JList<>(l1);//Create new JList instance and initialize it with the list we created
		list1.setBounds(100, 100, 75, 75);

		list2 = new JList<>(new String[] {"Red", "Black", "White", "Blue"}) ;//Another way to create JList is using simple array.
																	// We can declare the array before initialize or within the list initialization.
																	//Note- this is not type safe as the generic DefaultListModel
		list2.setBounds(100, 200, 75, 75);
		frame.add(list1);
		frame.add(list2);
		frame.add(btn);
		frame.add(label);
		frame.setSize(450, 450);
		frame.setLayout(null);//In this Demo we will set the layout to null
		frame.setVisible(true);
		
		btn.addActionListener(new ActionListener() {//Add action listener to the btn
			public void actionPerformed(ActionEvent e) {
				String data = "";//Empty string
				if (list1.getSelectedIndex() != -1) {//Check if there is an item selected in the first list
					data = "Car Selected: " + list1.getSelectedValue();//Get the first selected value
				}
				if (list2.getSelectedIndex() != -1) {////Check if there is an item selected in the second list
					data += ", Colors Selected: ";
					for (String color : list2.getSelectedValuesList()) {//Get all selected value, run in a loop over each string in the selected value list 
						data += color + " ";
					}
				}
				label.setText(data);//set the label text
			}
		});
	}

	public static void main(String args[]) {
		new JListDemo();
	}
}
