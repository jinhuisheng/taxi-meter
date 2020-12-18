package taximeter;

public class TaxiMeter {
    public Integer charge(int miles, int minutes) {
        if (miles <= 2) {
            return 6;
        }
        return 7;
    }
}
