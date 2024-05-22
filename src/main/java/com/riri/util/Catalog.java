package main.java.com.riri.util;

import java.util.HashMap;
import java.util.Map;
import main.java.com.riri.model.LibraryItem;

public class Catalog<T> {
    private Map<String, LibraryItem<T>> items = new HashMap<>();

    public void addItem(LibraryItem<T> item ){
        items.put(item.getItemID(), item);
    }
    
    public void removeItem(String itemID){
        if(items.containsKey(itemID)){
            items.remove(itemID);
        }else{
            System.out.println("Item not found!");
        }
    }

    public LibraryItem<T> getItem(String itemID){
        return items.getOrDefault(itemID,null);  

    }
    public void displayCatalog() { 
        for (LibraryItem item : items.values()) {
            System.out.println("ID: " + item.getItemID() + ", Title: " + item.getTitle() + ", Author: " + item.getAuthor()); 
        } 
    }
}
