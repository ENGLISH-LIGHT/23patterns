package interpreter;
//playText
//"S 1500 O 2 E 0.5 G 0.5 A 3 E 0.5 G 0.5 D 3 E 0.5 "
// + "G 0.5 A 0.5 O 3 C 1 O 2 A 0.5 G 1 C 0.5 E 0.5 D 3 "

public abstract class abstractExpression {
    public void interpret(context t){
        if (t.getPlayText().length() == 0){
            return;
        }
//        get the first char as key
        String playText = t.getPlayText();
        String key = playText.substring(0,1); //"S"
//      the left chars
        playText = playText.substring(2);
//        the first char of key as value
//        1500
        Double value = Double.parseDouble(playText.substring(0,playText.indexOf(" ")));
//        the ultimate chars
        playText = playText.substring(playText.indexOf(" ") + 1);
        t.setPlayText(playText);
//        interpreter excuting
        excute(key,value);
    }
    public abstract void excute(String key,Double value);
}
