package chain;

public class generalManager extends handler {
    @Override
    public String handleRequest(String name, double fee) {
        String str = "";
        if(fee <= 2000){
            if (name.equalsIgnoreCase("david")){
                str = name + "'s fee : " + fee + " has been handled by generalManager.";
            }
            else {
                str = name + "'s fee : " + fee + " has been refused by generalManager.";
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
