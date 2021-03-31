package Lab01;

import javax.swing.JOptionPane;
public class Calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strNum1, strNum2;
		String strNotification1 = "Sum of two number: ";
		String strNotification2 = "Difference of two number: ";
		String strNotification3 = "Product of two number: ";
		String strNotification4 = "Quotient of two number: ";
		
		strNum1 = JOptionPane.showInputDialog(null,
				"Please input the first number: ", "Input the first number",
				JOptionPane.INFORMATION_MESSAGE);
		double num1 = Double.parseDouble(strNum1);
	
		strNum2 = JOptionPane.showInputDialog(null,
			"Please input the second number: ", "Input the second number",
			JOptionPane.INFORMATION_MESSAGE);
		double num2 = Double.parseDouble(strNum2);
	
		double sum = num1+num2;
		double difference = num1-num2;
		double product = num1*num2;
		double quotient = num1/num2;
		
		JOptionPane.showMessageDialog(null, strNotification1 + sum,
				"Sum of two numbers", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, strNotification2 + difference,
				"Difference of two numbers", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, strNotification3 + product,
				"Product of two numbers", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, strNotification4 + quotient,
				"Quotient of two numbers", JOptionPane.INFORMATION_MESSAGE);
	System.exit(0);
	}

}
