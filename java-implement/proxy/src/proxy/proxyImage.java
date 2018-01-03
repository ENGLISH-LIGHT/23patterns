package proxy;

public class proxyImage implements image {
    private String fileName = "";
    public proxyImage(String fileName){
        this.fileName = fileName;
    }
    private realImage realimage = null;
    @Override
    public void display() {
//        第一次加载
        if (realimage == null){
            realimage = new realImage(fileName);
        }
        realimage.display();
        System.out.println("---------------------------------------");
    }
}
