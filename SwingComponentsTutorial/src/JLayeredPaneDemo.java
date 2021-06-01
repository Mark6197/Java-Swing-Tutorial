import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class JLayeredPaneDemo {

	public static void main(String[] args) {
		
		//JLayeredPane is a Swing container that provides 3D dimension for positioning components (Z-index)
		
		JLayeredPane layeredPane=new JLayeredPane();//Create new JLayeredPane instance
		layeredPane.setBounds(0,0,500,500);//Set the bounds of the frame same as the window size
		
		//Create 3 panels
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		JPanel p3=new JPanel();
		
		//Set colors to the panels
		p1.setBackground(Color.RED);
		p2.setBackground(Color.BLUE);
		p3.setBackground(Color.GREEN);
		
		//Set the bounds for each panel
		p1.setBounds(50,50,200,200);
		p2.setBounds(100,100,200,200);
		p3.setBounds(150,150,200,200);
		
		//Add the panels to the layeredPane
		layeredPane.add(p1);
		layeredPane.add(p2);
		layeredPane.add(p3);
		//We can manipulate the depth of the layers in two ways 
		//(The component with the highest integer value will appear on top of all others and so on till the component with lowest integer value):
		//First option- Using Swings objects:
		//There are 5 values already defined that we can use: DEFAULT_LAYER=0, PALETTE_LAYER=100, MODAL_LAYER=200, POPUP_LAYER=300, DRAG_LAYER=400
		//layeredPane.add(p1, JLayeredPane.DEFAULT_LAYER);
		//layeredPane.add(p2, JLayeredPane.DRAG_LAYER);
		//layeredPane.add(p3, JLayeredPane.MODAL_LAYER);
		//First option- Using Integers (we can use any number that we want):
		//layeredPane.add(p1, Integer.valueOf(90));
		//layeredPane.add(p2, Integer.valueOf(78));
		//layeredPane.add(p3, Integer.valueOf(81));

		JFrame frame=new JFrame();
		frame.add(layeredPane);//Add the layered pane
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);//In this demo we will set the layout to null
		frame.setVisible(true);
	}

}
