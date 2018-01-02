package filter;

import java.util.List;

public interface Criteria {
    public List<person> meetCriteria(List<person> persons);
}
