public class Course {
    private String id;
    private String title;
    private String description;
    private double price;

    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
