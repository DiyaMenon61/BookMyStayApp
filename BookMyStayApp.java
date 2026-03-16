import java.util.HashMap;

public class BookMyStayApp {

    public static void main(String[] args) {

        System.out.println("Book My Stay App - Version 4.0");

        // Centralized inventory
        HashMap<String, Integer> inventory = new HashMap<>();

        inventory.put("Single Room", 5);
        inventory.put("Double Room", 3);
        inventory.put("Suite Room", 0); // not available

        System.out.println("Available Rooms:");

        // Search and display only available rooms
        for (String room : inventory.keySet()) {

            int available = inventory.get(room);

            if (available > 0) {
                System.out.println(room + " | Price: Rs.2000 | Available: " + available);
            }
        }
    }
}