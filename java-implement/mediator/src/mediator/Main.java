package mediator;

public class Main {

    public static void main(String[] args) {
        user john = new user("john");
        user kb = new user("kb");

        //全是由聊天室转发处理
        john.sendMessage("hi! kb!");
        kb.sendMessage("hello! john");
    }
}
