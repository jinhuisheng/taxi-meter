import java.math.BigDecimal;

import static java.math.BigDecimal.valueOf;

public class MilesPrice {
    private static final int STARTING_PRICE = 6;
    private static final int STARTING_PRICE_MILES = 2;
    private static final int EIGHT_MILES = 8;
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

    private BigDecimal longDistancePrice(int beyondEightMiles1) {
        return valueOf(beyondEightMiles1).multiply(valueOf(0.5d));
    }

    private BigDecimal pricePerMiles(int beyondTwoMiles1) {
        BigDecimal pricePerMiles = valueOf(0.8);
        return valueOf(beyondTwoMiles1).multiply(pricePerMiles);
    }

}
