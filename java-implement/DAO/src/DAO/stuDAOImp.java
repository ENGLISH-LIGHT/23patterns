package DAO;

import java.util.ArrayList;
import java.util.List;

public class stuDAOImp implements stuDAO {
    private List<stuData> stus = new ArrayList<stuData>();
    public stuDAOImp(){
        this.stus.add(new stuData("curry",0));
        this.stus.add(new stuData("kaiven",1));
        this.stus.add(new stuData("west",2));
    }

    @Override
    public stuData getStuByNO(int NO) {
        return stus.get(NO);
    }

    @Override
    public List<stuData> getAllStuData() {
        return stus;
    }

    @Override
    public void add(stuData studata) {
        studata.setNO(stus.size() - 1);
        stus.add(studata);
        System.out.println("Student : NO " + studata.getNO() + ", has added in the database");
    }

    @Override
    public void delete(stuData studata) {
        stus.remove(studata.getNO());
        System.out.println("Student : NO " + studata.getNO() + ", deleted from database");
    }

    @Override
    public void update(stuData studata) {
        stus.get(studata.getNO()).setName(studata.getName());
        System.out.println("Student : NO " + studata.getNO() + ", updated in the database");
    }
}
