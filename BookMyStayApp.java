import java.util.HashMap;

public class BookMyStayApp {
    static abstract class Room {
        String type;

        Room(String type) {
            this.type = type;
        }

        void showRoom() {
            System.out.println("Room Type: " + type);
        }
    }

    
    // Single Room
    static class SingleRoom extends Room {
        SingleRoom() {
            super("Single Room");
        }
    }

    // Double Room
    static class DoubleRoom extends Room {
        DoubleRoom() {
            super("Double Room");
        }
    }

    // Suite Room
    static class SuiteRoom extends Room {
        SuiteRoom() {
            super("Suite Room");
        }
    }

    public static void main(String[] args) {

        System.out.println("Book My Stay App - Version 2.1");

        Room r1 = new SingleRoom();
        Room r2 = new DoubleRoom();
        Room r3 = new SuiteRoom();

        int singleAvailable = 5;
        int doubleAvailable = 3;
        int suiteAvailable = 2;

        r1.showRoom();
        System.out.println("Available: " + singleAvailable);

        r2.showRoom();
        System.out.println("Available: " + doubleAvailable);

        r3.showRoom();
        System.out.println("Available: " + suiteAvailable);
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Book My Stay App");
        System.out.println("Hotel Booking Management System");
        System.out.println("Version 1.0");

    }


    public static void main(String[] args) {

        System.out.println("Book My Stay App - Version 3.1");

        HashMap<String, Integer> inventory = new HashMap<>();

        inventory.put("Single Room", 5);
        inventory.put("Double Room", 3);
        inventory.put("Suite Room", 2);

        System.out.println("Room Inventory:");

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

        for (String room : inventory.keySet()) {
            System.out.println(room + " Available: " + inventory.get(room));

        }
    }
}