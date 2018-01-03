package command;

public class user {
    private String name = null;
    private productManager productmanger = null;
    public user(String name){
        this.name = name;
    }
    public user(String name,productManager productmanger){
        this.name = name;
        this.productmanger = productmanger;
    }
    public String getName(){
        return name;
    }
    public productManager getProductmanger(){
        return productmanger;
    }
    public void setProductmanger(productManager productmanger){
        this.productmanger = productmanger;
    }
    public void putDemand(){
        System.out.println("user : " + name + " commit a new demand");
        productmanger.receive(new demand(productmanger.choosecoder()));
    }
    public void putBug(){
        System.out.println("user : " + name + " commit a new bug");
        productmanger.receive(new bug(productmanger.choosecoder()));
    }
    public void putProblem(){
        System.out.println("user : " + name + " commit a new problem");
        productmanger.receive(new problem(productmanger.choosecoder()));
    }

}


