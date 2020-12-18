import java.math.BigDecimal;

import static java.math.BigDecimal.valueOf;

public class MilesPrice {
    private static final int STARTING_PRICE = 6;
    private static final int STARTING_PRICE_MILES = 2;
    private static final int EIGHT_MILES = 8;
    private static final BigDecimal LONG_MILES_PRICE_RATE = valueOf(0.5d);
    private static final BigDecimal PRICE_PER_MILES = valueOf(0.8);
    private TotalPrice totalPrice;


    public MilesPrice(TotalPrice totalPrice) {
        this.totalPrice = totalPrice;
    }

    void calculateMilesPrice(int miles) {
        totalPrice.add(startingPrice());
        if (miles <= STARTING_PRICE_MILES) {
            return;
        }
        totalPrice.add(pricePerMiles(miles - STARTING_PRICE_MILES));
        if (miles > EIGHT_MILES) {
            totalPrice.add(longDistancePrice(miles - EIGHT_MILES));
        }
    }

    private BigDecimal startingPrice() {
        return valueOf(STARTING_PRICE);
    }

    private BigDecimal longDistancePrice(int beyondEightMiles) {
        return valueOf(beyondEightMiles).multiply(LONG_MILES_PRICE_RATE);
    }

    private BigDecimal pricePerMiles(int beyondTwoMiles) {
        return valueOf(beyondTwoMiles).multiply(PRICE_PER_MILES);
    }

}
