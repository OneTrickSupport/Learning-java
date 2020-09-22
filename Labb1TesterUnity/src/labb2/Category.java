package labb2;

public class Category {
    private int id;
    private String Description;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Category(int id, String description) {
        this.id = id;
        Description = description;
    }
    public Category(){

    }

    public Category(int id) {
        this.id = id;
    }
}
