import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class JTableDemo {
	private JFrame frame;

	//JTable is used to display data in tabular form. It is composed of rows and columns.
	JTableDemo(){    
		frame=new JFrame();    
	    String data[][]={ {"1","Yossi","20000"},    
	                          {"2","David","45000"},    
	                          {"3","Mark","30000"}};    //Create multidimensional array that will hold the demi data for the table
	    String column[]={"ID","NAME","SALARY"};      //Create array with columns names  
	    JTable table=new JTable(data,column);    //Create new instance of the JTable, pass it the data and the columns
	    table.setBounds(30,40,200,300);          
	    
	    table.setCellSelectionEnabled(true);//Allow cell selection  
        ListSelectionModel select= table.getSelectionModel(); //Get the ListSelectionModel
        select.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION); //Set the  SelectionModel to MULTIPLE_INTERVAL_SELECTION
        select.addListSelectionListener(new ListSelectionListener() {//Add new ListSelectionListener that will listen to changes in the selection
          public void valueChanged(ListSelectionEvent e) {  //This method will be invoked each time the selection has been changed
            if(e.getValueIsAdjusting()){//Check if this is one in a series of multiple event. 
            							//If we won't use this line the event may invoke twice.
            	int[] row = table.getSelectedRows();  //Get all the selected rows
            	int[] columns = table.getSelectedColumns();  //Get all the selected columns
            	for (int i = 0; i < row.length; i++) {  //Run over the rows
            		for (int j = 0; j < columns.length; j++) {  //Run over the columns
            			//Print the value in the specific cell using the row and column values
            			System.out.println("Table element selected is: " + table.getValueAt(row[i], columns[j]));
            		} 
            	}  
             }
          }       
        });  
	    
	    JScrollPane scrollPane=new JScrollPane(table);    //Create new JScrollPane instance,
	    												  //pass it the table in order to display it with scrolling option (for large tables)
	    frame.add(scrollPane);          
	    frame.setSize(300,400);    
	    frame.setVisible(true);    
	}

	public static void main(String[] args) {
		new JTableDemo();
	}
}
