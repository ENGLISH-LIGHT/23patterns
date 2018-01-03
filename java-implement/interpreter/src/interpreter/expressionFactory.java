package interpreter;

import java.util.HashMap;
import java.util.Hashtable;

public class expressionFactory {
    private static Hashtable<Object,abstractExpression> expressions = new Hashtable<Object, abstractExpression>();
    public static abstractExpression createExpression(String text){
        String key = text.substring(0,1);
        abstractExpression expression = null;
        switch (key){
            case "C":
            case "D":
            case "E":
            case "F":
            case "G":
            case "A":
            case "B":
                expression = expressions.get("note");
                if(expression == null){
                    expression = new noteExpression();
                    expressions.put("note",expression);
                }
                break;
            case "O":
                expression = expressions.get("scale");
                if (expression == null){
                    expression = new scaleExpression();
                    expressions.put("scale",expression);
                }
                break;
            case "S":
                expression = expressions.get("speed");
                if (expression == null){
                    expression = new speedExpression();
                    expressions.put("speed",expression);
                }
                break;
        }
        return expression;
    }
}
