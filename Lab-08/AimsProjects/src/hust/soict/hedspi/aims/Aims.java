package hust.soict.hedspi.aims;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.orders.Orders;
import java.util.Scanner;


public class Aims {
	public static void showMenu() {
        System.out.println("Order Management Application: ");
        System.out.println("--------------------------------");
        System.out.println("1. Create new order");
        System.out.println("2. Add item to the order");
        System.out.println("3. Delete item by id");
        System.out.println("4. Display the items list of order");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }
    
    public static void main(String[] args) {
		int choice;
		int n = 0, check = 0;
		int orderID, itemId;
		Scanner sc = new Scanner(System.in);
		Orders[] orderList = new Orders[Orders.MAX_LIMITED_ORDERS];
		do {
			showMenu();
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				orderList[n++] = Orders.getInstanceOrder();
				check = 1;
				System.out.println("Order created");
				break;
			case 2:
				if (check == 0) {
					System.out.println("Please create an order");
					break;
				} else {
					orderID = Orders.getOrderId();
					if(orderID == 0) break;
					orderList[orderID-1].addMedia();
					System.out.print("Add successfull");
					break;					
				}
			case 3:
				if (check == 0) {
					System.out.println("Please create an order");
					break;
				}
                orderID = Orders.getOrderId();
                if(orderID == 0) break;
                System.out.println("The order now: ");
                orderList[orderID-1].printOrdered();
                do {
                    System.out.println("Choose the item you want to delete: ");
                    itemId = sc.nextInt();
                } while(itemId < 1 || itemId > orderList[orderID-1].size());
				sc.nextLine();
                orderList[orderID-1].removeMediabyID(itemId-1); 
                System.out.println("Delete successful.");
                break;
            case 4:
            	if (check == 0) {
					System.out.println("Please create an order");
					break;
				}
                orderID = Orders.getOrderId();
                if(orderID == 0) break;
                orderList[orderID-1].printOrdered();
                break;
            default:
                break;
			}
		}while(choice!=0);


	}
}