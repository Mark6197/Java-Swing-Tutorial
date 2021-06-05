import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class CardLayoutDemo extends JFrame implements ActionListener{

	//The CardLayout class manages the components in such a manner that only one component is visible at a time. It treats each component as a card and
	//have useful methods such as next(), previous(), first(), last()
	//CardLayout is a class that belongs to awt

	CardLayout card;  //make a global variable in order to use it also in the actionPerformed methods
	
	CardLayoutDemo(){  
        
        card=new CardLayout(20,20); //Initialize the CardLayout, set hgap and vgap to 20 
        this.setLayout(card);  //Set the layout of the frame
    	
        //Create 3 buttons and register the ActionListener to this instance
    	JButton b1=new JButton("First Card");  
    	JButton b2=new JButton("Second Card");  
    	JButton b3=new JButton("Third Card");  
        b1.addActionListener(this);  
        b2.addActionListener(this);  
        b3.addActionListener(this);  
        
        //Add the buttons to the frame
        this.add("a",b1);
        this.add("b",b2);
        this.add("c",b3);  
                          
    }  
	

	@Override
	public void actionPerformed(ActionEvent e) {
	    card.next(this.getContentPane());  	//On each invocation we call the next card in the layout	
	}

	public static void main(String[] args) {
		CardLayoutDemo cl=new CardLayoutDemo();  
	    cl.setSize(400,400);  
	    cl.setVisible(true);  
	    cl.setDefaultCloseOperation(EXIT_ON_CLOSE);  
	}
}
