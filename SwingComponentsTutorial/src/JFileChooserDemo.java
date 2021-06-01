import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class JFileChooserDemo extends JFrame implements ActionListener {

	private JButton btn;
	private JFileChooser fileChooser;
	//JFileChooser is Gui mechanism that let's a user choose a file
	JFileChooserDemo(){
		btn=new JButton("Choose File");
		btn.addActionListener(this);
		
		this.add(btn);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn) {
			fileChooser=new JFileChooser();//Create new instance of JFileChooser
			fileChooser.setCurrentDirectory(new File("."));//Set the directory that will be opened to the project directory.
														   //We can specify other directory such as desktop by passing it's full path
			
			int response= fileChooser.showOpenDialog(this);//Select file to open. we are saving the response to int variable
			
			if(response==JFileChooser.APPROVE_OPTION) {//If the user approved meaning clicked open or save
				File file= new File(fileChooser.getSelectedFile().getAbsolutePath());//Create new File object and initialize it with path of the file the user chose
				System.out.println(file);//Printing the file object will print it's path
				
			}
		}
	}

	public static void main(String[] args) {
		new JFileChooserDemo();
	}
}
