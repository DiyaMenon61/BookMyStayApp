
import java.util.*;

    public static void main(String[] args) {

        System.out.println("Book My Stay App");

        Queue<String> q = new LinkedList<>();

        q.add("Guest1 - Single Room");
        q.add("Guest2 - Double Room");
        q.add("Guest3 - Suite Room");

        System.out.println("Booking Requests:");

        while(!q.isEmpty()) {
            System.out.println(q.remove());

        }
    }
