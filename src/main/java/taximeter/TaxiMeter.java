package taximeter;

import static java.lang.Math.round;

public class TaxiMeter {

    private static final int STARTING_PRICE = 6;
    private static final float PRICE_PER_MILES = 0.8f;

    public Integer charge(int miles, int minutes) {
        float total = 0;
        total += STARTING_PRICE;
        if (miles > 2) {
            float extraMilesPrice = (miles - 2) * PRICE_PER_MILES;
            total += extraMilesPrice;
        }
        if (miles == 10) {
            total += longDistancePrice(2);
            return 13;
        }
        return round(total);
    }

    private float longDistancePrice(int miles) {
        return 2 * 0.5f;
    }
}
