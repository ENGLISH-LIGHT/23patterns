package mvc;

public class stuController {
    private stuData studata;
    private stuView stuview;

    public stuController(stuData studata,stuView stuview){
        this.studata = studata;
        this.stuview = stuview;
    }
    public void setName(String name){
        studata.setName(name);
    }
    public void setNO(String NO){
        studata.setNO(NO);
    }
    public String getName(){
        return studata.getName();
    }
    public String getNO(){
        return studata.getNO();
    }
    public void updateView(){
        stuview.printStuDetails(studata.getName(),studata.getNO());
    }
}
