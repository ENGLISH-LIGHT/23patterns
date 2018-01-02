package filter;

//创建一个类，在该类上应用标准
public class person {
    private String name;
    private String sex;
    private String maritalStatus;  //婚姻状况
    public person(String name,String sex,String maritialStatus){
        this.name = name;
        this.sex = sex;
        this.maritalStatus = maritialStatus;
    }
    public String getName(){
        return name;
    }
    public String getSex(){
        return sex;
    }
    public String getMaritalStatus(){
        return maritalStatus;
    }
}
