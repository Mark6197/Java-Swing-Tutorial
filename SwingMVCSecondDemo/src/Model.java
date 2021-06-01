import javax.swing.table.DefaultTableModel;
 
//The model extends DefaultTableModel which a Swing model class
@SuppressWarnings("serial")
public class Model extends DefaultTableModel {
 
	//In the constructor we will call to the father's (DefaultTableModel) constructor with the constant data and constant table headers
    public Model() {
        super(Constants.DATA, Constants.TABLE_HEADER);
    }
 
}