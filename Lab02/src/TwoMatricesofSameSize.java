import java.util.Scanner;
public class TwoMatricesofSameSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Nhập số dòng của mảng: ");
		int numofLine = input.nextInt();
		System.out.println("Nhập số cột của mảng: ");
		int numofCol = input.nextInt();
		
		int arr1[][] = new int[numofLine][numofCol];
		for (int i = 0; i < numofLine; i++)
		{
			for (int j = 0; j < numofCol; j++)
			{
				System.out.print("Nhập phần tử thứ [" + i + ", " + j + "] của ma trận 1: ");
				arr1[i][j] = input.nextInt();
			}
		}
		
		int arr2[][] = new int[numofLine][numofCol];
		for (int i = 0; i < numofLine; i++)
		{
			for (int j = 0; j < numofCol; j++)
			{
				System.out.print("Nhập phần tử thứ [" + i + ", " + j + "] của ma trận 2: ");
				arr2[i][j] = input.nextInt();
			}
		}
		
		System.out.println("Ma trận 1: ");
	    for (int i = 0; i < numofLine; i++) {
	        for (int j = 0; j < numofCol; j++) {
	            System.out.print(arr1[i][j] + "\t");
	        }
	        System.out.println("\n");  
	    }
	    
	    System.out.println("Ma trận 2: ");
	    for (int i = 0; i < numofLine; i++) {
	        for (int j = 0; j < numofCol; j++) {
	            System.out.print(arr2[i][j] + "\t");
	        }
	        System.out.println("\n");  
	    }
		
	}

}
