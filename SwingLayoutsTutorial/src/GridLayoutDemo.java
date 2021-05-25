import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutDemo {

	public static void main(String[] args) {
		// The GridLayout place components in a grid of cells like a table. Each component will fit into all the available space in the cell,
		// all the cells are the same size
		//GridLayout is a class that belongs to awt

		JFrame frame=new JFrame();
		frame.setSize(500, 500);
		frame.setTitle("Grid Layout Demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(3,3));//Set the layout to GridLayout and pass it number of columns and number of rows
		//frame.setLayout(new GridLayout(3,3,5,5));//We can also set the hgap and vgap for the GridLayout

		frame.add(new JButton("1"));
		frame.add(new JButton("2"));
		frame.add(new JButton("3"));
		frame.add(new JButton("4"));
		frame.add(new JButton("5"));
		frame.add(new JButton("6"));
		frame.add(new JButton("7"));		
		frame.add(new JButton("8"));
		frame.add(new JButton("9"));

		//If we will add another button we will 10 components for 9 cells so what will happen?
		//frame.add(new JButton("10"));
		//The grid will add a new forth column and populate it

		
		frame.setVisible(true);

	}

}
