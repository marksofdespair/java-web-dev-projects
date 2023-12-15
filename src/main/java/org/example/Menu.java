package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Menu {
    // Class-specific field declarations for the Menu and Date Updated
    private List<MenuItem> items;
    private Date lastUpdate;

    // Constructor method for Menu Class
    public Menu() {
        this.items = new ArrayList<>();
        this.lastUpdate = new Date();
    }

    // Methods to add/remove items, display menu, etc.

    public void addItem(MenuItem item) {
        items.add(item);
        lastUpdate = new Date(); // Update lastUpdate when a new item is added
    }

    public void removeItem(MenuItem item) {
        items.remove(item);
        lastUpdate = new Date(); // Update lastUpdate when an item is removed
    }

    public String displayMenu() {
        // Logic to display menu items here
        // You can iterate through 'items' and format them as needed
        StringBuilder menuString = new StringBuilder();
        for (MenuItem item : items) {
            menuString.append(item.displayMenuItem()).append("\n");
        }
        return menuString.toString();
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }
}
