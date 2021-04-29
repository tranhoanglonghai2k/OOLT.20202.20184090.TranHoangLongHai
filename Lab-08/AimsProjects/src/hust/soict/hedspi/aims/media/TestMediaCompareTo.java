package hust.soict.hedspi.aims.media;

import java.util.Collections;
import java.util.List;

import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.disc.CompactDisc;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;

public class TestMediaCompareTo {
	public static void main(String[] args) {
		java.util.Collection<Media> collection	= new java.util.ArrayList<Media>();
		
		// Add objects to the arraylist
		collection.add(new DigitalVideoDisc("hello", 10, "Sir"));
		collection.add(new Book("zero"));
		collection.add(new CompactDisc("summer", 0, "Time"));
		
		// Iterate through the ArrayList and output
		// (unsorted order)
		java.util.Iterator<Media> iterator = collection.iterator();
		
		System.out.println("-----------------");
		System.out.println("The Media in unsorted order:");
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next().getTitle());
			
		}
		
		// After sort
		System.out.println("-----------------");
		System.out.println("The Media in sorted order:");
		Collections.sort((List<Media>)collection);
		iterator = collection.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next().getTitle());
		}
		
		// Add and remove item and sort
		collection.add(new Book("dawn"));
		iterator = collection.iterator();
		while(iterator.hasNext()) {
			if(iterator.next().getTitle()=="hello") {
				iterator.remove();
			}
		}
		
		// Sort once more
		System.out.println("-----------------");
		System.out.println("The Media in sorted order:");
		Collections.sort((List<Media>)collection);
		iterator = collection.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next().getTitle());
		}
	}

}