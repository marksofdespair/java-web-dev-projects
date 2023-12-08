import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;


public class Menu {
    // Class-specific field declarations for the MenuItem and Date Updated
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

    public String displayMenu() {
        // Logic to display menu items here
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }
}