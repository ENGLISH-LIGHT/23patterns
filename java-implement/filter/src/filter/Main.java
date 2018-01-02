package filter;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<person>persons = new ArrayList<person>();
        persons.add(new person("Robert","Male", "Single"));
        persons.add(new person("John","Male", "Married"));
        persons.add(new person("Laura","Female", "Married"));
        persons.add(new person("Diana","Female", "Single"));
        persons.add(new person("Mike","Male", "Single"));
        persons.add(new person("Bobby","Male", "Single"));

        Criteria male = new CriteraMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single,male);
        Criteria singleMale1 = new AndCriteria(male,single);
        Criteria singleOrFemale = new OrCriteria(single,female);
        Criteria singleOrFemale1 = new OrCriteria(female,single);
//        choose male
        System.out.println("---------------------------------");
        System.out.println("Males:");
        printPersons(male.meetCriteria(persons));
//        choose female
        System.out.println("---------------------------------");
        System.out.println("Females:");
        printPersons(female.meetCriteria(persons));
//        choose singlemale
        System.out.println("---------------------------------");
        System.out.println("1)Singlemales:");
        printPersons(singleMale.meetCriteria(persons));
        System.out.println("---------------------------------");
        System.out.println("2)Singlemales:");
        printPersons(singleMale1.meetCriteria(persons));
//        choose femaleOrsingle
        System.out.println("---------------------------------");
        System.out.println("1)femaleOrsingle:");
        printPersons(singleOrFemale.meetCriteria(persons));
        System.out.println("---------------------------------");
        System.out.println("2)femaleOrsingle:");
        printPersons(singleOrFemale1.meetCriteria(persons));
    }
    public  static void printPersons(List<person> persons){
        for (person item : persons){
            System.out.println("Person : [ Name : " + item.getName()
            + ", Sex : " + item.getSex()
            + ", Marital Status : " + item.getMaritalStatus()
            + " ]");
        }
    }
}
