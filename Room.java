public class Room {

    private int roomId;
    private String roomNumber;
    private String roomType;
    private boolean available;

    public Room(int roomId, String roomNumber, String roomType, boolean available) {
        this.roomId = roomId;
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.available = available;
    }

    public void allocateRoom() {
        if (available) {
            available = false;
            System.out.println("Room allocated successfully.");
        } else {
            System.out.println("Room is not available.");
        }
    }

    public void releaseRoom() {
        available = true;
        System.out.println("Room released successfully.");
    }

    public void displayRoomDetails() {
        System.out.println("Room ID: " + roomId);
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Room Type: " + roomType);
        System.out.println("Available: " + available);
    }
}
