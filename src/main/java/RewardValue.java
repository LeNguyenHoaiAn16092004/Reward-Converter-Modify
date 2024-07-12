public class RewardValue {
    private double cashValue;
    private double milesValue;
    private final double RATE = 0.0035;
    public RewardValue(double cashValue){
        this.cashValue = cashValue;
        this.milesValue = cashValue / RATE;
    }

    public RewardValue(double milesValue, boolean isMiles){
        if(isMiles){
            this.cashValue = milesValue * RATE;
            this.milesValue = milesValue;
        }
    }
    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }

    public double convertFromMilesToCash(){
        return milesValue * RATE;
    }

}
