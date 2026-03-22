import java.util.*;

public class BookMyStay {
    public static void main(String[] args) {

        Queue<String> q = new LinkedList<>();
        q.add("Single");
        q.add("Double");

        Map<String, Integer> inv = new HashMap<>();
        inv.put("Single", 1);
        inv.put("Double", 1);

        Set<String> rooms = new HashSet<>();
        int id = 1;

        while (!q.isEmpty()) {
            String type = q.poll();

            if (inv.get(type) > 0) {
                String roomId = type + id++;
                rooms.add(roomId);
                inv.put(type, inv.get(type) - 1);
                System.out.println("Booked: " + roomId);
            } else {
                System.out.println(type + " not available");
            }
        }
    }
}