package labb2;

import java.util.Date;

public class Purchase  {
    private int Id;
    private Date Date;
    private float Amount;
    private String Comment;
    private int CategoryId;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public java.util.Date getDate() {
        return Date;
    }

    public void setDate(java.util.Date date) {
        Date = date;
    }

    public float getAmount() {
        return Amount;
    }

    public void setAmount(float amount) {
        Amount = amount;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String comment) {
        Comment = comment;
    }

    public int getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(int categoryId) {
        CategoryId = categoryId;
    }


    public Purchase(int id, Date date, float amount, String comment, int categoryId) {
        Id = id;
        Date = date;
        Amount = amount;
        Comment = comment;
        CategoryId = categoryId;

    }

    public Purchase(){

    }

    @Override
    public String toString() {
        return "Purchase{" +
                "Amount=" + Amount +
                '}';
    }
}

