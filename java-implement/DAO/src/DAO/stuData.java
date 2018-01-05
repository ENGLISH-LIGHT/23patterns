package DAO;

public class stuData {
    private String name;
    private int NO;
    public stuData(String name , int NO){
        this.name = name;
        this.NO = NO;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNO(int NO) {
        this.NO = NO;
    }

    public String getName() {
        return name;
    }

    public int getNO() {
        return NO;
    }
}
