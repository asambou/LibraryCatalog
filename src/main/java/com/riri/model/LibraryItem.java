package main.java.com.riri.model;

public class LibraryItem<T> {
    private String title; 
    private String author;
    private String itemID;
    private T details;


    public LibraryItem(String title, String author, String itemID, T detailsT) {
        this.title = title;
        this.author = author;
        this.itemID = itemID;
        this.details = details;
    }
    
    public String getTitle(){
        return title; 
    }

    public String getAuthor(){
        return author;
    }
    public String getItemID(){
        return itemID;

    }
    public T getDetails(){
        return details;
        
    }
}
