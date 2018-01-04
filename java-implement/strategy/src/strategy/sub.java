package strategy;

public class sub implements strategy {
    @Override
    public int excute(int a, int b) {
        return a - b;
    }
}
