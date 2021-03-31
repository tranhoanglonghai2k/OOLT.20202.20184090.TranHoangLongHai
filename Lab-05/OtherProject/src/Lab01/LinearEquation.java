package Lab01;
import java.util.Scanner;
public class LinearEquation {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.print("Input A: ");
        double a = sc.nextDouble();
        System.out.print("Input B: ");
        double b = sc.nextDouble();
        
        if(a != 0) 
        {
            double c = -b/a;
            System.out.printf("x = %f\n", c);
        }
        else 
        {
            System.out.printf("Error!!!\n");
        }
        sc.close();

    }
}