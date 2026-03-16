import java.util.HashMap;

public class BookMyStayApp {

    public static void main(String[] args) {

        System.out.println("Book My Stay App - Version 3.1");

        HashMap<String, Integer> inventory = new HashMap<>();

        inventory.put("Single Room", 5);
        inventory.put("Double Room", 3);
        inventory.put("Suite Room", 2);

        System.out.println("Room Inventory:");

        for (String room : inventory.keySet()) {
            System.out.println(room + " Available: " + inventory.get(room));
        }
    }
}