package main.java;

import java.util.Scanner;
import main.java.com.riri.util.Catalog;

public class Main {
    public static void main(String[] args) {
        Catalog<Object> catalog = new Catalog<>();
        Scanner scanner = new Scanner(System.in);
        String title, author, id, details;

        while (true) {
            System.out.println("Choose an option: (1) Add Item (2) Remove Item (3) Display Catalog (4) Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter Title: ");
                    title = scanner.nextLine();
                    System.out.println("Enter Author: ");
                    author = scanner.nextLine();
                    System.out.println("Enter ID: ");
                    id = scanner.nextLine();
                    System.out.println("Enter Details: ");
                    details = scanner.nextLine();
                    catalog.addItem(new LibraryItem<>(title, author, id, details));
                    break;
                case 2:
                    System.out.println("Enter id: ");
                    id = scanner.nextLine();
                    catalog.removeItem(id);
                    break;
                case 3:
                    catalog.displayCatalog();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
    
            }
        }
    }
}