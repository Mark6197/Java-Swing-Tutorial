import java.awt.*;
import javax.swing.*;

public class JProgressBarDemo {

	//JProgressBar is used to display the progress of the task
	
	private JFrame frame;
	private JProgressBar bar;

	JProgressBarDemo(){
		//The UIManager manages the look and feel of the app and allow us to modify the default look and feel (I didn't find any other way to do the next two action) 
		UIManager.put("ProgressBar.selectionBackground",Color.BLACK);//Change the text to black only when the progress didn't reached the text (the text is on the background of the progress bar)
		UIManager.put("ProgressBar.selectionForeground",Color.BLACK);//Change the text to black only when the progress passed the text (the text is on the foreground of the progress bar)
		
		frame= new JFrame();
		bar= new JProgressBar();//Create new JProgressBar instance
		//bar= new JProgressBar(100,1000);//Create new JProgressBar instance with minimum and maximum values (we can also use the methods setMaximum() and setMinimum() on the bar) 
		bar.setValue(0);//Set the value of progress bar
		bar.setBounds(100, 50, 300, 30);//Set location and size for the progress bar
		bar.setStringPainted(true);//Make the percentage string visible on the progress bar
		bar.setFont(new Font("DAVID", Font.BOLD, 20));
		bar.setForeground(Color.GREEN);
		bar.setBackground(Color.WHITE);
		frame.add(bar);//add the bar to the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);//in this demo we will set the layout to null
		frame.setSize(500,500);
		frame.setVisible(true);
		
		progress();
	}
	
	private void progress() {
		int counter=0;//create a counter variable that equals to 0
		
		while(counter<=100) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			counter+=10;
			bar.setValue(counter);//set the value of the bar
		}
			
		bar.setString("Completed!");//Set string when the progress bar is completed
	}

	public static void main(String[] args) {
		new JProgressBarDemo();
	}

}
