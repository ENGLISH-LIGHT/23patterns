package template;

public class Main {

    public static void main(String[] args) {
        System.out.println("------------------------------------");
        game planebattle = new planesBattle();
        planebattle.play();
        System.out.println("------------------------------------");
        game supermarry = new superMarry();
        supermarry.play();
    }
}
