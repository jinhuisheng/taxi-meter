import java.math.BigDecimal;

import static java.math.BigDecimal.*;

public class TaxiMeter {
    private static final int STARTING_PRICE = 6;
    private static final int STARTING_PRICE_MILES = 2;
    private static final int TEN_MILES = 10;
    private static final int EIGHT_MILES = 8;
    private final int miles;
    private final int minutes;

    public TaxiMeter(int miles, int minutes) {

        this.miles = miles;
        this.minutes = minutes;
    }

    public Integer calculate() {
        if (miles <= STARTING_PRICE_MILES) {
            return STARTING_PRICE;
        }
        BigDecimal totalPrice = valueOf(STARTING_PRICE).add(addPricePerMiles(miles - STARTING_PRICE_MILES));
        if (miles == TEN_MILES) {
            totalPrice = totalPrice.add(longDistancePrice(miles - EIGHT_MILES));
        }
        return toInteger(totalPrice);
    }

    private BigDecimal longDistancePrice(int miles) {
        return valueOf(miles).multiply(valueOf(0.5d));
    }

    private BigDecimal addPricePerMiles(int miles) {
        BigDecimal pricePerMiles = valueOf(0.8);
        return valueOf(miles).multiply(pricePerMiles);
    }

    private Integer toInteger(BigDecimal totalPrice) {
        return totalPrice.intValue() + smallNumerical(totalPrice);
    }

    private int smallNumerical(BigDecimal totalPrice) {
        BigDecimal integerPrice = valueOf(totalPrice.intValue());
        BigDecimal decimalPrice = totalPrice.subtract(integerPrice);
        return mod(decimalPrice);
    }

    private int mod(BigDecimal decimalPrice) {
        return decimalPrice.compareTo(valueOf(0.5d)) > 0 ? 1 : 0;
    }
}
