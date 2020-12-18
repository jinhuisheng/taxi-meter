package taximeter;

import static java.lang.Math.round;

public class TaxiMeter {

    private static final int STARTING_PRICE = 6;
    private static final float PRICE_PER_MILES = 0.8f;
    private static final int TWO_MILES = 2;
    private static final int EIGHT_MILES = 8;
    private static final float WAITING_PRICE_PER_MINUTE = 0.25f;
    private static final float LONG_DISTANCE_PRICE_PER_MILES = 0.5f;

    public Integer charge(int miles, int minutes) {
        float total = distancePrice(miles);
        total += waitingPrice(minutes);
        return round(total);
    }

    private float distancePrice(int miles) {
        return startingPrice() + extraMilesPrice(miles) + longDistancePrice(miles);
    }

    private int startingPrice() {
        return STARTING_PRICE;
    }

    private float extraMilesPrice(int miles) {
        if (miles > TWO_MILES) {
            return (miles - TWO_MILES) * PRICE_PER_MILES;
        } else {
            return 0;
        }
    }

    private float waitingPrice(int minutes) {
        return minutes * WAITING_PRICE_PER_MINUTE;
    }

    private float longDistancePrice(int miles) {
        if (miles - EIGHT_MILES > 0) {
            return (miles - EIGHT_MILES) * LONG_DISTANCE_PRICE_PER_MILES;
        } else {
            return 0;
        }
    }
}
