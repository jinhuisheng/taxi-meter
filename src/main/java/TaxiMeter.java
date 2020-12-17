import java.math.BigDecimal;

public class TaxiMeter {
    public static final int STARTING_PRICE = 6;
    public static final int STARTING_PRICE_MILES = 2;
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
        BigDecimal totalPrice = BigDecimal.valueOf(STARTING_PRICE).add(addPricePerMiles(miles - STARTING_PRICE_MILES));
        return toInteger(totalPrice);
    }

    private Integer toInteger(BigDecimal totalPrice) {
        return totalPrice.intValue() + smallNumerical(totalPrice);
    }

    private int smallNumerical(BigDecimal totalPrice) {
        BigDecimal integerPrice = BigDecimal.valueOf(totalPrice.intValue());
        BigDecimal decimalPrice = totalPrice.subtract(integerPrice);
        return mod(decimalPrice);
    }

    private int mod(BigDecimal decimialMiles) {
        return decimialMiles.compareTo(BigDecimal.valueOf(0.5d)) > 0 ? 1 : 0;
    }

    private BigDecimal addPricePerMiles(int miles) {
        BigDecimal pricePerMiles = BigDecimal.valueOf(0.8);
        return BigDecimal.valueOf(miles).multiply(pricePerMiles);
    }
}
