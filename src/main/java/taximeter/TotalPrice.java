package taximeter;

import java.math.BigDecimal;

import static java.math.BigDecimal.valueOf;

public class TotalPrice {
    private BigDecimal totalPrice;

    public TotalPrice() {
        this.totalPrice = BigDecimal.ZERO;
    }

    public void add(BigDecimal bigDecimal) {
        totalPrice = totalPrice.add(bigDecimal);
    }

    Integer toInteger() {
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
