package Lap02;
import javax.swing.JOptionPane;
public class ChoosingOption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int option = JOptionPane.showConfirmDialog(null, 
				"Do you want to change to the first class ticket?");
		
		JOptionPane.showMessageDialog(null, "You've chosen: "
				+ (option == JOptionPane.YES_OPTION? "Yes":"No") );
		
		System.exit(0);
	}

}
