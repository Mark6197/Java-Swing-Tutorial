import java.util.List;
import java.util.Random;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.SwingWorker;

@SuppressWarnings("serial")
public class Flipper extends JFrame implements ActionListener {
	//Private fields
	//UI components
	private final GridBagConstraints constraints;
	private final JTextField headsText, totalText, devText;
	private final Border border = BorderFactory.createLoweredBevelBorder();
	private final JButton startButton, stopButton;
	//Swing worker
	private FlipTask flipTask;

	//Initialize text field
	private JTextField makeText() {
		JTextField t = new JTextField(20);
		t.setEditable(false);
		t.setHorizontalAlignment(JTextField.RIGHT);
		t.setBorder(border);
		getContentPane().add(t, constraints);
		return t;
	}

	//Initialize button
	private JButton makeButton(String caption) {
		JButton b = new JButton(caption);
		b.setActionCommand(caption);
		b.addActionListener(this);
		getContentPane().add(b, constraints);
		return b;
	}

	//Constructor
	public Flipper() {
		super("Flipper");//Call the parent constructor with given title
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Make text boxes
		getContentPane().setLayout(new GridBagLayout());
		constraints = new GridBagConstraints();
		constraints.insets = new Insets(3, 10, 3, 10);
		headsText = makeText();
		totalText = makeText();
		devText = makeText();

		// Make buttons
		startButton = makeButton("Start");
		stopButton = makeButton("Stop");
		stopButton.setEnabled(false);

		// Display the window.
		pack();
		setVisible(true);
	}

	//private static inner class that will be used as FlipPair model that has two private fields- heads, total
	private static class FlipPair {
		private final long heads, total;

		FlipPair(long heads, long total) {
			this.heads = heads;
			this.total = total;
		}
	}

	//Private inner class the extends SwingWorker 
	//The generic parameters are: 
	//T (void)- the result type returned by this SwingWorker's doInBackground and get methods
	//V (FlipPair)- the type used for carrying out intermediate results by this SwingWorker's publish and process methods
	private class FlipTask extends SwingWorker<Void, FlipPair> {
		
		//This method will be invoked when we will call flipTask.Execute()
		@Override
		protected Void doInBackground() {
			long heads = 0;
			long total = 0;
			Random random = new Random();
			while (!isCancelled()) {//isCancelled is false and only after clicking on the stop button we will call flipTask.cancel(true)
				total++;
				if (random.nextBoolean()) {
					heads++;
				}
				publish(new FlipPair(heads, total));//The publish method sends data to the process 
													//We will use this method from within doInBackground() method
													//We will use it order to update the GUI while still in process
			}
			return null;//If the task is cancelled return null
		}

		//This method will be invoked after calling publish() inside the doInBackground() method
		//From within this method we will update the UI using the event dispatch thread
		@Override
		protected void process(List<FlipPair> pairs) {
			FlipPair pair = pairs.get(pairs.size() - 1);
			headsText.setText(String.format("%d", pair.heads));
			totalText.setText(String.format("%d", pair.total));
			devText.setText(String.format("%.10g", ((double) pair.heads) / ((double) pair.total) - 0.5));
		}
	}

	//ActionListener's actionPerformed will listen to action events
	public void actionPerformed(ActionEvent e) {
		if ("Start" == e.getActionCommand()) {//If we pressed the start button 
			startButton.setEnabled(false);//disable start button
			stopButton.setEnabled(true);//enable stop button
			(flipTask = new FlipTask()).execute();//execute the task
		} else if ("Stop" == e.getActionCommand()) {//If we pressed the stop button
			startButton.setEnabled(true);//enable the start button
			stopButton.setEnabled(false);//disable the stop button
			flipTask.cancel(true);//The cancel method will attempt to cancel the task. if we pass it true thread executing this task should be interrupted
								  //Else in-progress tasks are allowed to complete.
			flipTask = null;
		}

	}

	public static void main(String[] args) {
		//SwingUtilities.invokeLater will put the runnable task in the end of the event queue and return (asynchronous)
		//Runnable in an interface with only one method defined in it- run()
		//This interface should be implemented by any class whose instances are intended to be executed by a thread.
		//The Thread class also implements this interface
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {//This method will run
				new Flipper();
			}
		});
	}
}
