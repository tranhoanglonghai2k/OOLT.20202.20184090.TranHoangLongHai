package hust.soict.hedspi.aims.orders;

import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.utils.MyDate;

import java.util.ArrayList;
import javax.naming.LimitExceededException;

public class Orders {
    public static final int MAX_NUMBERS_ORDERED = 10;
    public static final int MAX_LIMITED_ORDERS = 5;
    public static ArrayList<Orders> OrderList = new ArrayList<>();
    private ArrayList<Media> itemsOrdered = new ArrayList<>();
    private MyDate dateOrdered;
    public int qtyOrdered = 0;
    private int ID;
    private String name;
    public static void removeOder(Orders order) {
    	OrderList.remove(order);
    }
    public ArrayList<Media> getItemsOrdered() {
        return itemsOrdered;
    }

    public static ArrayList<Orders> getOrderList() {
        return OrderList;
    }

    public MyDate getDateOrdered() {
        return dateOrdered;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  Orders() throws LimitExceededException 
    {
        if(OrderList.size() >= MAX_LIMITED_ORDERS)
        {
            throw new LimitExceededException("ERROR: the number of orders has reached its limit");
        }else{
            OrderList.add(this);
            setID(OrderList.size());
            setName("Order" + getID());
            dateOrdered = new MyDate();
        }
    }
    
    public Orders(String name) {
        if(OrderList.size() == MAX_LIMITED_ORDERS)
        {
            System.out.println("Number of orders has exceeded the maximum");
        }else{
            OrderList.add(this);
            setID(OrderList.size());
    		this.name = name;
            dateOrdered = new MyDate();
        }
	}

	public void addMedia(Media media)
    {
        if(itemsOrdered.size() != MAX_NUMBERS_ORDERED)
        {
            itemsOrdered.add(media);
            System.out.println("Add successfully");
        }else{
            System.out.println("Number of ordered items has exceeded maximum size of the list");
        }
    }

    public void removeMedia(Media media)
    {
        if(itemsOrdered.contains(media))
        {
            itemsOrdered.remove(media);
            System.out.println("Remove successfully");
        }else{
            System.out.println(media.getTitle() + " does not exist in the List");
        }
    }

    public void removeMedia(int ID)
    {
        int i = 1;
        for (Media media : itemsOrdered)
        {
            if(i == ID)
            {
                itemsOrdered.remove(media);
                System.out.println("Remove successfully");
                return;
            }
            ++i;
        }

        System.out.println("Item that has ID = " + ID + " does not exist");
    }


    @Override
	public String toString() {
		return "Order ["+"ID=" + ID + " name=" + name + "]";
	}

	public float totalCost()
    {
        float sum = 0;

        for (Media media : itemsOrdered)
        {
            sum += media.getCost();
        }

        return sum;
    }


    public void getList()
    {
        if (itemsOrdered.size() == 0)
        {
            System.out.println("Empty list");
        }

        if (itemsOrdered.size() != 0)
        {
            System.out.println("************Order************");
            System.out.print("Date: ");
            dateOrdered.Print("d/MM/yyyy");
            System.out.println("Ordered items:");
        }

        int i = 0;
        for (Media media : itemsOrdered)
        {
            System.out.print(++i + ". ");
            media.display();
        }

        if (itemsOrdered.size() != 0)
        {
            System.out.println("*****************************");
        }
    }

    
    public static void showMenu()
    {
        System.out.println("Order Management Application");
        System.out.println("--------------------");
        System.out.println("1. Create new order");
        System.out.println("2. Add item to the order");
        System.out.println("3. Delete item by ID");
        System.out.println("4. Display the items list of order");
        System.out.println("0. Exit");
        System.out.println("--------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }

    public static void listOrder()
    {
        int  i = 0;
        for (Orders order : OrderList)
        {
            i++;
            System.out.print(i + ". ");
            System.out.println(order.getName());
        }
    }

	public static Orders getOrderByName(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}