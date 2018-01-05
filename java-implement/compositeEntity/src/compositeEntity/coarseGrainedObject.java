package compositeEntity;

public class coarseGrainedObject {
    private dependobject1 obj1 = new dependobject1();
    private dependobject2 obj2 = new dependobject2();

    public String[] getStrs() {
        return new String[] {obj1.getStr(),obj2.getStr()};
    }

    public void setStrs(String str1,String str2) {
        obj1.setStr(str1);
        obj2.setStr(str2);
    }
}
