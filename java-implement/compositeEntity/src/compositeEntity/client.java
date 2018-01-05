package compositeEntity;

public class client {
    private compositeEntity compositeEntity = new compositeEntity();

    public void printData(){
        for (int i = 0; i < compositeEntity.getStrs().length; i++) {
            System.out.println("Data: " + compositeEntity.getStrs()[i]);
        }
    }
    public void setData(String data1, String data2){
        compositeEntity.setStrs(data1, data2);
    }
}
