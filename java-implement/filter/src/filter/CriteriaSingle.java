package filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle implements Criteria {
    @Override
    public List<person> meetCriteria(List<person> persons) {
        List<person> singlePersons = new ArrayList<person>();
        for (person item : persons){
            if (item.getMaritalStatus().equalsIgnoreCase("single")){
                singlePersons.add(item);
            }
        }
        return singlePersons;
    }
}
