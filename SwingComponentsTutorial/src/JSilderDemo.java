import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class JSilderDemo implements ChangeListener{

	private JFrame frame;
	private JPanel panel;
	private JLabel redLabel, greenLabel, blueLabel;
	private JSlider redSlider, greenSlider, blueSlider;

	JSilderDemo(){
        GridBagConstraints gbc = new GridBagConstraints();//Constraints for the layout
		
		frame= new JFrame();
		panel= new JPanel();
		panel.setLayout(new GridBagLayout());
		
		//Create label at cell (0,0) on the grid.
		redLabel= new JLabel("Red = 255");
		gbc.ipadx=20;
		gbc.fill = GridBagConstraints.HORIZONTAL;  
		gbc.gridx = 0;  
		gbc.gridy = 0;
		panel.add(redLabel, gbc);	

		//Create JSlider at cell (1,0) on the grid.
		redSlider= new JSlider(0,255,255);
		redSlider.setPreferredSize(new Dimension(400,50));
		redSlider.addChangeListener(this);
		gbc.gridx = 1;  
		gbc.gridy = 0; 
		panel.add(redSlider, gbc);

		//Create label at cell (0,1) on the grid.
		greenLabel= new JLabel("Green = 255");
		gbc.fill = GridBagConstraints.HORIZONTAL;  
		gbc.gridx = 0;  
		gbc.gridy = 1; 
		panel.add(greenLabel, gbc);

		//Create JSlider at cell (1,1) on the grid.
		greenSlider= new JSlider(0,255,255);
		greenSlider.setPreferredSize(new Dimension(400,50));
		greenSlider.addChangeListener(this);
		gbc.gridx = 1;  
		gbc.gridy = 1; 
		panel.add(greenSlider, gbc);

		//Create label at cell (0,2) on the grid.
		blueLabel= new JLabel("Blue = 255");
		gbc.fill = GridBagConstraints.HORIZONTAL;  
		gbc.gridx = 0;  
		gbc.gridy = 2; 
		panel.add(blueLabel, gbc);

		//Create JSlider at cell (1,2) on the grid.
		blueSlider= new JSlider(0,255,255);
		blueSlider.setPreferredSize(new Dimension(400,50));
		blueSlider.addChangeListener(this);
		gbc.gridx = 1;  
		gbc.gridy = 2;
		panel.add(blueSlider, gbc);

		panel.setBackground(new Color(255,255,255));
		//panel.setBounds(0,0,600,600);
		frame.add(panel);
		frame.setSize(600,600);
		//frame.setLayout(null);
		frame.setVisible(true);
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		//Get the values from each slider
		int r= redSlider.getValue();
		int g= greenSlider.getValue();
		int b= blueSlider.getValue();

		//Change the text in the label based on which slider invoked the event
		if(e.getSource()==redSlider) {
			redLabel.setText(String.format("Red = %d", r));
		}
		else if(e.getSource()==greenSlider) {
			greenLabel.setText(String.format("Green = %d", g));
		}
		else if(e.getSource()==blueSlider) {
			blueLabel.setText(String.format("Blue = %d", b));
		}
		
		panel.setBackground(new Color(r,g,b));//Change the background of the color with the values from sliders
	}

	public static void main(String[] args) {
		new JSilderDemo();
	}
}
