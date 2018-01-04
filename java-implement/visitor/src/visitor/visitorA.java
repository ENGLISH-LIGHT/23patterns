package visitor;

public class visitorA implements visitor {
    private String name;
    public visitorA(String name){
        this.name = name;
    }
    @Override
    public void visitElementA(elementA A) {
        System.out.println(this.name + " is using the element of A : " + A.getName());
    }

    @Override
    public void visitElementB(elementB B) {
        System.out.println(this.name + " is using the element of B : " + B.getName());
    }
}
