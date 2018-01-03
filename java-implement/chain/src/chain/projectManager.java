package chain;

//He just handle the david's fee less 500
public class projectManager extends handler{
    @Override
    public String handleRequest(String name, double fee) {
        String str = "";
        if(fee <= 500){
            if (name.equalsIgnoreCase("david")){
                str = name + "'s fee : " + fee + " has been handled by projectManager.";
            }
            else {
                str = name + "'s fee : " + fee + " has been refused by projectManager.";
            }
        }
        else {
            if (getSuccessor() != null){
//            This request is committed to deptManager to handle.
                str = this.getSuccessor().handleRequest(name,fee);
            }
            else{
                str = name + "'s fee : " + fee + " no one can handle it";
            }
        }
        return str;
    }
}
