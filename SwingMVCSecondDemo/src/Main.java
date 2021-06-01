import javax.swing.SwingUtilities;
 
public class Main {
 
    public static void main(String[] args) {
    	//SwingUtilities.invokeLater executes our Runnable on the AWT event-dispatching thread
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    createAndShowGUI();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
 
    //Create view, if error will occur throw it
    public static void createAndShowGUI() throws Exception {
        new View();
    }
}