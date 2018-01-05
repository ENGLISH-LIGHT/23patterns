package interceptingFilter;

import java.util.ArrayList;
import java.util.List;

public class filterChain {
    private List<filter>filters = new ArrayList<filter>();
    private target targ;
    public void setTarg(target targ){
        this.targ = targ;
    }
    public void addFilter(filter f){
        filters.add(f);
    }
    public void execute(String request){
        for (filter f : filters){
            f.execute(request);
        }
        this.targ.execute(request);
    }
}
