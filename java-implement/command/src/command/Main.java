package command;

public class Main {

    public static void main(String[] args) {
        programmer monkey1 = new programmer("light");
        productManager productmanager = new productManager(monkey1);

        user A = new user("A",productmanager);
        user B = new user("B",productmanager);
        user C = new user("C",productmanager);
        user D = new user("D",productmanager);
        System.out.println("-------------------------------");
        A.putDemand();
        B.putDemand();
        B.putBug();
        C.putDemand();
        C.putProblem();
        D.putDemand();
        System.out.println("-------------------------------");
        System.out.println("-----------first day-----------");
        productmanager.assign();
        productmanager.printTaskList();
        System.out.println("------------next day-----------");
        productmanager.assign();
        productmanager.printTaskList();
    }
}
