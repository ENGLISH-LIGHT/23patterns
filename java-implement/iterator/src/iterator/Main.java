package iterator;

public class Main {

    public static void main(String[] args) {
        nameContainer context = new nameContainer();
        iterator iter = context.getIterator();
        while (iter.hasNext()){
            System.out.println("name : " + (String) iter.next());
        }
    }
}
