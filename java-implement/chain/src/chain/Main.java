package chain;

public class Main {

    public static void main(String[] args) {
        //Making the responsibility chain
        handler h1 = new generalManager();
        handler h2 = new deptManager();
        handler h3 = new projectManager();
        h3.setSuccessor(h2);
        h2.setSuccessor(h1);
        System.out.println(h3.handleRequest("david",400));
        System.out.println(h3.handleRequest("angle",400));
        System.out.println("--------------------------------------------------");
        System.out.println(h3.handleRequest("david",800));
        System.out.println(h2.handleRequest("david",900));
        System.out.println("--------------------------------------------------");
        System.out.println(h3.handleRequest("david",1500));
        System.out.println(h2.handleRequest("david",1600));
        System.out.println(h1.handleRequest("david",1700));
        System.out.println("--------------------------------------------------");

    }
}
