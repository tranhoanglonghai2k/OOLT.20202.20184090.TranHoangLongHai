package hust.soict.hedspi.aims;

import hust.soict.hedspi.aims.disc.*;
import hust.soict.hedspi.aims.exceptions.PlayerException;
import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.orders.Orders;


import java.util.ArrayList;
import java.util.Scanner;

import javax.naming.LimitExceededException;
import javax.swing.JOptionPane;

public class Aims {
	public void main (String[] args) {
		ArrayList<Book> books = new ArrayList<>();
		ArrayList<DigitalVideoDisc> dvds = new ArrayList<>();
        books.add(new Book("asdfg", "asdfghj", 5.4f));
        books.add(new Book("asdfghjk", "zxcvbnm", 2.5f));
        books.add(new Book("asdfghj", "zxcvbnm", 6.7f));
        dvds.add(new DigitalVideoDisc("ejnkfwrheiu", "eretwre", "b a cns", 120, 2.1f));
        dvds.add(new DigitalVideoDisc("wfs ejw", "av eb j", "Ajbhewfsbe", 90, 4.5f));
        dvds.add(new DigitalVideoDisc("sdv bsbjdh vs", "wefbwsjb", "Pjhbbfewsjewb", 96, 4.0f));
        dvds.add(new DigitalVideoDisc("ns vwsbm", "Cewfbbhefjbwehj", "qhjbdjba", 100, 4.3f));

        int  choose = 0;
        @SuppressWarnings("resource")
		Scanner sn = new Scanner(System.in);
        boolean exit = false;
        while(!exit)
        {
            Orders.showMenu();
            choose = sn.nextInt();
            sn.nextLine();

            switch (choose) {
                case 1 -> {
                	try {
                		Orders order = new Orders();
                        System.out.println("Created a new order with id = " + order.getID());
                	}catch(LimitExceededException e) {
                		System.out.print(e.getMessage());
                	}
                }
                case 2 -> {
                    System.out.println("***Add new item***");
                    System.out.println("Choose order");
                    Orders.listOrder();
                    int choose2 = sn.nextInt();
                    sn.nextLine();

                    while (choose2 < 0 || choose2 > Orders.OrderList.size()) {
                        System.out.println("Invalid choice");
                        Orders.listOrder();
                        choose2 = sn.nextInt();
                        sn.nextLine();
                    }
                    int index = choose2;

                    System.out.println("Choose item to be added into order");
                    System.out.println("1. Book");
                    System.out.println("2. CD");
                    System.out.println("3. DVD");

                    choose2 = sn.nextInt();
                    sn.nextLine();

                    while (choose2 < 1 || choose2 > 3) {
                        System.out.println("Invalid choice");
                        System.out.println("Choose item to be add into order");
                        System.out.println("1. Book");
                        System.out.println("2. CD");
                        System.out.println("3. DVD");

                        choose2 = sn.nextInt();
                        sn.nextLine();
                    }

                    switch (choose2) {
                        case 1 -> {
                            int i = 0;
                            for (Book book : books)
                            {
                                i++;
                                System.out.print(i + ". ");
                                book.display();
                            }

                            int choose3 = sn.nextInt();
                            sn.nextLine();

                            Orders.OrderList.get(index - 1).addMedia(books.get(choose3 - 1));
                        }
                        case 2 -> {
                            System.out.print("Title: ");
                            String title = sn.nextLine();

                            System.out.print("Category: ");
                            String category = sn.nextLine();

                            System.out.print("Cost: ");
                            float cost = sn.nextFloat();
                            sn.nextLine();

                            System.out.print("Length: ");
                            int length = sn.nextInt();
                            sn.nextLine();

                            System.out.print("Director: ");
                            String director = sn.nextLine();

                            System.out.print("Artist: ");
                            String artist = sn.nextLine();

                            ArrayList<Track> tracks = new ArrayList<>();

                            System.out.print("Number of tracks: ");
                            int tracksNumber = sn.nextInt();
                            sn.nextLine();

                            for (int i = 0; i < tracksNumber; ++i) {
                                System.out.print("Title: ");
                                String trackTitle = sn.nextLine();

                                System.out.print("Length: ");
                                int trackLength = sn.nextInt();
                                sn.nextLine();

                                Track newTrack = new Track(trackTitle, trackLength);
                                tracks.add(newTrack);
                            }

                            CompactDisc newDisc = new CompactDisc
                                    (title, category, cost, length, director, artist, tracks);
                            Orders.OrderList.get(index - 1).addMedia(newDisc);

                            System.out.println("Do you want to play " + title + "?");
                            System.out.println("0. No");
                            System.out.println("1. Yes");
                            int choose3 = sn.nextInt();
                            sn.nextLine();

                            while(choose3 != 0 && choose3 != 1)
                            {
                                System.out.println("Invalid choice");
                                System.out.println("0. No");
                                System.out.println("1. Yes");

                                choose3 = sn.nextInt();
                                sn.nextLine();
                            }

                            if(choose3 == 1)
                            {
                                for (Track track : tracks)
                                {
                                    try {
										track.play();
									} catch (PlayerException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
										System.out.println(e.getMessage());
										System.out.println(track);
										JOptionPane.showMessageDialog(null, e.getMessage());
									}
                                }
                            }
                        }
                        case 3 -> {
                            int i = 0;
                            for (DigitalVideoDisc digitalVideoDisc : dvds)
                            {
                                System.out.print(++i + ". ");
                                digitalVideoDisc.display();
                            }

                            int choose3 = sn.nextInt();
                            sn.nextLine();

                            Orders.OrderList.get(index - 1).addMedia(dvds.get(choose3 - 1));

                            System.out.println("Do you want to play " + dvds.get(choose3 - 1).getTitle());
                            System.out.println("0. No");
                            System.out.println("1. Yes");

                            int choose4 = sn.nextInt();
                            sn.nextLine();

                            while(choose4 != 0 && choose4 != 1)
                            {
                                System.out.println("Invalid choice");
                                System.out.println("0. No");
                                System.out.println("1. Yes");

                                choose4 = sn.nextInt();
                                sn.nextLine();
                            }

                            if(choose4 == 1)
								try {
									dvds.get(choose3 - 1).play();
								} catch (PlayerException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
									System.out.println(e.getMessage());
									System.out.println(dvds.get(choose3 - 1));
									JOptionPane.showMessageDialog(null, e.getMessage());
								}
                        }
                    }

                }
                case 3 -> {
                    System.out.println("***Delete item***");
                    System.out.println("Choose order");
                    Orders.listOrder();
                    int choose2 = sn.nextInt();
                    sn.nextLine();

                    while (choose2 < 0 || choose2 > Orders.OrderList.size()) {
                        System.out.println("Invalid choice");
                        Orders.listOrder();
                        choose2 = sn.nextInt();
                        sn.nextLine();
                    }
                    int index = choose2;

                    Orders.OrderList.get(index - 1).getList();

                    System.out.print("ID: ");
                    choose2 = sn.nextInt();
                    sn.nextLine();

                    while (choose2 < 0 || choose2 > Orders.OrderList.get(index - 1).getItemsOrdered().size()) {
                        System.out.println("Invalid choice");
                        System.out.print("ID: ");
                        choose2 = sn.nextInt();
                        sn.nextLine();
                    }

                    Orders.OrderList.get(index - 1).removeMedia(choose2);

                    Orders.OrderList.get(index - 1).getList();
                }
                case 4 -> {
                    System.out.println("Display order");
                    System.out.println("Choose order");
                    Orders.listOrder();
                    int choose2 = sn.nextInt();
                    sn.nextLine();

                    while (choose2 < 0 || choose2 > Orders.OrderList.size()) {
                        System.out.println("Invalid choice");
                        Orders.listOrder();
                        choose2 = sn.nextInt();
                        sn.nextLine();
                    }
                    int index = choose2;

                    Orders.OrderList.get(index - 1).getList();
                }
                case 0 -> exit = true;
            }
        }      
	}
}
