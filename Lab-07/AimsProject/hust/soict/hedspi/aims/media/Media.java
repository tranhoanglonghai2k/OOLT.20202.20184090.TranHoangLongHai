package hust.soict.hedspi.aims.media;

public abstract class Media {
	
	protected String title;
    protected String category;
    protected float cost;
    protected int id;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public float getCost() {
        return cost;
    }
    
    public void setCost(float cost) {
        this.cost = cost;
    }

    public Media(String title){
        this.title = title;
    }

    public Media(String title,String category){
        this.title = title;
        this.category = category;
    }

    public Media(String title,String category,float cost,int id){
        this.title = title;
        this.category = category;
        this.id = id;
        this.cost = cost;
    }
    
  public Media() {
	  
  }
}
