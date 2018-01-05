package interceptingFilter;

public class Main {

    public static void main(String[] args) {

        filterManger manger = new filterManger(new target());
        manger.setFilter(new authenticationFilter());
        manger.setFilter(new debugFilter());
        client c = new client();
        c.setFilterManager(manger);
        c.sendRequest("hello");
    }
}
