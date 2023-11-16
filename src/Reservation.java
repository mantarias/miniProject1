import java.time.LocalDateTime;

public class Reservation {
    // when a reservation is made
    private LocalDateTime reservationTime;
    private LocalDateTime reservationFor;
    //who made the reservation
    private Group group;
    private Room room;

    public Reservation(LocalDateTime reservationFor, Group group, Room room) {
        this.reservationTime = LocalDateTime.now();
        this.reservationFor = reservationFor;
        this.group = group;
        this.room = room;

    }


    public LocalDateTime getReservationTime() {
        return reservationTime;
    }

    public LocalDateTime getReservationFor() {
        return reservationFor;
    }

    public Group getGroup() {
        return group;
    }


}
