import javax.swing.JFrame;

public class Animation2DDemo {

	private JFrame frame;
	private Animation2DPanel panel;
	
	public Animation2DDemo() {
		frame=new JFrame();
		panel=new Animation2DPanel();
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Animation2DDemo();
	}
}
