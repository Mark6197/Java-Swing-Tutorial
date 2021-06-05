public class Main {
	public static void main(String[] args) {
		// Assemble all the pieces of the MVC
		Model m = new Model("John", "Smith");//Create a model and initialize it
		View v = new View("MVC Demo");//Create a view and initialize it
		Controller c = new Controller(m, v);//Create a controller and initialize it with the model and the view
		c.initController();//Initialize the controller
	}
}
