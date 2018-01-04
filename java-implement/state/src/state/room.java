package state;

public class room {
    private  state bookedstate;
    private  state checkinstate;
    private  state freetimestate;
    private  state currentstate;
    public room(){
        bookedstate = new bookedState(this);
        checkinstate = new checkInState(this);
        freetimestate = new freeTimeState(this);
        currentstate = freetimestate;
    }
    public void bookRoom(){
        currentstate.bookRoom();
    }
    public void unsubscribeRoom(){
        currentstate.unsubscribeRoom();
    }
    public void checkInRoom(){
        currentstate.checkInRoom();
    }
    public void checkOutRoom(){
        currentstate.checkOutRoom();
    }
    public void setCurrentstate(state currentstate){
        this.currentstate = currentstate;
    }
    public state getBookedstate(){
        return bookedstate;
    }
    public state getFreetimestate(){
        return freetimestate;
    }
    public state getCheckinstate(){
        return checkinstate;
    }

    public String getCurrentState(){
        return this.currentstate.getClass().getName();
    }
}
