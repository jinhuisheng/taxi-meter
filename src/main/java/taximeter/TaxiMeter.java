package taximeter;

import static java.lang.Math.round;

public class TaxiMeter {

    private static final int STARTING_PRICE = 6;

    public Integer charge(int miles, int minutes) {
        if (miles <= 2) {
            return STARTING_PRICE;
        }
        float extraMilesPrice = (miles - 2) * 0.8f;
        return round(STARTING_PRICE + extraMilesPrice);
    }
}
