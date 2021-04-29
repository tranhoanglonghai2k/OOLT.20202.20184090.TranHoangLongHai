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
    
    public boolean equals(Object o) {
        if (o instanceof Media) {
            Media another = (Media) o;
            if(another!=null)
            if (this.id == another.id)
                return true;
        }
        return false;
    }

    public int compareTo(Object o) {
            if (o instanceof Media) {
                Media another = (Media) o;
                if(another != null)
                return this.getTitle().compareTo(another.getTitle());


            }
        return -1;
    }
    
  public Media() {
	  
  }
}
