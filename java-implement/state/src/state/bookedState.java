package state;

public class bookedState implements state {
    private room hotelManagement;

    public bookedState(room hotelManagement){
        this.hotelManagement = hotelManagement;
    }

    @Override
    public void bookRoom() {
        System.out.println("This room has been booked!");
    }

    @Override
    public void unsubscribeRoom() {
        System.out.println("Unsubscribe this room has successed!");
        hotelManagement.setCurrentstate(hotelManagement.getFreetimestate());
    }
    @Override
    public void checkInRoom() {
        System.out.println("You can check in this room!");
        hotelManagement.setCurrentstate(hotelManagement.getCheckinstate());
    }

    @Override
    public void checkOutRoom() {

    }

}
