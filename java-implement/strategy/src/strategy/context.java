package strategy;

public class context {
    private strategy currentstrategy;

    public context(strategy currentstrategy){
        this.currentstrategy = currentstrategy;
    }
    public int excuteStrategy(int a, int b){
        return currentstrategy.excute(a,b);
    }
}
