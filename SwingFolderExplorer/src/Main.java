import javax.swing.JFrame;

@SuppressWarnings("serial")
class Main extends JFrame {

	Main(String path) {
		super("Windows Explorer");
		add(new Explorer(path), "Center");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Main(".");
	}
}
