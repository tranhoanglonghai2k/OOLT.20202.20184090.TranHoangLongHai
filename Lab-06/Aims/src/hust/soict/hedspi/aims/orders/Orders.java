package hust.soict.hedspi.aims.orders;

import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import java.util.ArrayList;
import java.util.Scanner;
import hust.soict.hedspi.aims.utils.MyDate;

public class Orders {
	// TODO Auto-generated method stub
	public static final int MAX_NUMBERS_ORDERED = 10;
	public static final int MAX_LIMITED_ORDERS = 5;
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	public static int nbOrders = 0;
	private MyDate dateOrdered = new MyDate();
	
	public Orders(){
        if(nbOrders < MAX_LIMITED_ORDERS) {
            dateOrdered = new MyDate();
            nbOrders ++ ;
        }
        else{
            System.out.println("Không thể đặt hàng thêm");
        }
    }

    public int getQtyOrdered(){
        return itemsOrdered.size();
    }
 
	public static Orders getInstanceOrder() {
		if(nbOrders <= MAX_LIMITED_ORDERS) {
			Orders newOrder = new Orders();
			nbOrders++;
			return newOrder;
		}
		else {
            System.out.println("The numbers of orders is almost max.");
            return null;
        }
	}
	public int size() {
		return itemsOrdered.size();
	}
	public void addMedia(Media media){
        if(itemsOrdered.contains(media)) {
            System.err.println("The media with title: " + media.getTitle() + " is existed!");
        }else{
            itemsOrdered.add(media);
            System.out.println("***The media:  " + media.getTitle() + " has been added");
        }
    }

    public void addMedia(Media... mediaList) {
        for(int i = 0; i < mediaList.length; i++) {
            addMedia(mediaList[i]);
        }
    }
    
	public void removeMedia(Media item) {
		if(itemsOrdered.size() > 0) {
			itemsOrdered.remove(item);
		} else {
			System.out.println("Empty order. Please add some item");
			return;
		}
	}
	public void removeMediabyID(int id) {
        if(itemsOrdered.size() <= 0) {
            System.out.println("Empty order. Please add some items.");
            return;
        }
        if(id < itemsOrdered.size())
                itemsOrdered.remove(id);

    }
	
	public static void removeMediaInOrder(Orders anOrder) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap id: ");
        int id = sc.nextInt();
        anOrder.removeMediabyID(id);
    }
	
	public static int getOrderId() {
		Scanner sc = new Scanner(System.in);
		int orderId = 0;
		do {
			System.out.println("Please choose order id: ");
			orderId = sc.nextInt();
		} while(orderId<0 || orderId > Orders.nbOrders);
		return orderId;
	}
	
	public Media getALuckyItem(){
        int luckyItem=(int) (Math.random()*(itemsOrdered.size() - 0) + 0);
        itemsOrdered.get(luckyItem).setCost(0);
        if(luckyItem==itemsOrdered.size())
        {
            return null;
        }else{
            return itemsOrdered.get(luckyItem);
        }

    }
	
	public void printOrdered() {
		System.out.println("Order");
		System.out.printf("Date: ");
		dateOrdered.print();
		System.out.printf("\nOrdered Items:\n");
		int i=1;
		for(Media media: itemsOrdered) {
			System.out.println(i + ". " + "DVD - " + media.getTitle() + " - " + media.getCategory() +
		             " - " + media.getCost());
		i++;
		}
		System.out.println("Total cost: " + totalCost());
	}
	
	public float totalCost() {
		float total = 0;
		for(int i = 0; i < itemsOrdered.size(); i++) {
			total += itemsOrdered.get(i).getCost();
		}
		return total;
	}
}