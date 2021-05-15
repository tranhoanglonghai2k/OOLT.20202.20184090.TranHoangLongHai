package hust.soict.hedspi.aims.media;

public abstract class Media implements Comparable<Media>{
	protected String title;
	protected String category;
	protected static float cost;
	protected int id;
	public Media(String title, String caterogy, float cost) {
		this.title = title;
		this.category = caterogy;
		this.cost = cost;
	}
	public Media(String title, String caterogy) {
		super();
		this.title = title;
		this.category = caterogy;
	}
	
	public Media(String title) {
		super();
		this.title = title;
	}
  
	public Media() {
		// TODO Auto-generated constructor stub
	}
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public static float getCost() {
		return cost;
	}
	public int getId() {
		return id;
	}

    public boolean equals(Object temp) throws NullPointerException, ClassCastException{
        if(temp != null) {
            if(temp instanceof Media) {
                return this.getTitle().equalsIgnoreCase(((Media) temp).getTitle()) && this.getCost() == ((Media) temp).getCost();
            }else {
                throw new ClassCastException("ERROR: Object casting");
            }
        }else {
            throw new NullPointerException("ERROR: Null pointerexception");
        }
    }
    
	public abstract void display();
}