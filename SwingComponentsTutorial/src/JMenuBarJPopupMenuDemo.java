import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class JMenuBarJPopupMenuDemo implements ActionListener {
	//JMenuBar is used to display menubar on the window or frame. It may have several menus.
	//JMenu is a pull down menu component which is displayed from the menu bar. It inherits the JMenuItem class.
	//JMenuItem adds a simple labeled menu item. The items used in a menu must belong to the JMenuItem or any of its subclass.
	private JFrame frame;
	private JMenuBar menuBar;
	private JMenu fileMenu, editMenu, helpMenu;
	private JMenuItem newItem, saveItem, exitItem;
	private ImageIcon fileIcon; 
	private JPopupMenu popupMenu;
	private JMenuItem cut, copy, paste;
	
	JMenuBarJPopupMenuDemo(){
		frame= new JFrame();
		
		menuBar=new JMenuBar();//Create new instance of JMenuBar
		
		//Create 3 JMenu instances with text for each
		fileMenu= new JMenu("File");
		editMenu= new JMenu("Edit");
		helpMenu= new JMenu("Help");
		
		//Create 3 JMenuItems instances with text for each
		newItem= new JMenuItem("New");
		saveItem= new JMenuItem("Save");
		exitItem= new JMenuItem("Exit");

		//Set icon to menu item
		fileIcon=new ImageIcon("Images/file icon.png");
		newItem.setIcon(fileIcon);
		
		//Register all 3 menuItems to ActionListener (this instance)
		newItem.addActionListener(this);
		saveItem.addActionListener(this);
		exitItem.addActionListener(this);

		//Set KeyEvent that will open each menu
		fileMenu.setMnemonic(KeyEvent.VK_F);//Alt+f
		editMenu.setMnemonic(KeyEvent.VK_E);//Alt+e
		helpMenu.setMnemonic(KeyEvent.VK_H);//Alt+h
		
		//Set KeyEvent to each menu item in file menu. Note- the menu has to be open in order for  
		newItem.setMnemonic(KeyEvent.VK_N);//n
		saveItem.setMnemonic(KeyEvent.VK_S);//s
		exitItem.setMnemonic(KeyEvent.VK_E);//e
		//If the key is the same as the first letter of the text in the item this letter will be underlined

		//Add the JMenuItems object to the fileMenu
		fileMenu.add(newItem);
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);

		//Add the JMenu objects to the menubar
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);
		
		popupMenu= new JPopupMenu("Edit");//Create new JPopupMenu instance with Edit title
		//Create 3 JMenuItem for cut copy paste
		cut = new JMenuItem("Cut");  
        copy = new JMenuItem("Copy");  
        paste = new JMenuItem("Paste");  
        //Add the 3 JMenuItem to the popupMenu
        popupMenu.add(cut);
        popupMenu.add(copy); 
        popupMenu.add(paste);        

        //Register the frame to listen to Mouse click events
        frame.addMouseListener(new MouseAdapter() {  
            public void mouseClicked(MouseEvent e) {  
            	if(e.getButton() == MouseEvent.BUTTON3) {//Check if the button that was clicked on the mouse is the right button
            		popupMenu.show(frame , e.getX(), e.getY());  //open the popupMenu at the same location where the user clicked
            	}                 
            }
         });
        
        //Add action listeners to cut copy and paste
        cut.addActionListener(new ActionListener(){  
        	public void actionPerformed(ActionEvent e) {              
            	System.out.println("cut MenuItem clicked.");  
            }  
        });  
        
        copy.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e) {              
            	System.out.println("copy MenuItem clicked.");  
            }  
        });  
        
        paste.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e) {              
            	System.out.println("paste MenuItem clicked.");  
            }  
        });      

        frame.setJMenuBar(menuBar);//Setting the menu bar to the frame
        frame.add(popupMenu);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
		frame.setSize(500,500);
		frame.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==newItem) {
			System.out.println("Creating new file...");
		}
		else if(e.getSource()==saveItem) {
			System.out.println("Saving file...");
		}
		else if(e.getSource()==exitItem) {
			System.exit(0);//Exit the system with status code 0
		}
	}
	
	public static void main(String[] args) {
		new JMenuBarJPopupMenuDemo();
	}
}
