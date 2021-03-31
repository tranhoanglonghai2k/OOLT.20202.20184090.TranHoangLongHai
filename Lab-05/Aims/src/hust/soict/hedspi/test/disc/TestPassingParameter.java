package hust.soict.hedspi.test.disc;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class TestPassingParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Cinderella");
		
		swap(dvd1, dvd2);
		System.out.println("Jungle dvd title: " + dvd1.getTitle());
		System.out.println("Ciderella dvd title: " + dvd2.getTitle());
		
		changeTitle(dvd1, dvd2.getTitle());
		System.out.println("Jungle dvd title: " + dvd1.getTitle());
	}
	
	public static void swap(Object a, Object b) {
		DigitalVideoDisc dvd1 = (DigitalVideoDisc) a;
		DigitalVideoDisc dvd2 = (DigitalVideoDisc) b;
		if (dvd1 != null && dvd2 != null) {
			String titleTmp = dvd1.getTitle();
			String directorTmp = dvd1.getDirector();
			String categoryTmp = dvd1.getCategory();
			int lengthTmp = dvd1.getLength();
			float costTmp = dvd1.getCost();

			dvd1.setTitle(dvd2.getTitle());
			dvd1.setDirector(dvd2.getDirector());
			dvd1.setCategory(dvd2.getCategory());
			dvd1.setLength(dvd2.getLength());
			dvd1.setCost(dvd2.getCost());

			dvd2.setTitle(titleTmp);
			dvd2.setDirector(directorTmp);
			dvd2.setCategory(categoryTmp);
			dvd2.setLength(lengthTmp);
			dvd2.setCost(costTmp);
		}
		else {
			System.out.println("Error! Could not find the disc!");
		}
	}

	public static void changeTitle(DigitalVideoDisc dvd, String title) {
		String oldTitle = dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DigitalVideoDisc(oldTitle);
	}
}