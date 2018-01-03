package mediator;

public class user {
    private String name = "";
    public user(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void sendMessage(String context){
        chatRoom.sendMessage(this,context);
    }
}
