package filter;

import java.util.List;

public class AndCriteria implements Criteria{
    private Criteria criteria = null;
    private Criteria otherCriteria = null;

    public AndCriteria(Criteria criteria,Criteria otherCriteria){
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<person> meetCriteria(List<person> persons) {
        List<person> firstPersons = criteria.meetCriteria(persons);
        return otherCriteria.meetCriteria(firstPersons);
    }
}
