import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderLayoutDemo {

	public static void main(String[] args) {
		//BorderLayout is used to arrange the components in five regions: north, south, east, west and center.
		//Each region (area) may contain one component only. It is the default layout of frame or window.
		//BorderLayout is a class that belongs to awt
		
		JFrame frame=new JFrame();
		frame.setSize(500, 500);
		frame.setTitle("Border Layout Demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());//Set the layout to BorderLayout
		//We can add margin between the regions by passing hgap and vgap to the constructor
		//frame.setLayout(new BorderLayout(0,10));//Setting only vertical gap
		//frame.setLayout(new BorderLayout(10,0));//Setting only horizontal gap
		//frame.setLayout(new BorderLayout(10,0));//Setting both vertical and horizontal gap

		frame.setVisible(true);
		
		//Create 5 panels
		JPanel panel1= new JPanel();
		JPanel panel2= new JPanel();
		JPanel panel3= new JPanel();
		JPanel panel4= new JPanel();
		JPanel panel5= new JPanel();
		
		//Set different background colors
		panel1.setBackground(Color.RED);
		panel2.setBackground(Color.BLUE);
		panel3.setBackground(Color.GREEN);
		panel4.setBackground(Color.YELLOW);
		panel5.setBackground(Color.PINK);
		
		//Set size for each panel
		panel1.setPreferredSize(new Dimension(100,100));
		panel2.setPreferredSize(new Dimension(100,100));
		panel3.setPreferredSize(new Dimension(100,100));
		panel4.setPreferredSize(new Dimension(100,100));
		panel5.setPreferredSize(new Dimension(100,100));
		
		//Optional- Set the center panel layout to BorderLayout and add panels to it 
		//Create 5 more panels that will be used as inner panels
		//JPanel panel6= new JPanel();
		//JPanel panel7= new JPanel();
		//JPanel panel8= new JPanel();
		//JPanel panel9= new JPanel();
		//JPanel panel10= new JPanel();
				
		//Set different background colors for the inner panels
		//panel6.setBackground(Color.BLACK);
		//panel7.setBackground(Color.GRAY);
		//panel8.setBackground(Color.DARK_GRAY);
		//panel9.setBackground(Color.LIGHT_GRAY);
		//panel10.setBackground(Color.WHITE);
				
		//Set size for each inner panel
		//panel6.setPreferredSize(new Dimension(50,50));
		//panel7.setPreferredSize(new Dimension(50,50));
		//panel8.setPreferredSize(new Dimension(50,50));
		//panel9.setPreferredSize(new Dimension(50,50));
		//panel10.setPreferredSize(new Dimension(50,50));

		
		//panel5.setLayout(new BorderLayout());//Set the Layout of panel5 to be BorderLayout
		//Add the inner panels to the frame and set the region for each panel
		//panel5.add(panel6, BorderLayout.NORTH);
		//panel5.add(panel7, BorderLayout.SOUTH);
		//panel5.add(panel8, BorderLayout.WEST);
		//panel5.add(panel9, BorderLayout.EAST);
		//panel5.add(panel10, BorderLayout.CENTER);

		//Add the panels to the frame and set the region for each panel
		frame.add(panel1, BorderLayout.NORTH);//NORTH region will expand only horizontally if we will make the window larger
		frame.add(panel2, BorderLayout.EAST);//EAST region will expand only vertically if we will make the window larger
		frame.add(panel3, BorderLayout.WEST);//WEST region will expand only vertically if we will make the window larger
		frame.add(panel4, BorderLayout.SOUTH);//SOUTH region will expand only horizontally if we will make the window larger
		frame.add(panel5, BorderLayout.CENTER);//CENTER region will expand both horizontally and vertically if we will make the window larger
	}

}
