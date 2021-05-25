import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class JDialogJOptionPaneDemo implements ActionListener{

	//JDialog represents a top level window with a border and a title used to take some form of input from the user.

	//JOptionPane is pop up dialog box that informs users of something or prompts for a value,
	//while the JOptionPane is open the user can't interact with the main window
	//JOptionPane provides standard dialog boxes such as message dialog box, confirm dialog box and input dialog box
	
	//The main differences between the two are that JDialog can be more customized to our purposes, we can add to it different components while JOptionPane
	//have limited options, second difference is that JOptionPane is blocking the main window while JDialog not necessarily blocking the main window
	
	JFrame frame=new JFrame();
	JButton btn=new JButton("Open New JOptionPane");
	
	JDialogJOptionPaneDemo(){
		btn.setBounds(150, 200, 200, 50);
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
			//JDialog
			JDialog dialog = new JDialog(frame , "Dialog Demo", false); //Create new instance of JDialog, the boolean parameter decides whether to block the main window or not
	        JButton dialogBtn = new JButton ("OK");  
	        dialogBtn.addActionListener ( new ActionListener()  //Add ActionListener to the button by declaring the ActionListener directly in the method
	        {  
	            public void actionPerformed( ActionEvent e )  
	            {  
	        		if(e.getSource()==dialogBtn) {
	        			dialog.setVisible(false); 
	            	} 
	            }  
	        });  
	        dialog.setLayout(new FlowLayout());  //Set the layout of the dialog
	        dialog.add( new JLabel ("Click button to continue."));  
	        dialog.add(dialogBtn);   
	        dialog.setSize(300,300);    
	        dialog.setVisible(true); 
			//----------------------------------------------------------------------------------------------------------------------------------------------
			//JOptionPane
			//If we want to inform the user of something we can use showMessageDialog function with 5 different message options:
			//JOptionPane.showMessageDialog(frame,"Some Message","title",JOptionPane.PLAIN_MESSAGE);
			//JOptionPane.showMessageDialog(frame,"Some Message","title",JOptionPane.INFORMATION_MESSAGE);
			//JOptionPane.showMessageDialog(frame,"Some Message","title",JOptionPane.WARNING_MESSAGE);
			//JOptionPane.showMessageDialog(frame,"Some Message","title",JOptionPane.QUESTION_MESSAGE);
			//JOptionPane.showMessageDialog(frame,"Some Message","title",JOptionPane.ERROR_MESSAGE);
			
			//We can give the user different options on the dialog using showConfirmDialog method
			//We can also save the answer of the user and use it later
			//int answer=JOptionPane.showConfirmDialog(frame, "Some question?","title", JOptionPane.YES_NO_OPTION);
			//int answer=JOptionPane.showConfirmDialog(frame, "Some question?","title", JOptionPane.CLOSED_OPTION);
			//int answer=JOptionPane.showConfirmDialog(frame, "Some question?","title", JOptionPane.YES_NO_CANCEL_OPTION);
			//There are few more versions we can use in the options
			
			//We can request data from the user and receive a string 
			//String name= JOptionPane.showInputDialog(frame, "What is your name?","title",JOptionPane.QUESTION_MESSAGE);
			
			//We can make our custom dialog using showOptionDialog, with this we will be able to override the icon and options
			//String[] options= {"opt 1", "opt 2", "opt 3"};
			//ImageIcon icon = new ImageIcon("images/Hello World Logo.jpg");
			//int answer= JOptionPane.showOptionDialog(frame, "Some Message", "title", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, options, 0);
		}
	}
	
	public static void main(String[] args) {
		new JDialogJOptionPaneDemo();
	}
}
