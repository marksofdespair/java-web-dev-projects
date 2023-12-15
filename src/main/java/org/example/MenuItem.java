package org.example;

import java.util.Objects;

public class MenuItem {
    // Field declarations
    private String itemName;
    private double price;
    private String description;
    private Category category;
    private boolean isNew;

    // Constructors, getters, setters here
    public MenuItem(String itemName, double price, String description, String categoryName, boolean isNew) {
        this.itemName = itemName;
        this.price = price;
        this.description = description;
        this.category = new Category(categoryName);
        this.isNew = isNew;
    }

    // Additional methods here if needed
    public String displayMenuItem() {
        // Logic to display a single menu item
        // You can format the item details as needed
        return itemName + " - $" + price + " - " + description + " - Category: " + category.getCategoryName() + " - New: " + isNew;
    }

    // Override equals/hashcode
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        MenuItem menuItem = (MenuItem) obj;
        return Double.compare(menuItem.price, price) == 0 &&
                itemName.equals(menuItem.itemName) &&
                description.equals(menuItem.description) &&
                category.equals(menuItem.category) &&
                isNew == menuItem.isNew;
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemName, price, description, category, isNew);
    }

    // Inner class for Category instead of new Java Class
    public class Category {
        private String categoryName;

        public Category(String categoryName) {
            this.categoryName = categoryName;
        }

        public String getCategoryName() {
            return categoryName;
        }

        // Override equals and hashCode methods
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            MenuItem menuItem = (MenuItem) obj;
            return Double.compare(menuItem.price, price) == 0 &&
                    itemName.equals(menuItem.itemName) &&
                    description.equals(menuItem.description) &&
                    category.equals(menuItem.category) &&
                    isNew == menuItem.isNew;
        }

        @Override
        public int hashCode() {
            return Objects.hash(itemName, price, description, category, isNew);
        }

        // Attempt at overriding toString for better display lol
        @Override
        public String toString() {
            return categoryName;
        }
    }
}
