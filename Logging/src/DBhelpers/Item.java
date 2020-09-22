package DBhelpers;

public class Item {
    int id;
    boolean available;
    int ISBN;

    public Item(int id, boolean available, int ISBN) {
        this.id = id;
        this.available = available;
        this.ISBN = ISBN;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
}
