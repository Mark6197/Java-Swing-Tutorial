import javax.swing.JFrame;

public class Graphics2DDemo {

	JFrame frame;
	Panel2D panel;
	
	Graphics2DDemo(){
		frame= new JFrame();
		panel= new Panel2D();
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Graphics2DDemo();
	}
}
