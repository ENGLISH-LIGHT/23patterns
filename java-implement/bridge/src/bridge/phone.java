package bridge;

public abstract class phone {
    protected brand b = null;
    protected software s = null;

    public void setBrand(brand b){
        this.b = b;
    }
    public brand getBrand(){
        return b;
    }
    public void setSoftware(software s){
        this.s = s;
    }
    public software getSoftware(){
        return s;
    }
    //交给具体的对象实现
    public void runSoftware(){
        s.run();
    }
    public void showBrand(){
        b.run();
    }
    //抽象部分
    public abstract void setON();
}
