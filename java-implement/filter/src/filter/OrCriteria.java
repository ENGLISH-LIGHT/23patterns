package filter;

import java.util.ArrayList;
import java.util.List;

public class OrCriteria implements Criteria {
    //        满足第一个条件的人
    private Criteria criteria = null;
    //        满足其他条件的人
    private Criteria otherCriteria = null;

    public OrCriteria(Criteria criteria,Criteria otherCriteria){
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }
    @Override
    public List<person> meetCriteria(List<person> persons) {
        List<person> firstPersons = criteria.meetCriteria(persons);
        List<person> otherPersons = otherCriteria.meetCriteria(persons);
        for (person item : otherPersons){
            if (!firstPersons.contains(item)) {
//                并集
                firstPersons.add(item);
            }
        }
        return firstPersons;
    }
}
