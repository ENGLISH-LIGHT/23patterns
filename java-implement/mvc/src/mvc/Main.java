package mvc;

public class Main {

    private static stuData retriveStuDataFromDB(){
        stuData data = new stuData();
        data.setNO("1000");
        data.setName("curry");
        return data;
    }
    public static void main(String[] args) {
//      getting the student data from database
        stuData studata = retriveStuDataFromDB();
        stuView stuview = new stuView();
        stuController controller = new stuController(studata,stuview);
        controller.updateView();

//      alter student data
        controller.setNO("2000");
        controller.setName("kaiven");
        controller.updateView();
    }
}
