package filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria {
    @Override
    public List<person> meetCriteria(List<person> persons) {
        List<person> femalePersons = new ArrayList<person>();
        for (person item : persons){
            if (item.getSex().equalsIgnoreCase("female")){
                femalePersons.add(item);
            }
        }
        return femalePersons;
    }
}
