import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
 

public class View {
 
    public View() {
        // Create swing UI components 
        JTextField searchTermTextField = new JTextField(26);
        JButton filterButton = new JButton("Filter");
        JTable table = new JTable();
 
        // Create table model and set it as the model of the table 
        Model model = new Model();
        table.setModel(model);
 
        // Create controller with the text field and the model that we created before
        Controller controller = new Controller(searchTermTextField, model);
        filterButton.addActionListener(controller);//Add the controller as the action listener of the button
 
        // Set the view layout
        JPanel ctrlPane = new JPanel();//Create JPanel
        //Add the text field and the button to the panel
        ctrlPane.add(searchTermTextField);
        ctrlPane.add(filterButton);
 
        JScrollPane tableScrollPane = new JScrollPane(table);//Create new JScrollPane and initialize it with the table we created.
        													//JScrollPane will give us the ability to scroll the table.
        tableScrollPane.setPreferredSize(new Dimension(700, 182));//Set the preferred size of the scroll pane.
        tableScrollPane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Market Movers",
                TitledBorder.CENTER, TitledBorder.TOP));//Create a border for the table
 
        JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, ctrlPane, tableScrollPane);//Create JSplitPane with a vertical split
        																							//between our search panel and the table
        splitPane.setDividerLocation(35);//Set the location of the split divider 35 pixels from the top
        splitPane.setEnabled(false);//Set enabled to false in order to prevent resizing with the split pane, if true we will be able to resize it
 
        // Display it all in a scrolling window and make the window appear
        JFrame frame = new JFrame("Swing MVC Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(splitPane);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
 
}