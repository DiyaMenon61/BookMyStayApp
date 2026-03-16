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
}