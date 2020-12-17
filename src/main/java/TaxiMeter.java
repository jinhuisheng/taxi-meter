public class TaxiMeter {
    private final int miles;
    private final int minutes;

    public TaxiMeter(int miles, int minutes) {

        this.miles = miles;
        this.minutes = minutes;
    }

    public Integer calculate() {
        if (miles <= 2) {
            return 6;
        }
        return 6 + addPricePerMiles(1);
    }

    private int addPricePerMiles(int miles) {
        return 1;
    }
}
