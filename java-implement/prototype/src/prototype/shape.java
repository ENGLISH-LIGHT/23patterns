package prototype;

public abstract class shape implements Cloneable  {
    private String  id;
    protected String type;

    public abstract void draw();
    public String getType(){
        return type;
    }
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    public Object clone(){
        Object clone = null;
        try {
            clone = super.clone();      //浅复制
        }
        catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clone;
    }
}
