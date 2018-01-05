package DAO;

import java.util.List;

public interface stuDAO {
    public List<stuData> getAllStuData();
    public stuData getStuByNO(int NO);
    public void update(stuData studata);
    public void add(stuData studata);
    public void delete(stuData studata);
}
