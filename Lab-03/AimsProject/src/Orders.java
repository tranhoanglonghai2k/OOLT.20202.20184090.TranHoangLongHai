

public class Orders {
		// TODO Auto-generated method stub
		public static final int MAX_NUMBERS_ORDERED = 10;
		private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
		private int qtyOrdered = 0;
		
		public void addDigitalVideoDisc(DigitalVideoDisc disc) {
			if (qtyOrdered < MAX_NUMBERS_ORDERED)
			{
				this.itemsOrdered[qtyOrdered] = disc; 
				System.out.println("This " + disc.getTitle() + " has been added!!!");
				this.qtyOrdered++;
			}
			else
			{
				System.out.println("The order is almost full!!!");
			}
		}

		public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
			int x = -1;
			
			for (int i = 0; i < this.qtyOrdered; i++)
			{
				if (this.itemsOrdered[i].getTitle().compareTo(disc.getTitle()) == 0)
				{
					x = i;
					break;
				}
			}
			
			if (x == -1)
			{
				System.out.println("This " + disc.getTitle() + " not found!!!");
			}
			else
			{
				for (int i = x; i < this.qtyOrdered; i++)
				{
					itemsOrdered[i] = itemsOrdered[i+1];
				}
				qtyOrdered--;
				System.out.println("Remove " + disc.getTitle() + " success!!!");
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
}
