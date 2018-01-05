package interceptingFilter;

public class filterManger {
    filterChain filterchain;
    public filterManger(target targ){
        filterchain = new filterChain();
        filterchain.setTarg(targ);
    }
    public void setFilter(filter f){
        filterchain.addFilter(f);
    }
    public void filterRequest(String request){
        filterchain.execute(request);
    }
}
