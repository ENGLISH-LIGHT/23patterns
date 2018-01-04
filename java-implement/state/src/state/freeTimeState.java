package state;

public class freeTimeState implements state {
    private room hotelManagement;
    public freeTimeState(room hotelManagement){
        this.hotelManagement = hotelManagement;
    }

    @Override
    public void bookRoom() {
        System.out.println("This room has been booked!");
        hotelManagement.setCurrentstate(hotelManagement.getBookedstate());
    }

    @Override
    public void unsubscribeRoom() {

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
