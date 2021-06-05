import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
 

public class Controller implements ActionListener {
     
	//Create private fields
    private JTextField searchTermTextField = new JTextField(26);
    private DefaultTableModel model;
 
    //In the constructor we initialize the model and the text field
    public Controller(JTextField searchTermTextField, DefaultTableModel model) {
        super();
        this.searchTermTextField = searchTermTextField;
        this.model = model;
    }
    
    //We register the controller as listener on the button clicks in the view. this method will be invoked in each click.
    @Override
    public void actionPerformed(ActionEvent e) {
 
        String searchTerm = searchTermTextField.getText();//Get the text from the text field
        if (searchTerm != null && !"".equals(searchTerm)) {//If the text is not null and not empty
            Object[][] newData = new Object[Constants.DATA.length][];//We will create multidimensional array with the same length as the data length
            int idx = 0;
            for (Object[] o: Constants.DATA) {//Run in a loop for each object in our data
                if ("*".equals(searchTerm.trim())) {//if the text is * it will display all the data
                    newData[idx++] = o;
                } else {
                    if(String.valueOf(o[0]).startsWith(searchTerm.toUpperCase().trim())){//if the text is not * and start with the search term it will display it
                        newData[idx++] = o;
                    }   
                }   
            }
            model.setDataVector(newData, Constants.TABLE_HEADER);//Set the new data of the model using setDataVector 
            													//which is a method defined by the model's father (DefaultTableModel)
        } else {//If the search term is null or empty error message dialog will be displayed
            JOptionPane.showMessageDialog(null,
                    "Search term is empty", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
 
}