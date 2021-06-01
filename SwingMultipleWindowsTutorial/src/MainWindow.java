import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainWindow implements ActionListener{

	JFrame frame=new JFrame();
	JButton btn=new JButton("Open New Window");
	
	MainWindow(){
		btn.setBounds(175, 200, 150, 50);
		btn.setFocusable(false);
		btn.addActionListener(this);
		
		frame.add(btn);
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);//Set layout to null in this demo
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn) {
			//frame.dispose();//If we want to close the main window 
			new NewWindow();//Create a new instance of NewWindow
		}
	}
}
