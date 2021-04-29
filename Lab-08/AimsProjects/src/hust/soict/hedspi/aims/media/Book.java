package hust.soict.hedspi.aims.media;
import java.util.*;

public class Book extends Media{

	private ArrayList<String> authors = new ArrayList<String>();
	private String content;
	private List<String> contentTokens;
	private Map<String, Integer> wordFrequency;
    public Book(String title) {
        super(title);
    }

	
	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}

    public Book(String title, String category, List<String> authors) {
		super(title,category);
		this.authors = authors;
	}

    public void addAuthor (String authorName){
        if(authors.indexOf(authorName) == -1)
        {
            authors.add(authorName);
            System.out.println("Existed author name!!!");
        }else{
            System.out.println("This name is added!!!");
        }
    }

    public void removeAuthor(String authorName){
        if(authors.size()>0)
            if(authors.indexOf(authorName) != -1){
                authors.remove(authorName);
                System.out.println("Author name has been deleted!!!");
            }else{
                System.out.println("Don't find author name!!!");
            }
    } 
    
    public int compareTo(Object o) {
        if (o instanceof Book) {
            Book another = (Book) o;
            if(another!=null)
            return this.getTitle().compareTo(another.getTitle());
        }

    return -1;
    }
    public void processContent() {
		contentTokens = Arrays.asList( content.split(" "));
		Collections.sort(contentTokens);
		wordFrequency = new HashMap<String, Integer>();
		Iterator<String> iterator = contentTokens.iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			Integer frequency = wordFrequency.get(key);
			if (frequency==null) frequency = 1;
			else {
				int value = frequency.intValue();
				frequency = value+1;
			}
			wordFrequency.put(key, frequency);
		}
		wordFrequency = new TreeMap<String, Integer>(wordFrequency);
	}

	public String toString() {
        System.out.println("---------Book Information-----------");
        System.out.println("- Title: " + this.getTitle());
        System.out.println("- Catogory: " + this.getCategory());
        System.out.println("- Cost: " + this.getCost());
        System.out.println("- Author: " + this.getAuthors());
        System.out.println("- Content: " + this.content);
        System.out.println("- Content Length: " + this.contentTokens.size());
        System.out.println("- Content Token in sorted order: " + this.contentTokens);
        System.out.println("- Token List & Frequency: ");
        wordFrequency.forEach((key, value) -> System.out.println("\t" + key + ": \t" + value));
        System.out.println("------------------------------------");
        return content;
    }

}
