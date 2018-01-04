package nullModel;

public class Main {
    private static final String[] names = {"Rob", "Joe", "Julie"};
    private static customer judge(String name){
        for (int i = 0; i < names.length; i++)
        if (name.equalsIgnoreCase(names[i])){
            return new concreteCustomer(name);
        }
        return new nullCustomer(name);
    }
    public static void main(String[] args) {
        System.out.println(judge("Rob").getName());
        System.out.println(judge("Julie").getName());
        System.out.println(judge("curry").getName());
        System.out.println(judge("tompson").getName());
    }
}
