package filter;

import java.util.ArrayList;
import java.util.List;

public class CriteraMale implements Criteria{
    @Override
    public List<person> meetCriteria(List<person> persons) {
        List<person> malePersons = new ArrayList<person>();
        for (person item : persons){
            if (item.getSex().equalsIgnoreCase("Male")){
                malePersons.add(item);
            }
        }
        return malePersons;
    }
}
