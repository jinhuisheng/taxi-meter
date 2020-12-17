import java.math.BigDecimal;

import static java.math.BigDecimal.*;

public class TaxiMeter {
    private static final int STARTING_PRICE = 6;
    private static final int STARTING_PRICE_MILES = 2;
    private static final int EIGHT_MILES = 8;
    private final int miles;
    private final int minutes;
    private BigDecimal totalPrice;

    public TaxiMeter(int miles, int minutes) {
        totalPrice = ZERO;
        this.miles = miles;
        this.minutes = minutes;
    }

    public Integer calculate() {
        calculateMilesPrice();
        calculateWaitingMinutesPrice();
        return toInteger();
    }

    private void calculateWaitingMinutesPrice() {
        addPrice(waitingPrice(minutes));
    }

    private void calculateMilesPrice() {
        addPrice(startingPrice());
        if (miles <= STARTING_PRICE_MILES) {
            return;
        }
        addPrice(pricePerMiles(miles - STARTING_PRICE_MILES));
        if (miles > EIGHT_MILES) {
            addPrice(longDistancePrice(miles - EIGHT_MILES));
        }
    }

    private BigDecimal startingPrice() {
        return valueOf(STARTING_PRICE);
    }

    private BigDecimal waitingPrice(int minutes) {
        return valueOf(minutes).multiply(valueOf(0.25d));
    }

    private void addPrice(BigDecimal bigDecimal) {
        totalPrice = totalPrice.add(bigDecimal);
    }

    private BigDecimal longDistancePrice(int miles) {
        return valueOf(miles).multiply(valueOf(0.5d));
    }

    private BigDecimal pricePerMiles(int miles) {
        BigDecimal pricePerMiles = valueOf(0.8);
        return valueOf(miles).multiply(pricePerMiles);
    }

    private Integer toInteger() {
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
