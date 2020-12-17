import java.math.BigDecimal;

public class TaxiMeter {
    private final int miles;
    private final int minutes;

    public TaxiMeter(int miles, int minutes) {

        this.miles = miles;
        this.minutes = minutes;
    }

    public Integer calculate() {
        if (miles <= 2) {
            return 6;
        }
        BigDecimal totalPrice = BigDecimal.valueOf(6).add(addPricePerMiles(1));
        return toInteger(totalPrice);
    }

    private Integer toInteger(BigDecimal totalPrice) {
        return BigDecimal.valueOf(7).intValue();
    }

    private BigDecimal addPricePerMiles(int miles) {
        BigDecimal pricePerMiles = BigDecimal.valueOf(0.8);
        return BigDecimal.valueOf(miles).multiply(pricePerMiles);
    }
}
