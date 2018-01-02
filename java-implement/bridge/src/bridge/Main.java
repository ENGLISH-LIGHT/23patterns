package bridge;

public class Main {

    public static void main(String[] args) {
        myphone p = new myphone();
        brand iphone = new apple();
        p.setBrand(iphone);
        software app1 = new camera();
        p.setSoftware(app1);
        p.setON();
        p.showBrand();
        p.runSoftware();
        System.out.println("------------------");
        myphone p2 = new myphone();
        brand hw = new huawei();
        p2.setBrand(hw);
        software app2 = new game();
        p2.setSoftware(app2);
        p2.setON();
        p2.showBrand();
        p2.runSoftware();
    }
}
