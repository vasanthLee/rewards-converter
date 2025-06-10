public class RewardValue {
    private static final double MILES_TO_CASH_RATE = 0.0035;

    private final double cashValue;
    private final int milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = convertCashToMiles(cashValue);
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = convertMilesToCash(milesValue);
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }

    private static int convertCashToMiles(double cashValue) {
        return (int) Math.round(cashValue / MILES_TO_CASH_RATE);
    }

    private static double convertMilesToCash(int milesValue) {
        return milesValue * MILES_TO_CASH_RATE;
    }
}
