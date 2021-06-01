import javax.swing.JOptionPane;

public class Controller {
	//The controller holds the model and the view as private fields
	private Model model;
	private View view;

	//We initialize the private fields in the constructor and call initView() method
	public Controller(Model m, View v) {
		model = m;
		view = v;
		initView();
	}

	//In the initView we will get the data from the model and manipulate the view
	//That means that we will take the first and last name and set them in the text fields
	public void initView() {
		view.getFirstnameTextfield().setText(model.getFirstname());
		view.getLastnameTextfield().setText(model.getLastname());
	}

	//In the initController we will register all the events in order to complete the initialization of the controller
	//We use the getters we defined in the view to get the elements and ActionListener to them
	public void initController() {
		view.getFirstnameSaveButton().addActionListener(e -> saveFirstname());
		view.getLastnameSaveButton().addActionListener(e -> saveLastname());
		view.getHello().addActionListener(e -> sayHello());
		view.getBye().addActionListener(e -> sayBye());
	}

	
	//saveFirstname and saveLastname will first save the names to the model and then
	//will display message dialog that the save was successful with the data from the model
	private void saveFirstname() {
		model.setFirstname(view.getFirstnameTextfield().getText());
		JOptionPane.showMessageDialog(null, "Firstname saved : " + model.getFirstname(), "Info",
				JOptionPane.INFORMATION_MESSAGE);
	}

	private void saveLastname() {
		model.setLastname(view.getLastnameTextfield().getText());
		JOptionPane.showMessageDialog(null, "Lastname saved : " + model.getLastname(), "Info",
				JOptionPane.INFORMATION_MESSAGE);
	}

	//SayHello will open message dialog and display message to the user with the details from the model
	private void sayHello() {
		JOptionPane.showMessageDialog(null, "Hello " + model.getFirstname() + " " + model.getLastname(), "Info",
				JOptionPane.INFORMATION_MESSAGE);
	}

	//sayBye will exit the application
	private void sayBye() {
		System.exit(0);
	}
}