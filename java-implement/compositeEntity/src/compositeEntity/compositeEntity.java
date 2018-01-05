package compositeEntity;

public class compositeEntity {
    private coarseGrainedObject obj = new coarseGrainedObject();
    public void setStrs(String str1,String str2){
        obj.setStrs(str1,str2);
    }
    public String[] getStrs(){
        return obj.getStrs();
    }
}
