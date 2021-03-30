package Aims;
import Date.MyDate;

public class Orders {
		// TODO Auto-generated method stub
		public static final int MAX_NUMBERS_ORDERED = 10;
		public static final int MAX_LIMITED_ORDERS = 5;
		private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
		private static MyDate dateOrdered = new MyDate();
		private int qtyOrdered = 0;
		private static int nbOrders = 0;
		
		public static Orders getOrder() {
			if(nbOrders < MAX_LIMITED_ORDERS) {
				Orders newOrder = new Orders();
				nbOrders++;
				return newOrder;
			}
			else {
	            System.out.println("The numbers of orders is almost max.");
	            return null;
	        }
	    }
		
		public int addDigitalVideoDisc(DigitalVideoDisc disc) {
			if (nbOrders >= MAX_LIMITED_ORDERS) {
				System.out.println("The order is almost full!");
				return -1;
			} 
			else {
				itemsOrdered[qtyOrdered] = disc;
				System.out.println("Add disc '" + itemsOrdered[qtyOrdered++].getTitle() + "' successfully!");
				return 1;
			}
		}
		
		public void addDigitalVideoDisc(DigitalVideoDisc ...discList) {
	        if (this.qtyOrdered == MAX_NUMBERS_ORDERED) {
	            System.out.println("The order is almost full");
	            return;
	        }    
			for (DigitalVideoDisc disc: discList) {
	            if (this.qtyOrdered < MAX_NUMBERS_ORDERED) {
	                this.itemsOrdered[this.qtyOrdered++] = disc;
	                System.out.println("The DVD " + disc.getTitle() + " has been added.");
	            }else {
	                System.out.println("The order is almost full");
	                break;

	            }
	        }
		}
		
		public int addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
			if(addDigitalVideoDisc(dvd1) == 1) {
				if(addDigitalVideoDisc(dvd2) == -1){
					System.out.println("The disc " + dvd2.getTitle() + " could not be added!");
					return -1;
				}
				else {
					return 1;
				}
			}
			else {
				System.out.println("Error, not enough slot for 2 discs");
				return -1;
			}
		}


		public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
			int x = -1;
			
			for(int i = 0; i < this.qtyOrdered; i++) {
	            if(this.itemsOrdered[i].equals(disc)) {
	                for(int j = i;j < this.qtyOrdered - 1; j++) {
	                    this.itemsOrdered[j] = new DigitalVideoDisc(this.itemsOrdered[j+1].getTitle(), this.itemsOrdered[j+1].getCategory(), this.itemsOrdered[j+1].getDirector(), this.itemsOrdered[j+1].getLength(), this.itemsOrdered[j+1].getCost());
	                }
	                this.qtyOrdered--;
	                x = i;
	                System.out.println("Remove " + disc.getTitle() + " successfully");
	                break;
	            }
	        }
	        if (x == -1) {
	            System.out.println("The Disc " +  disc.getTitle() + " Not found");
	        }
		}
		
		public float totalCost() {
			float total = 0;
			
			for (int i = 0; i < this.qtyOrdered; i++)
			{
				total += this.itemsOrdered[i].getCost();
			}
			
			return total;
		}
		
		public void printListOfOrdered() {
			System.out.println("ORDER");
			dateOrdered.print();
			System.out.println("Ordered Items: ");
			for(int i = 0; i < this.qtyOrdered; i++) {
					System.out.println("DVD - " + this.itemsOrdered[i].getTitle() + " - " + this.itemsOrdered[i].getCategory() + " - " + this.itemsOrdered[i].getDirector() + " - " + this.itemsOrdered[i].getLength() + " : " + this.itemsOrdered[i].getCost());
			}
			System.out.println("Total cost: " + totalCost());
			
		}
		
		public int getQtyOrdered() {
			return qtyOrdered;
		}

		public void setQtyOrdered(int qtyOrdered) {
			this.qtyOrdered = qtyOrdered;
		}
		
		public MyDate getDateOrdered() {
			return dateOrdered;
		}

		public int getNbOrders() {
			return nbOrders;
		}

}
