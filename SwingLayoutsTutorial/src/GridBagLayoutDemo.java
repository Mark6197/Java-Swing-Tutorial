import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class GridBagLayoutDemo extends JFrame {
	//The GridBagLayout is used to align components vertically, horizontally or along their baseline.
	//You can think of it as a GridLayout with more capabilities.
	//The components may not be of same size. Each GridBagLayout object maintains a dynamic, rectangular grid of cells.
	// Each component occupies one or more cells known as its display area.
	//GridBagLayout is a class that belongs to awt
	public static void main(String[] args) {
		new GridBagLayoutDemo();
	}

	public GridBagLayoutDemo() {
		GridBagConstraints gbc = new GridBagConstraints();//Create new GridBagConstraints instance
		setLayout(new GridBagLayout());//Set the layout of the frame to GridBagLayout
		
		gbc.fill = GridBagConstraints.HORIZONTAL;//The component will resize only Horizontally
		gbc.gridx = 0;//Set the x cell to 0
		gbc.gridy = 0;//Set the y cell to 0
		this.add(new JButton("Button One"), gbc);//Add new button with the constraints we declared
		
		gbc.gridx = 1;
		gbc.gridy = 0;	
		this.add(new JButton("Button two"), gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 1;
		this.add(new JButton("Button Three"), gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 1;
		this.add(new JButton("Button Four"), gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.ipady = 20;//Set the padding of the component
		gbc.gridwidth = 2;//Set the numbers of cells in row for the components display area
		//gbc.gridheight=2;//Set the numbers of cells in column for the components display area
		this.add(new JButton("Button Five"), gbc);
		
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

}
