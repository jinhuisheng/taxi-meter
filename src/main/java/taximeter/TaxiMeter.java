package taximeter;

import static java.lang.Math.round;

public class TaxiMeter {

    private static final int STARTING_PRICE = 6;
    private static final float PRICE_PER_MILES = 0.8f;
    private static final int TWO_MILES = 2;
    private static final int EIGHT_MILES = 8;

    public Integer charge(int miles, int minutes) {
        float total = distancePrice(miles);
        total += waitingPrice(minutes);
        return round(total);
    }

    private float distancePrice(int miles) {
        float total = 0;
        total += startingPrice();
        if (miles > TWO_MILES) {
            total += extraMilesPrice(miles);
        }
        if (miles > EIGHT_MILES) {
            total += longDistancePrice(miles - EIGHT_MILES);
        }
        return total;
    }

    private int startingPrice() {
        return STARTING_PRICE;
    }

    private float extraMilesPrice(int miles) {
        return (miles - TWO_MILES) * PRICE_PER_MILES;
    }

    private float waitingPrice(int minutes) {
        return minutes * 0.25f;
    }

    private float longDistancePrice(int miles) {
        return miles * 0.5f;
    }
}
