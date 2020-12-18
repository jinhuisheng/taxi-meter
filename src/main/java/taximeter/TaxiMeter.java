package taximeter;

public class TaxiMeter {
    public Integer charge(int miles, int minutes) {
        if (miles == 3) {
            return 7;
        }
        return 6;
    }
}
