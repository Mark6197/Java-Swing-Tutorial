import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class JTreeDemo {
	private JFrame frame;

	JTreeDemo() {
		frame = new JFrame();
		DefaultMutableTreeNode style = new DefaultMutableTreeNode("Style");//Create DefaultMutableTreeNode for style 
		DefaultMutableTreeNode color = new DefaultMutableTreeNode("color");//Create DefaultMutableTreeNode for color 
		DefaultMutableTreeNode font = new DefaultMutableTreeNode("font");//Create DefaultMutableTreeNode for font 
		style.add(color);//Add color to the style node as child
		style.add(font);//Add font to the style node as child
		DefaultMutableTreeNode red = new DefaultMutableTreeNode("red");//Create DefaultMutableTreeNode for red 
		DefaultMutableTreeNode blue = new DefaultMutableTreeNode("blue");//Create DefaultMutableTreeNode for blue 
		DefaultMutableTreeNode black = new DefaultMutableTreeNode("black");//Create DefaultMutableTreeNode for black 
		DefaultMutableTreeNode green = new DefaultMutableTreeNode("green");//Create DefaultMutableTreeNode for green 
		color.add(red);//Add red to the color node as child
		color.add(blue);//Add blue to the color node as child
		color.add(black);//Add black to the color node as child
		color.add(green);//Add green to the color node as child
		JTree tree = new JTree(style);//Create new JTree instance and set the style node as the root
		frame.add(tree);
		frame.setSize(200, 200);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new JTreeDemo();
	}
}
