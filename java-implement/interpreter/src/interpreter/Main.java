package interpreter;

public class Main {

    public static void main(String[] args) {
        context playText = new context();
        playText.setPlayText("S 1500 O 2 E 0.5 G 0.5 A 3 E 0.5 G 0.5 D 3 E 0.5 "
                + "G 0.5 A 0.5 O 3 C 1 O 2 A 0.5 G 1 C 0.5 E 0.5 D 3 ");
        abstractExpression expression = null;
        try {
            while(playText.getPlayText().length() > 0){
                expression = expressionFactory.createExpression(playText.getPlayText());
                expression.interpret(playText);
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
