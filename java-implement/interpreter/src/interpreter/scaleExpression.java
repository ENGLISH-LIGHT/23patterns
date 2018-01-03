package interpreter;

//sound tune
public class scaleExpression extends abstractExpression{
    @Override
    public void excute(String key, Double value) {
        String scale = "";
        switch (value.intValue()) {
            case 1:
                scale = "low";
                break;
            case 2:
                scale = "middle";
                break;
            case 3:
                scale = "high";
                break;
        }
        System.out.printf(scale + " ");
    }
}
