import javax.swing.JOptionPane;
public class HelloNameDialog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result;
		result = JOptionPane.showInputDialog("Please enter your name:");
		JOptionPane.showMessageDialog(null, "Hi " +result+ "!");
		System.exit(0);
	}

}
