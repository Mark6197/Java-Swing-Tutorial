import javax.swing.*;

public class JTabbedPaneDemo {
	// JTabbedPane class is used to switch between a group of components by clicking on a tab with a given title or icon.
	
	private JFrame frame;
	JTabbedPaneDemo() {
		frame = new JFrame();
		//Create 3 JPanels with label inside each one of them
		JPanel p1 = new JPanel();
		JLabel label1= new JLabel("Main tab");
		p1.add(label1);
		JPanel p2 = new JPanel();
		JLabel label2= new JLabel("Visit tab");
		p2.add(label2);
		JPanel p3 = new JPanel();
		JLabel label3= new JLabel("Help tab");
		p3.add(label3);
		
		JTabbedPane tabbedPane = new JTabbedPane();//Create new tabbedPane instance
		tabbedPane.setBounds(50, 50, 200, 200);
		//Add each panel to the tabbedPane and set it's title
		tabbedPane.add("main", p1);
		tabbedPane.add("visit", p2);
		tabbedPane.add("help", p3);
		frame.add(tabbedPane);
		frame.setSize(400, 400);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new JTabbedPaneDemo();
	}
}