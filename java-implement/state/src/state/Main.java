package state;

public class Main {

    public static void main(String[] args) {
        room[] rooms = new room[3];
        for(int i = 0; i < rooms.length; i++){
            rooms[i] = new room();
        }
//        rooms[0].setCurrentstate(new bookedState(rooms[0]));
        System.out.println("-----------------------------------------");
        System.out.println(rooms[0].getCurrentState() + " :");
        rooms[0].bookRoom();
        System.out.println(rooms[0].getCurrentState() + " :");
        rooms[0].unsubscribeRoom();
        System.out.println(rooms[0].getCurrentState() + " :");
        rooms[0].checkInRoom();
        System.out.println(rooms[0].getCurrentState() + " :");
        rooms[0].checkOutRoom();
        System.out.println(rooms[0].getCurrentState() + " :");

        System.out.println("-----------------------------------------");
        System.out.println(rooms[1].getCurrentState() + " :");
        rooms[1].bookRoom();
//        System.out.println(rooms[1].getCurrentState() + " :");
//        rooms[1].unsubscribeRoom();
        System.out.println(rooms[1].getCurrentState() + " :");
        rooms[1].checkInRoom();
        System.out.println(rooms[1].getCurrentState() + " :");
        rooms[1].checkOutRoom();
        System.out.println(rooms[1].getCurrentState() + " :");

        System.out.println("-----------------------------------------");
        System.out.println(rooms[2].getCurrentState() + " :");
        rooms[2].bookRoom();
        System.out.println(rooms[2].getCurrentState() + " :");
        rooms[2].unsubscribeRoom();
        System.out.println(rooms[2].getCurrentState() + " :");
        rooms[2].checkInRoom();
        System.out.println(rooms[2].getCurrentState() + " :");
        rooms[2].checkOutRoom();
        System.out.println(rooms[2].getCurrentState() + " :");

    }
}
