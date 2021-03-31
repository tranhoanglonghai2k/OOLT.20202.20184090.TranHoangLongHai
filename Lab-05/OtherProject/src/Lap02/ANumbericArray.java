package Lap02;
import java.util.Scanner;
import java.util.Arrays;
public class ANumbericArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Nhập số phần tử của mảng : ");
		int numofArr = input.nextInt();
		int arr[] = new int[numofArr];
		
		System.out.println("Nhập giá trị của các phần tử: ");
		for(int i = 0; i < numofArr ; i++ ) 
		{
			arr[i] = input.nextInt();
		}
		
		Arrays.sort(arr);
		System.out.println("Dãy số được sắp xếp tăng dần: ");
		int sum = 0;
		for (int i = 0; i < arr.length; i++)
		{
			sum += arr[i];
			System.out.print(arr[i] + " ");
		}
		System.out.println("Tổng của các phần tử: " + sum);
		System.out.println("Giá trị trung bình của các phần tử: " + (float) sum/numofArr);
	}		
}
