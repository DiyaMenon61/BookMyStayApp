import java.util.*;

public class BookMyStay {

    public static void main(String[] args) {

        Queue<String> requests = new LinkedList<>();
        requests.add("Single");
        requests.add("Double");
        requests.add("Single");

        Map<String, Integer> inventory = new HashMap<>();
        inventory.put("Single", 2);
        inventory.put("Double", 1);

        Set<String> usedRooms = new HashSet<>();
        Map<String, Set<String>> allocated = new HashMap<>();

        int id = 1;

        while (!requests.isEmpty()) {
            String type = requests.poll();

            if (inventory.get(type) > 0) {

                String roomId = type + id++;

                usedRooms.add(roomId);

                allocated.putIfAbsent(type, new HashSet<>());
                allocated.get(type).add(roomId);

                inventory.put(type, inventory.get(type) - 1);

                System.out.println("Booked " + type + " → " + roomId);

            } else {
                System.out.println(type + " Not Available");
            }
        }

        System.out.println("Allocated Rooms: " + allocated);
    }
}