package hust.soict.hedspi.aims.media;
import java.util.ArrayList;
import java.util.List;

public class Book extends Media{

private List<String> authors = new ArrayList<String>();
	
	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	
	public Book(String title) {
		super(title);
	}

    public Book(String title, String category, List<String> authors) {
		super(title,category);
		this.authors=authors;
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
}
