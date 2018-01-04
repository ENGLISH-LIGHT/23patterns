package state;

public class checkInState implements state {
    private room hoteManagement;
    public checkInState(room hoteManagement){
        this.hoteManagement = hoteManagement;
    }

    @Override
    public void bookRoom() {
        System.out.println("This room has been booked!");
    }

    @Override
    public void unsubscribeRoom() {

    }

    @Override
    public void checkInRoom() {
        System.out.println("You can check in this room!");
    }

    @Override
    public void checkOutRoom() {
        System.out.println("Checking out room has successed!");
        hoteManagement.setCurrentstate(hoteManagement.getFreetimestate());
    }
}
