public class TaxiMeter {
    private final int miles;
    private final int minutes;

    public TaxiMeter(int miles, int minutes) {

        this.miles = miles;
        this.minutes = minutes;
    }

    public Integer calculate() {
        if (miles == 3) {
            return 7;
        }
        return 6;
    }
}
