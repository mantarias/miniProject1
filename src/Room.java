public class Room {
    private int id;
    private int size;
    private boolean isBooked;

    public Room(int id, int size) {
        this.id = id;
        this.size = size;
        this.isBooked = false;
    }

    public int getId() {
        return this.id;
    }

    public int getSize() {
        return this.size;
    }

    public boolean getIsBooked() {
        return this.isBooked;
    }

    public void setIsBooked(boolean isBooked) {
        this.isBooked = isBooked;
    }
    
}
