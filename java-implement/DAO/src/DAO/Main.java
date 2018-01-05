package DAO;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        stuDAOImp daoImp = new stuDAOImp();

//      select all students information
        List<stuData> stus = daoImp.getAllStuData();
        for (int i = 0; i < stus.size(); i++) {
            System.out.println("[ name : " + stus.get(i).getName()
                    + " NO : " +stus.get(i).getNO() + " ]");
        }
//        add a new student into database
        daoImp.add(new stuData("tompson",5));
//        select a student imformation by NO
        stuData d = daoImp.getStuByNO(3);
        System.out.println("[ name : " + d.getName()
                + " NO : " +d.getNO() + " ]");
        d = daoImp.getStuByNO(0);
        System.out.println("[ name : " + d.getName()
                + " NO : " +d.getNO() + " ]");
//        update the certain student information from the databasewhen the NO is same
        daoImp.update(new stuData("KD",1));
//        delete the certain student information from the database when the NO is same
        daoImp.delete(new stuData("tompson",3));
    }
}
