package taximeter;

import static java.lang.Math.round;

public class TaxiMeter {
    public Integer charge(int miles, int minutes) {
        if (miles <= 2) {
            return 6;
        }
        float extraMilesPrice = 1 * 0.8f;
        return round(6 + extraMilesPrice);
    }
}
