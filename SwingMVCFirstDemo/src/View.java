import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class View {
	// Private component used to display the view
	private JFrame frame;
	private JLabel firstnameLabel;
	private JLabel lastnameLabel;
	private JTextField firstnameTextfield;
	private JTextField lastnameTextfield;
	private JButton firstnameSaveButton;
	private JButton lastnameSaveButton;
	private JButton hello;
	private JButton bye;

	//The constructor able to receive title
	public View(String title) {
		frame = new JFrame(title);//Create new JFrame with provided title
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 120);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		// Create UI elements
		firstnameLabel = new JLabel("Firstname :");
		lastnameLabel = new JLabel("Lastname :");
		firstnameTextfield = new JTextField();
		lastnameTextfield = new JTextField();
		firstnameSaveButton = new JButton("Save firstname");
		lastnameSaveButton = new JButton("Save lastname");
		hello = new JButton("Hello!");
		bye = new JButton("Bye!");
		
		//Create GroupLayout for the frame
		//GroupLayout groups its components and places them in a Container hierarchically. The grouping is done by instances of the Group class.
		//Group is an abstract class and two concrete classes which implement this Group class are SequentialGroup and ParallelGroup.
		//SequentialGroup positions its child sequentially one after another where as ParallelGroup aligns its child on top of each other.
		//GroupLayout treats each axis independently. That is, there is a group representing the horizontal axis,
		//and a group representing the vertical axis. Each component must exists in both a horizontal and vertical group,
		//otherwise an IllegalStateException is thrown during layout, or when the minimum, preferred or maximum size is requested.
		GroupLayout layout = new GroupLayout(frame.getContentPane());
		layout.setAutoCreateGaps(true);	//Default false, if false, no gaps will be created between the components. We will need to add them manually.
										//If true, gaps will be created automatically
		layout.setAutoCreateContainerGaps(true);//Default false, same as above, 
									//the only difference is that here the gaps refer to the space between the container borders and the components inside. 
		//Set Horizontal Group
		layout.setHorizontalGroup(layout.createSequentialGroup()//Inside the horizontal group we create a sequential group 
																//which is a Group that positions and sizes its elements sequentially, one after another.
				//Now we will add 4 parallel groups, all with leading alignment, to each group we will add two components
				//Each group is like a column, all 4 columns are parallel, and they are all inside one sequence
				//Parallel group is a Group that aligns and sizes it's children.
				//GroupLayout.Alignment.LEADING indicates the elements should be aligned to the origin. 
				//In our case it's left to right in horizontal group so it will all be alligned to the left
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(firstnameLabel)
						.addComponent(lastnameLabel))
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(firstnameTextfield)
						.addComponent(lastnameTextfield))
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(firstnameSaveButton)
						.addComponent(lastnameSaveButton))
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(hello)
						.addComponent(bye)));
		//Set Vertical Group
		layout.setVerticalGroup(layout.createSequentialGroup()//Inside the vertical group we also create a sequential group
				//Now we will add two parallel groups, all with baseline alignment and add 4 components to each (same components that we already added before)
				//Each group is like a row, the 2 rows are parallel, and they are inside one sequence
				//GroupLayout.Alignment.BASELINE indicates the elements should be aligned along their baseline.
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(firstnameLabel)
						.addComponent(firstnameTextfield).addComponent(firstnameSaveButton).addComponent(hello))
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(lastnameLabel)
						.addComponent(lastnameTextfield).addComponent(lastnameSaveButton).addComponent(bye)));
		
		//linkSize forces two components be in the same size even if their preferred sizes are different
		//When we set the linkSize axis to horizontal the width will be the same, for vertical the height will be the same
		layout.linkSize(SwingConstants.HORIZONTAL, firstnameSaveButton, lastnameSaveButton);
		layout.linkSize(SwingConstants.HORIZONTAL, hello, bye);
		
		//Set the GroupLayout to the frame
		frame.getContentPane().setLayout(layout);
	}
		
	//Expose the frame- Getter
	public JFrame getFrame() {
		return frame;
	}
	
	//Setter for the frame
	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	//Expose the first name label- Getter
	public JLabel getFirstnameLabel() {
		return firstnameLabel;
	}
	
	//Setter for the first name label
	public void setFirstnameLabel(JLabel firstnameLabel) {
		this.firstnameLabel = firstnameLabel;
	}

	//Expose the last name label- Getter
	public JLabel getLastnameLabel() {
		return lastnameLabel;
	}

	//Setter for the last name label
	public void setLastnameLabel(JLabel lastnameLabel) {
		this.lastnameLabel = lastnameLabel;
	}

	//Expose the first name text field- Getter
	public JTextField getFirstnameTextfield() {
		return firstnameTextfield;
	}

	//Setter for the first name text field
	public void setFirstnameTextfield(JTextField firstnameTextfield) {
		this.firstnameTextfield = firstnameTextfield;
	}

	//Expose the last name text field- Getter
	public JTextField getLastnameTextfield() {
		return lastnameTextfield;
	}

	//Setter for the last name text field
	public void setLastnameTextfield(JTextField lastnameTextfield) {
		this.lastnameTextfield = lastnameTextfield;
	}

	//Expose the first name save button- Getter
	public JButton getFirstnameSaveButton() {
		return firstnameSaveButton;
	}

	//Setter for the first name save button
	public void setFirstnameSaveButton(JButton firstnameSaveButton) {
		this.firstnameSaveButton = firstnameSaveButton;
	}

	//Expose the last name save button- Getter
	public JButton getLastnameSaveButton() {
		return lastnameSaveButton;
	}

	//Setter for the last name save button
	public void setLastnameSaveButton(JButton lastnameSaveButton) {
		this.lastnameSaveButton = lastnameSaveButton;
	}

	//Expose the hello button- Getter
	public JButton getHello() {
		return hello;
	}

	//Setter for the hello button
	public void setHello(JButton hello) {
		this.hello = hello;
	}

	//Expose the bye button- Getter
	public JButton getBye() {
		return bye;
	}

	//Setter for the bye button
	public void setBye(JButton bye) {
		this.bye = bye;
	}
}