package proxy;

public class realImage implements image {
    private String fileName = "";
    @Override
    public void display() {
        System.out.println("Displaying the " + fileName);
    }
    public realImage(String fileName){
        this.fileName = fileName;
        loadFromDisk();
    }
    public void loadFromDisk(){
        System.out.println("Loading the " + fileName + " from disk...");
    }
}
