import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class JComboBoxDemo extends JFrame implements ActionListener {
	
	//JComboBox is a component that combines a button or editable field and a drop down box
	private JComboBox<String> comboBox;//We can use it also without the generics, <String> is for type safety purposes
	
	JComboBoxDemo(){
		String[] vehicles = {"Bus", "Car", "Motorcycle"};
		comboBox= new JComboBox<String>(vehicles);//Create new instance of JComboBox and set the vehicles as items 
		comboBox.addActionListener(this);//Register to ActionListener event that will be raised each time the selected item is changed
		comboBox.setEditable(true);//Allows to edit the text and not only choose, false by default
		System.out.println(comboBox.getItemCount());//Print items count 
		System.out.println(comboBox.getItemAt(1));//Print specific item
		//comboBox.addItem("Truck");//Add item to the comboBox
		comboBox.insertItemAt("Truck",1);//Add item to the comboBox as specific index
		//comboBox.removeItem("Truck");//Remove item by value
		//comboBox.removeItemAt(3);//Remove item by index
		//comboBox.removeAllItems();//Remove all items
		//comboBox.setSelectedIndex(3);//Set the selected index
		//comboBox.setSelectedItem("Truck");//Set the selected value
		
		this.add(comboBox);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==comboBox) {
			System.out.println(comboBox.getSelectedItem());//Print the selected item 
			System.out.println(comboBox.getSelectedIndex());//Print the selected index 

		}
	}

	public static void main(String[] args) {
		new JComboBoxDemo();
	}

}
