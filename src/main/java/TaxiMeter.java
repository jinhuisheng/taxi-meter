
public class TaxiMeter {
    private final TotalPrice totalPrice;
    private final MilesPrice milesPrice;
    private final WaitingPrice waitingPrice;

    public TaxiMeter() {
        totalPrice = new TotalPrice();
        milesPrice = new MilesPrice(totalPrice);
        waitingPrice = new WaitingPrice(totalPrice);
    }

    public Integer calculate(int miles, int minutes) {
        milesPrice.calculateMilesPrice(miles);
        waitingPrice.calculateWaitingMinutesPrice(minutes);
        return totalPrice.toInteger();
    }

}
