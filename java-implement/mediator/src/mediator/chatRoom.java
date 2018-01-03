package mediator;

import java.util.Date;

public class chatRoom {
    public static void sendMessage(user e, String context){
        System.out.println(new Date().toString()
                + " [" + e.getName() +"] : " + context);
    }
}
