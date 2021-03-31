package Lab01;
import java.util.Scanner;
public class LinearSystem {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a11, a12, a21, a22, b1, b2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a11: ");
		a11 = sc.nextDouble();
		System.out.print("Input a12: ");
		a12 = sc.nextDouble();
		System.out.print("Input a21: ");
		a21 = sc.nextDouble();
		System.out.print("Input a22: ");
		a22 = sc.nextDouble();
		System.out.print("Input b1: ");
		b1 = sc.nextDouble();
		System.out.print("Input b2: ");
		b2 = sc.nextDouble();
		
		double D = a11*a22 - a21*a12;
		double D1 = b1*a22 - b2*a21;
		double D2 = a11*b2 - a21*b1;
		
		if (D == 0) 
		{
			System.out.printf("Infinitely many solutions!");
		} 
		else 
		{
			double x1 = D1/D;
			double x2 = D2/D;
			System.out.printf("x1 = %f\n", x1);
			System.out.printf("x2 = %f", x2);
		}
		sc.close();
	}

}