import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutDemo {
	
	public static void main(String[] args) {
		
		//The FlowLayout is used to arrange the components in a line, one after another, sized in their preferred size.
		//If the horizontal space in the row is too small it will use the next available row
		//It is the default layout of applet or panel.
		//BorderLayout is a class that belongs to awt
		JFrame frame=new JFrame();
		frame.setSize(500, 500);
		frame.setTitle("Flow Layout Demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());//Set the layout to BorderLayout
		//frame.setLayout(new FlowLayout(FlowLayout.CENTER));//FlowLayout.CENTER will set the each row of components to the center, this is the default behavior
		//frame.setLayout(new FlowLayout(FlowLayout.LEFT));//FlowLayout.LEFT will set the each row of components to the left
		//frame.setLayout(new FlowLayout(FlowLayout.RIGHT));//FlowLayout.RIGHT will set the each row of components to the right
		//frame.setLayout(new FlowLayout(FlowLayout.LEADING));//FlowLayout.LEADING will set the each row of components to the leading (start) edge of the container
															//(left in left to right containers and right in right to left containers)
		//frame.setLayout(new FlowLayout(FlowLayout.TRAILING));//FlowLayout.TRAILING will set the each row of components to the trailing (end) edge of the container
															 //(right in left to right containers and left in right to left containers)
		
		//frame.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));//In addition to FlowLayout.LEFT we will add hgap and vgap of 0 to remove spaces (hgap=5, vgap=5 by default)
		
		frame.add(new JButton("0"));
		frame.add(new JButton("1"));
		frame.add(new JButton("2"));
		frame.add(new JButton("3"));
		frame.add(new JButton("4"));
		frame.add(new JButton("5"));
		frame.add(new JButton("6"));
		frame.add(new JButton("7"));
		frame.add(new JButton("8"));
		frame.add(new JButton("9"));

		frame.setVisible(true);//Best practice is to set visibility to true after adding all the components to the frame,
							   //sometimes there might be problems rendering if we will add the component after setting the visibility to true

	}	
	
}
